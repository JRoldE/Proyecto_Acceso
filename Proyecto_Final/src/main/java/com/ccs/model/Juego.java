package com.ccs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="juegos")
public class Juego {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_juego")
	private String id;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="año")
	private String anio;
	

	
	@ManyToOne
	@JoinColumn(name="plataforma_id")
	private Plataforma plataforma;
	


}
