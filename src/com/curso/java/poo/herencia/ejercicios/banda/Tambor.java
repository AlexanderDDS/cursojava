package com.curso.java.poo.herencia.ejercicios.banda;

public class Tambor extends Instrumento {
	private String material;
	public Tambor(String nombre, String tipo, String material) {
		super(nombre, tipo);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public void afinar() {
		System.out.println("Afinando tambor");
		this.setAfinado(true);
	}
	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
	}
	public void aporrear() {
		System.out.println("Aporreando tambor");
	}
}
