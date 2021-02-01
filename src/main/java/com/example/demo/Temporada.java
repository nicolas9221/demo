package com.example.demo;
import java.util.ArrayList;
import java.util.List;
public class Temporada {
	
	
	// Atributos
	
	int numero;
	private List<Episodio> episodios;

	public Temporada(int numero2)
	{
			this.numero = numero2;
			this.episodios = new ArrayList<>();
	}
	
	
	// Metodos
	
	public void agregarEpisodio(int numero, String titulo, boolean visto) {
		Episodio episodio = new Episodio(numero, titulo, visto);
		this.episodios.add(episodio);
	}
	public int getNumero()
	{
		return numero;
	}
	public void setNumero(int numero)
	{
		this.numero = numero;
	}
	public List<Episodio> getEpisodios()
	{
		return episodios;
	}
	public void setEpisodios(List<Episodio> episodios)
	{
		this.episodios = episodios;
	}

	public Episodio obtenerEpisodio(int numeroEpisodio){
		Episodio miEpisodio = null;
		for (int i = 0; i<this.episodios.size(); i++ ){
			if(episodios.get(i).getNumero() == numeroEpisodio) {
					miEpisodio = episodios.get(i);
			}
		}
		return miEpisodio;
	}


}
