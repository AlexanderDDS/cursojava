package com.curso.java.inicio.funciones.ejercicios;

import java.util.Scanner;

public class Funciones1 {

	public static void main(String[] args) {
		System.out.println("Por favor, introduzca un texto:");
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		System.out.println("El texto tiene longitud "+longitudTexto(texto));
	}
	public static int longitudTexto (String texto) {
		//Definir función que recibe un String y devuelve la longitud del String
		int longitud = texto.length();
		return longitud;
	}

}
