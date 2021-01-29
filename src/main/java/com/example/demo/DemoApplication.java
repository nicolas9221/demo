package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(DemoApplication.class, args);
		Serie serie = new Serie("Vikings");
		Temporada temporada = new Temporada(1);
		//Episodio episodio = new Episodio(1, "Bienvenido", false);

		temporada.agregarEpisodio(1, "Bienvenido", false);
		serie.agregarTemporada(1);
		
		System.out.print("Que tenemo aca ??"+serie);
		
	}
	
	public void obtenerEpisodio() {
		
	}

}
