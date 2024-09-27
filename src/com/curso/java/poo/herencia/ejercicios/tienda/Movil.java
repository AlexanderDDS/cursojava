package com.curso.java.poo.herencia.ejercicios.tienda;

public class Movil extends Producto {
	private String marca;
	private String modelo;
	public Movil() {
		super();
	}
	public Movil(String ref, double precio, String marca, String modelo) {
		super(ref, precio);
		this.marca = marca;
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", precio="+this.getPrecio()+"]";
	}
	
}
