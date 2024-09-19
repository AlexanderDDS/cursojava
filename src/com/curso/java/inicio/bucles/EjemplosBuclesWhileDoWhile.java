package com.curso.java.inicio.bucles;

public class EjemplosBuclesWhileDoWhile {

	public static void main(String[] args) {
		// Bucle while
		int numero = 0;
		while (numero < 10) {
			System.out.println(numero);
			numero += 3;

		}
		
		// Bucle do-while
		String respuesta = "";
		do {
			System.out.println("Deseas continuar?");
		}while (respuesta.equals("si"));

	}

}
