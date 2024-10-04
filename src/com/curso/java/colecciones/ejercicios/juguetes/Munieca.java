package com.curso.java.colecciones.ejercicios.juguetes;

public class Munieca extends Juguete {
	private String color;
	public Munieca(String nombre, double precio, String marca, String color) {
		super(nombre, precio, marca);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Muñeca [color=" + color + ", nombre=" + getNombre() + ", precio=" + getPrecio() + ", marca=" + getMarca() + "]";
	}
}
