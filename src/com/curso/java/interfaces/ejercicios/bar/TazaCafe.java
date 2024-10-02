package com.curso.java.interfaces.ejercicios.bar;

public class TazaCafe {
	private String tipoCafe;
	private double temperatura;
	public TazaCafe(String tipoCafe) {
		super();
		this.tipoCafe = tipoCafe;
		this.temperatura = Math.random()*100;
	}
	public String getTipoCafe() {
		return tipoCafe;
	}
	public double getTemperatura() {
		return temperatura;
	}
	
}
