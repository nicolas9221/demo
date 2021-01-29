package com.example.demo;
import java.util.ArrayList;
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

	public void agregarTemporada(Temporada temporada) {
		this.temporadas.add(temporada);
	}
}