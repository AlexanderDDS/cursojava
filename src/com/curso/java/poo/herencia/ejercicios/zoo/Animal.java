package com.curso.java.poo.herencia.ejercicios.zoo;

public abstract class Animal {
	private String id;
	private String nombre;
	private double peso;

	public Animal(String id, String nombre, double peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.peso = peso;
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void beber() {
		System.out.println("El animal "+nombre+" está bebiendo");
	}
	public void comer() {
		System.out.println("El animal "+nombre+" está comiendo");
	}
}
