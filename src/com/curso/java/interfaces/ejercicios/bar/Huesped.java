package com.curso.java.interfaces.ejercicios.bar;

public class Huesped extends Cliente {
	private String dni;
	public Huesped(String nombre, String dni) {
		super(nombre);
		this.dni = dni;
	}
	public String getDni() {
		return dni;
	}
	
}
