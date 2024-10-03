package com.curso.java.interfaces.ejercicios.bar;

import com.curso.java.excepciones.TooColdTemperatureException;
import com.curso.java.excepciones.TooHotTemperatureException;

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
	@Override
	public void tomarCafe(TazaCafe tazaCafe) throws TooHotTemperatureException, TooColdTemperatureException {
		System.out.println("El comensal "+getNombre()+" está tomando un "+tazaCafe.getTipoCafe());
		super.tomarCafe(tazaCafe);
	}
}
