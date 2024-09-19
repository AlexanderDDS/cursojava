package com.curso.java.inicio.funciones.ejercicios;

import java.util.Scanner;

public class Funciones2 {

	public static void main(String[] args) {
		System.out.println("Introduzca un texto a mostrar:");
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		System.out.println("Introduzca número de veces a repetir el texto:");
		scan = new Scanner(System.in);
		int repeticiones = scan.nextInt();
		pintarTexto(texto, repeticiones);
		
	}
	public static void pintarTexto(String texto, int repeticiones) {
		//Función que recibe un número y un texto y me va a pintar el texto que le pasemos el número de veces indicado por el número 
		for (int i=0; i<repeticiones; i++) {
			System.out.println(texto);
		}
	}
}
