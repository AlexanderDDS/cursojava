package com.curso.java.interfaces;

import com.curso.java.poo.herencia.ejercicios.banda.Guitarra;
import com.curso.java.poo.herencia.ejercicios.banda.Instrumento;

public class PruebaInterfaces {

	public static void main(String[] args) {
		Saxofon saxo = new Saxofon("saxo1", "saxo1", true);
		Guitarra guitarra = new Guitarra("Guitarra", "guitarra1", 6);
		
		PruebaInterfaces pi = new PruebaInterfaces();
		pi.limpiar(saxo);
		pi.limpiar(guitarra);
		
		pi.vender(saxo);
	}
	public void limpiar (Instrumento instrumento) {
		instrumento.limpiar();
	}
	public void vender(Vendible vendible) {
		vendible.vender();
	}
}
