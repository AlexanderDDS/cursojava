package com.curso.java.poo.ejercicios.granpremio;

public class GranPremio {
	private String id;
	private String nombre;
	private Carrera[] carreras;
	public GranPremio(String id, String nombre, Carrera[] carreras) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carreras = carreras;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Carrera[] getCarreras() {
		return carreras;
	}
	public void setCarreras(Carrera[] carreras) {
		this.carreras = carreras;
	}
	
}
