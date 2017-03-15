package com.ccs.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccs.model.Juego;
import com.ccs.repositories.JuegoRepository;
import com.ccs.repositories.PlataformaRepository;



@Service
public class JuegoService {
	
	List<Juego> listaPlat;
	
	
	@Autowired
	private JuegoRepository juegoRep;
	
	@Autowired
	private PlataformaRepository plataRepo;
	
	
	public Juego getJuego(String titulo){
		
		return juegoRep.findByTitulo(titulo);
	}
	
	public synchronized boolean deleteGame(String titulo){
		Juego juego = juegoRep.findByTitulo(titulo);
		if(juego!=null){
			juegoRep.delete(juego);
			return true;
		}
		return false;
	}
	
	List<Juego> getByPlataforma(String plataforma){
		 listaPlat = juegoRep.findByPlataforma(plataforma);
		 return listaPlat;
	}
	
	public List<Juego> getAllGames(){
		List<Juego> allGames = new ArrayList<Juego>();
		allGames.addAll(juegoRep.findAll());
		return allGames;
	}
	
}
