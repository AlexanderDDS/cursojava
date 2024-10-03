package com.curso.java.interfaces.ejercicios.bar;

import com.curso.java.excepciones.TooColdTemperatureException;
import com.curso.java.excepciones.TooHotTemperatureException;
import com.curso.java.utils.ConsoleColors;

public class ClienteAsiduo extends ClienteServibleCafe{
	private String mote;
	private String tipoCafePreferido;
	public ClienteAsiduo(String nombre, String mote, String tipoCafePreferido) {
		super(nombre);
		this.mote = mote;
		this.tipoCafePreferido = tipoCafePreferido;
	}
	public String getMote() {
		return mote;
	}
	public void setMote(String mote) {
		this.mote = mote;
	}
	public String getTipoCafePreferido() {
		return tipoCafePreferido;
	}
	public void setTipoCafePreferido(String tipoCafePreferido) {
		this.tipoCafePreferido = tipoCafePreferido;
	}
	@Override
	public void tomarCafe(TazaCafe tazaCafe) throws TooHotTemperatureException, TooColdTemperatureException {
		System.out.println("El cliente asiduo "+getNombre()+" \""+this.mote+"\" está tomando un "+tazaCafe.getTipoCafe());
		if (tazaCafe.getTipoCafe().equals(this.tipoCafePreferido)) {
			System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"\""+this.mote+"\" está feliz! Le hemos dado su tipo favorito de café"+ConsoleColors.RESET);
		}
		super.tomarCafe(tazaCafe);
	}
}
