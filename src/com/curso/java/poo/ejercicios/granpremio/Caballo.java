package com.curso.java.poo.ejercicios.granpremio;

public class Caballo {
	private String id;
	private String nombre;
	private int numero;
	private int edad;
	private double velocidad;
	private double peso;
	private double posicion;
	
	public Caballo(String id, String nombre, int numero, int edad, double velocidad, double peso) {
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
		this.edad = edad;
		this.velocidad = velocidad;
		this.peso = peso;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPosicion() {
		return posicion;
	}
	public void setPosicion(double posicion) {
		this.posicion = posicion;
	}
	
	public void correr() {
		double distanciaAvanzada = this.velocidad*(Math.random()*5+15)-this.peso*(Math.random()+0.5)-this.edad*(Math.random()*20+1);
		double fatiga=1.0;
		if (this.posicion>2000) {
			if (this.velocidad>=70) {
				fatiga*=0.95;
			}
		}
		if (this.posicion>4000) {
			if (this.velocidad>=65) {
				fatiga*=0.90;
			}
		}
		if (this.posicion>6000) {
			if (this.velocidad>=60) {
				fatiga*=0.85;
			}
		}
		if (this.posicion>10000) {
			if (this.velocidad>=50) {
				fatiga*=0.75;
			}
		}
		if (this.posicion>15000) {
			if (this.velocidad>=45) {
				fatiga*=0.50;
			}
		}
		this.posicion += distanciaAvanzada*fatiga;
		System.out.println("["+this.numero+"] "+this.nombre+" avanza "+(int)distanciaAvanzada+"m y lleva "+(int)this.posicion+"m recorridos");
	}
}
