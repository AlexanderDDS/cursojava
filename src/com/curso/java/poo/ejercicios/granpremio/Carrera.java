package com.curso.java.poo.ejercicios.granpremio;

public class Carrera {
	private String id;
	private String nombre;
	private Caballo[] caballos;
	private double distancia;
	public Carrera(String id, String nombre, Caballo[] caballos, double distancia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.caballos = caballos;
		this.distancia = distancia;
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
	public Caballo[] getCaballos() {
		return caballos;
	}
	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public Caballo iniciarCarrera() {
		System.out.println("\tComienza la carrera "+this.nombre+" de "+(int)this.distancia+"m!");
		Caballo caballoGanador = null;
		boolean hayGanador = false;
		while (!hayGanador) {
			for (Caballo caballo : caballos) {
				caballo.correr();
				if (caballo.getPosicion()>=distancia) {
					caballoGanador = caballo;
					hayGanador=true;
					System.out.println("El caballo ganador es ["+caballoGanador.getNumero()+"] "+caballoGanador.getNombre()+"!");
					break;
				}
			}
		}
		for (Caballo caballo : caballos) {
			caballo.setPosicion(0.0);
		}
		return caballoGanador;
	}
}
