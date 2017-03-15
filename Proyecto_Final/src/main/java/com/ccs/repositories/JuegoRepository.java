package com.ccs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ccs.model.Juego;

public interface JuegoRepository extends JpaRepository<Juego, String>{
	
	public Juego findByTitulo(String nombre);
	
	public List<Juego> findByPlataforma(String plataforma);
	
	@Query("SELECT (*) FROM Juego")
	public List<Juego> getAllGames();

}
