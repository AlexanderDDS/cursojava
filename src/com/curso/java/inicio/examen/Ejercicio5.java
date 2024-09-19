package com.curso.java.inicio.examen;

import com.curso.java.utils.Utilidades;

public class Ejercicio5 {

	public static void pideTextoCompruebaPalindromo(String pregunta) {
		//Escribe un programa que pida al usuario una palabra o frase y determine si es un palíndromo.
		String texto = Utilidades.pideDatoString(pregunta);
		//Dejar el texto como una cadena de caracteres en minúscula sin espacios o signos de puntuación
		texto = texto.toLowerCase().replace(" ","").replace(",", "").replace(".", "").replace("!", "").replace("?", "").replace("¡", "").replace("¿", "");
		//Crear texto inverso para comparar
		String textoInverso = "";
		char[] ch = texto.toCharArray();
		for (int i = ch.length-1; i>=0; i--) {
			textoInverso += ch[i];
	    }
		//Comparar texto con texto inverso
		if (texto.equals(textoInverso)) {
			System.out.println("El texto es un palíndromo!");
		}else {
			System.out.println("El texto no es un palíndromo...");
		}
	}

}
