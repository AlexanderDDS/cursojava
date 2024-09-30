package com.curso.java.poo.herencia.ejercicios.hospital;

public class Habitacion {
	private int numero;
	private Enfermo enfermo;
	public Habitacion(int numero) {
		super();
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public Enfermo getEnfermo() {
		return enfermo;
	}
	public void setEnfermo(Enfermo enfermo) {
		this.enfermo = enfermo;
	}
	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", enfermo=" + enfermo + "]";
	}
}
