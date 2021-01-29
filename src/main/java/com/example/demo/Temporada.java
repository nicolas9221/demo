package com.example.demo;
import java.util.List;
public class Temporada {
	// Atributos
	int numero;
	private List<Episodio> episodios;
	// Constructor
	public Temporada(int numero, List<Episodio> episodios) {
		this.numero = numero;
		this.episodios = episodios;
	}
	public Temporada(int numero2) {
			this.numero = numero2;
	}
	// Metodos
	public void agregarEpisodio(int numero, String titulo, boolean visto) {
		Episodio episodio = new Episodio(numero, titulo, visto);
		this.episodios.add(episodio);
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public List<Episodio> getEpisodios() {
		return episodios;
	}
	public void setEpisodios(List<Episodio> episodios) {
		this.episodios = episodios;
	}
}
