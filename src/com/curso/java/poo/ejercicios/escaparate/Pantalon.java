package com.curso.java.poo.ejercicios.escaparate;

public class Pantalon {
	private String color;
	private double talla;
	private double precio;
	private Boton boton;
	public Pantalon(String color, double talla, double precio, Boton boton) {
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.boton = boton;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getTalla() {
		return talla;
	}
	public void setTalla(double talla) {
		this.talla = talla;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Boton getBoton() {
		return boton;
	}
	public void setBoton(Boton boton) {
		this.boton = boton;
	}
	
}
