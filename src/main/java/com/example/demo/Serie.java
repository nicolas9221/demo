package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Serie {

	// Atributos

	private String nombre;
	private List<Temporada> temporadas;

	// CONTRUCTOR
	public Serie(String nombre) {
		this.nombre = nombre;
		this.temporadas = new ArrayList<>();
	}

	public void agregarTemporada(int numero) {
		this.temporadas.add(new Temporada(numero));
	}

	public String obtenerEpisodio(int numeroTemporada, int numeroEpisodio) {

		Iterator<Temporada> itTemporadas = temporadas.iterator();
		while (itTemporadas.hasNext()) {
			
			Temporada temporada = itTemporadas.next();
			boolean esMismaTemporada=temporada.getNumero() == numeroTemporada;
			
			esMismaTemporada ? temporada.obtenerNumeroEpisodio(numeroEpisodio) :  " No se Encontro Numero de Temporada ");
			
				System.out.println(temporada.toString());

		}

		return "cddcdcddc";

	}
	
	
	 
}
