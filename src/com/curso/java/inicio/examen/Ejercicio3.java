package com.curso.java.inicio.examen;

import com.curso.java.utils.Utilidades;

public class Ejercicio3 {

	public static void pideFraseCuentaPalabras(String pregunta) {
		//Escribe un programa que pida al usuario una frase y cuente cuántas palabras hay en esa frase. Puedes asumir que las palabras están separadas por un solo espacio.
		String frase = Utilidades.pideDatoString(pregunta);
		frase = frase.trim();
		int numPalabras = 1;
		while (frase.contains(" ")) {
			frase = frase.substring(frase.indexOf(" ")+1);
			numPalabras++;
		}
		System.out.println("La frase tiene "+numPalabras+" palabras.");
	}

}
