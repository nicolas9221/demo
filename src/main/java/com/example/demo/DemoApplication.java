package com.example.demo;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class DemoApplication {
	
	
	  public static void main(String[] args) {
	       Serie serie = new Serie("karate kid");
	       int numeroTemporada = 2;
	       int numeroEpisodio = 1;
	       String tituloEpisodio = "primer acto";
	       String tituloBuscado = "segundo acto";
	       serie.agregarTemporada(numeroTemporada);
	       boolean visto = true;
	       
	       String respuesta = serie.obtenerEpisodio(numeroEpisodio,numeroTemporada);
	       System.out.println(respuesta);
	    }
	}
	







































//	public static void main(String[] args) {
//
//		Temporada temporada1 = new Temporada(1);
//		temporada1.agregarEpisodio(1,"hola",false);
//		temporada1.agregarEpisodio(2,"chau",true);
//		temporada1.agregarEpisodio(3,"hohohoho",true);
//
//		Temporada temporada2 = new Temporada(1);
//		temporada2.agregarEpisodio(1,"como andas?",false);
//
//		Temporada temporada3 = new Temporada(1);
//		temporada3.agregarEpisodio(1,"nos vimos",false);
//		temporada3.agregarEpisodio(2,"en el prox le ayudamo a AXel",true);
//		int numeroEpisodio = 1;
//		int numeroTemporada = 1;
//		Temporada t = obtenerDatosSolictados(numeroEpisodio,numeroTemporada);
//
//			
//		
//	}
//
//	private static  Temporada obtenerDatosSolictados(int i, int i1) {
//		return null;
//		
//		
//	}
//	
//	
//	
//
//	private static void imprimirDatos(Temporada t, int numeroEpisodio) {
//		System.out.println("El episodio : " +t.obtenerEpisodio(numeroEpisodio).getTitulo()+ "Se vio en la temporada :"+ t.getNumero() );
//	}
//
//
//
//}
