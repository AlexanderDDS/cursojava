package com.curso.java.inicio.funciones.ejercicios;

import java.util.Scanner;

public class Funciones3 {

	public static void main(String[] args) {
		System.out.println("Introduzca número para imprimir su tabla de multiplicar:");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		pintarTabla(numero);
	}
	public static void pintarTabla(int numero) {
		//Función que recibe un número y me pinta la tabla de multiplicar de ese número
		for (int i=0; i<=10; i++) {
			System.out.println(numero+"x"+i+"="+numero*i);
		}
	}
}
