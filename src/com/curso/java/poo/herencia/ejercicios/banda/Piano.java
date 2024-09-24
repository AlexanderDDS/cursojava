package com.curso.java.poo.herencia.ejercicios.banda;

public class Piano extends Instrumento {
	private int nmeroOctavas;
	private String tipoPiano;
	public Piano(String nombre, String tipo, int nmeroOctavas, String tipoPiano) {
		super(nombre, tipo);
		this.nmeroOctavas = nmeroOctavas;
		this.tipoPiano = tipoPiano;
	}
	public int getNmeroOctavas() {
		return nmeroOctavas;
	}
	public void setNmeroOctavas(int nmeroOctavas) {
		this.nmeroOctavas = nmeroOctavas;
	}
	public String getTipoPiano() {
		return tipoPiano;
	}
	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}
	@Override
	public void afinar() {
		super.afinar();
		System.out.println("\tAfinando piano");
	}

}
