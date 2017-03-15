package com.ccs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccs.model.Plataforma;

public interface PlataformaRepository extends JpaRepository<Plataforma, String>{
	
	public List<Plataforma> findByNombre(String nombre);
}
