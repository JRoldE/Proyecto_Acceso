package com.ccs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
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
	
	//La clave primaria debe ser la misma para que funcione la persistencia
	@OneToOne
	@PrimaryKeyJoinColumn
	private Analisis analisis;
	
	
	
	
	
	

	public Juego() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Juego(String id, String titulo, String anio, Plataforma plataforma, Analisis analisis) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.anio = anio;
		this.plataforma = plataforma;
		this.analisis = analisis;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public Analisis getAnalisis() {
		return analisis;
	}

	public void setAnalisis(Analisis analisis) {
		this.analisis = analisis;
	}
	
	
	


}
