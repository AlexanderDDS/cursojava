package com.curso.java.poo.herencia.ejercicios.tienda;

public class Ropa extends Producto {
	private double talla;
	private String color;
	public Ropa() {
		super();
	}
	public Ropa(String ref, double precio, double talla, String color) {
		super(ref, precio);
		this.talla = talla;
		this.color = color;
	}
	public double getTalla() {
		return talla;
	}
	public void setTalla(double talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Ropa [talla=" + talla + ", color=" + color + ", precio=" + getPrecio() + "]";
	}
	
}
