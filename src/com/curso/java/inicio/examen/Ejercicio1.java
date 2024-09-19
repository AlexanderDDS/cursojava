package com.curso.java.inicio.examen;

import java.util.Scanner;

import com.curso.java.utils.Utilidades;

public class Ejercicio1 {

	public static void pidePalabraCuentaPalabra(String pregunta) {
		//Escribe un programa que solicite al usuario que introduzca una palabra y luego muestre cuántas letras tiene esa palabra (sin contar espacios)
		String palabra = Utilidades.pideDatoString(pregunta);
		int longitud = palabra.length();
		System.out.println(longitud); 
	}

}
