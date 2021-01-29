package com.example.demo;
public class Episodio {
	private int numero;
	private String titulo;
	private boolean visto;
	
	// el + son los metodos !
	//public tipode dato Episodio (int numero, String titulo, boolean visto){
		//}
	
	public Episodio(int numero, String titulo, boolean visto) {
		this.numero = numero;
		this.titulo = titulo;
		this.visto = visto;
		// con Episodio se instancia la clase es el constuctor de la clase !!!!!!!!!
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean isVisto() {
		return visto;
	}
	
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	
	
	// punto 2
	
	public void obtenerEpisodio(int temporada, int episodio) {
	
	
	}	
}