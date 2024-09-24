package com.curso.java.poo.herencia.ejercicios.banda;

public abstract class Instrumento {
	private String nombre;
	private String tipo;
	private boolean afinado;
	public Instrumento(String nombre, String tipo, boolean afinado) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.afinado = afinado;
	}
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean getAfinado() {
		return afinado;
	}
	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}
	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", afinado=" + afinado + "]";
	}
	public void afinar() {
		System.out.println("Afinando instrumento "+this.nombre);
		double tuneCheck = Math.random();
		this.afinado = tuneCheck>0.4;
	}
	public void tocar() {
		System.out.println("Tocando instrumento "+this.nombre);
	}
	public abstract void limpiar();
}
