package com.ccs.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="plataformas")
public class Plataforma {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="plataforma_id")
	private String id;
	
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(cascade= CascadeType.ALL,mappedBy="plataforma")
	private List<Juego> juegos;
	

}