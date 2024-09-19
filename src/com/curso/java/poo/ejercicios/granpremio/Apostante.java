package com.curso.java.poo.ejercicios.granpremio;

public class Apostante {
	private String nombre;
	private double saldo;
	private double apuesta;
	public Apostante(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getApuesta() {
		return apuesta;
	}
	public void setApuesta(double apuesta) {
		this.apuesta = apuesta;
	}
	
}
