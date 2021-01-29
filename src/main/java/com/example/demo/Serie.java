package com.example.demo;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Serie {
	// Atributos
	private String nombre;
	private List<Temporada> temporadas;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Temporada> getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(List<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	// CONTRUCTOR
	public Serie(String nombre) {
		this.nombre = nombre;
		this.temporadas = new ArrayList<>(); // punto 1 A, hay que inicializar o no ?
	}
//	a)La lista de temporadas debe ser inicializada vacía dentro del constructor.
	// b)El método agregarTemporadadebe crear y agregar una nueva temporada
	// utilizando el número de temporada recibido por parámetro.
//Puede suponer que no se agregarán temporadas con el mismo número.
	// Metodos
	public void agregarTemporada(int numero) {
		Temporada temporada = new Temporada(numero);
// TENEMOS SERIAS DUDAS
	}
}