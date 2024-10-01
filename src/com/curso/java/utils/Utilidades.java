package com.curso.java.utils;

import java.util.Scanner;

public class Utilidades {

	public static int pideDatoNumerico(String pregunta) {
		/**
		Función que necesita una pregunta y devuelve un número que introduzca usuario
		@param String pregunta
		@return int
		*/
		System.out.println(pregunta);
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		return numero;
	}
	public static double pideDatoDouble(String pregunta) {
		/**
		Función que necesita una pregunta y devuelve un double que introduzca usuario
		@param String pregunta
		@return double
		*/
		System.out.println(pregunta);
		Scanner scan = new Scanner(System.in);
		double numeroDouble = scan.nextDouble();
		return numeroDouble;
	}
	public static String pideDatoString(String pregunta) {
		/**
		Función que necesita una pregunta al usuario y devuelve un String que introduzca usuario
		@param String pregunta
		@return String
		*/
		System.out.println(pregunta);
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		return texto;
	}
	public static void pintaMenu(String[] opciones) {
		//Pasar varios String y que pinte la información que le pasamos. En un solo parametro recibir todas las opciones del menu (array, duh)
		int i=0;
		for (String opcion : opciones) {
			if (opcion!=null) {
				System.out.println((i+1)+". "+opcion);
				i++;
			}
		}
	}
	public static int pintaMenuPideNum(String opcion, String pregunta) {
		int seleccion = 0;
		do {
			System.out.println("1. "+opcion);
			seleccion = pideDatoNumerico(pregunta);
			if (seleccion!=1) {
				System.out.println("Opción incorrecta, escoja de nuevo");
			}
		}while (seleccion!=1);
		return seleccion;
	}
	public static int pintaMenuPideNum(String[] opciones, String pregunta) {
		int seleccion = 0;
		do {
			pintaMenu(opciones);
			seleccion = pideDatoNumerico(pregunta);
			if (seleccion<=0||seleccion>opciones.length) {
				System.out.println("Opción incorrecta, escoja de nuevo");
			}
		}while (seleccion<=0||seleccion>opciones.length);
		return seleccion;
	}
	public static void pintaTabla(int numero) {
		//Función que recibe un número y me pinta la tabla de multiplicar de ese número
		for (int i=0; i<=10; i++) {
			System.out.println(numero+"x"+i+"="+numero*i);
		}
	}
	public static void pideNumPintaTabla() {
		int numero = pideDatoNumerico("Escoja un número");
		pintaTabla(numero);
	}
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}
}
