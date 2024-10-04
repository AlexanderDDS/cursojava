package com.curso.java.colecciones.ejercicios.juguetes;

public class Tren extends Juguete {
	private String modelo;
	public Tren(String nombre, double precio, String marca, String modelo) {
		super(nombre, precio, marca);
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Tren [modelo=" + modelo + ", nombre=" + getNombre() + ", precio=" + getPrecio() + ", marca=" + getMarca() + "]";
	}
}
