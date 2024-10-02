package com.curso.java.interfaces.ejercicios.bar;

public class ClienteAsiduo extends ClienteServibleCafe{
	private String mote;
	public ClienteAsiduo(String nombre, String mote) {
		super(nombre);
		this.mote = mote;
	}
	public String getMote() {
		return mote;
	}
	
}
