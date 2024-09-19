package com.curso.java.inicio.examen;

import java.util.Scanner;

import com.curso.java.utils.Utilidades;

public class Ejercicio2 {

	public static void pidePalabraVerificaVocal(String pregunta) {
		//Escribe un programa que pida al usuario una palabra y verifique si la primera letra es una vocal (a, e, i, o, u). Muestra un mensaje indicando si es o no una vocal.
		String palabra = Utilidades.pideDatoString(pregunta);
		char[] vocales = {'a','e','i','o','u'};
		boolean tieneVocal = false;
		for (char vocal : vocales) {
			if (palabra.toLowerCase().charAt(0)==vocal) {
				System.out.println("La primera letra de la palabra "+palabra+" es la vocal "+vocal);
				tieneVocal = true;
			}
		}
		if (tieneVocal==false) {
			System.out.println("La primera letra de la palabra "+palabra+" no es vocal");
		}
	}

}
