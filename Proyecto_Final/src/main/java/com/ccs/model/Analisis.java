package com.ccs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="analisis")
public class Analisis {
	@Id
	@Column(name="id_ana")
	private String id_analisis;
	
	@Column(name="texto")
	private String texto_analisis;
	
	@Column(name="nota")
	private String nota;
	
	
	//¿Misma clave primaria?
	@OneToOne
	@PrimaryKeyJoinColumn
	private Juego juego;
	
	


	public Analisis() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Analisis(String id_analisis, String texto_analisis, String nota, Juego juego) {
		super();
		this.id_analisis = id_analisis;
		this.texto_analisis = texto_analisis;
		this.nota = nota;
		this.juego = juego;
	}


	public String getId_analisis() {
		return id_analisis;
	}


	public void setId_analisis(String id_analisis) {
		this.id_analisis = id_analisis;
	}


	public String getTexto_analisis() {
		return texto_analisis;
	}


	public void setTexto_analisis(String texto_analisis) {
		this.texto_analisis = texto_analisis;
	}


	public String getNota() {
		return nota;
	}


	public void setNota(String nota) {
		this.nota = nota;
	}


	public Juego getJuego() {
		return juego;
	}


	public void setJuego(Juego juego) {
		this.juego = juego;
	}
	
	
	
	

}
