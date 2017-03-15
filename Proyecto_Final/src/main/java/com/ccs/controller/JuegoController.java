package com.ccs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ccs.model.Juego;
import com.ccs.services.JuegoService;

@RestController
public class JuegoController {
	
	
	
	@Autowired
	private JuegoService jService;
	
	@RequestMapping(method=RequestMethod.GET,value="/juegos")
	public List<Juego> getAllGames(){
		
		List<Juego> all = new ArrayList<Juego>();
		all = jService.getAllGames();
		return all;
		
	}
	
	
	

}
