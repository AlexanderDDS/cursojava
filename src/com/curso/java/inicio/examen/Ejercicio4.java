package com.curso.java.inicio.examen;

import com.curso.java.utils.Utilidades;

public class Ejercicio4 {

	public static void pideFraseInvierteFrase(String pregunta) {
		//Escribe un programa que pida al usuario una frase y luego muestre la misma frase con las palabras en orden inverso.
		String frase = Utilidades.pideDatoString(pregunta);
		frase = frase.trim();
		String fraseInversa = "";
		while (frase.contains(" ")) {
			String palabra = frase.substring(frase.lastIndexOf(" ")+1);
			fraseInversa = fraseInversa+palabra+" ";
			frase = frase.substring(0,frase.lastIndexOf(" "));
		}
		fraseInversa = fraseInversa+frase;
		System.out.println(fraseInversa);
	}

}
