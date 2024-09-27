package com.curso.java.poo.herencia.ejercicios.tienda;

public abstract class Producto {
	private String ref;
	private double precio;
	public Producto() {
		
	}
	public Producto(String ref, double precio) {
		super();
		this.ref = ref;
		this.precio = precio;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
