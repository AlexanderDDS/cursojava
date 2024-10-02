package com.curso.java.interfaces.ejercicios.bar;

public class Comensal extends ClienteServibleCafe{
	private boolean tieneReserva;
	public Comensal(String nombre, boolean tieneReserva) {
		super(nombre);
		this.tieneReserva = tieneReserva;
	}
	public boolean isTieneReserva() {
		return tieneReserva;
	}
	public void setTieneReserva(boolean tieneReserva) {
		this.tieneReserva = tieneReserva;
	}
	
}
