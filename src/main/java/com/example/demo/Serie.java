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

	public void agregarTemporada(int numero) {
		this.temporadas.add(new Temporada(numero));
	
	}




public String obtenerEpisodio(int numeroTemporada,int numeroEpisodio,String tituloEpisodio,boolean visto,String tituloBuscado){
    
	Episodio miEpisodio = null;
    for (Temporada temporada : this.temporadas) {
        if (temporada.getNumero() == numeroTemporada) {
            temporada.agregarEpisodio(numeroEpisodio,tituloEpisodio,visto);
            for (Episodio episodio : temporada.getEpisodios()){
                
            	
            	//if (episodio.getTitulo().equalsIgnoreCase(tituloBuscado)){
                    //miEpisodio = episodio; }
            	//else {
                    //return "No esta disponible la temporada buscada";
            	
            	episodio.getTitulo().equalsIgnoreCase(tituloBuscado) ? miEpisodio = episodio : return "No esta disponible la temporada buscada";
            }  
            
        } 
        }
    
	return miEpisodio != null ? "El episodio es: " + miEpisodio.getTitulo() + ",numero: " + miEpisodio.getNumero()
			: "No se ha encontrado el episodio";
}
}
