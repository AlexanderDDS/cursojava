package com.curso.java.inicio.funciones.ejercicios;

import com.curso.java.inicio.examen.Ejercicio1;
import com.curso.java.inicio.examen.Ejercicio2;
import com.curso.java.inicio.examen.Ejercicio3;
import com.curso.java.inicio.examen.Ejercicio4;
import com.curso.java.inicio.examen.Ejercicio5;
import com.curso.java.utils.Utilidades;

public class EjerciciosExamen {

	public static void main(String[] args) {
		String[] opciones = {"Contar longitud de palabra", "Comprobar si primera letra de palabra es vocal", "Contar las palabras en una frase", "Invertir palabras en una frase" , "Ver si texto es palíndromo", "Salir"};
		boolean exit = false;
		do {
			int seleccion = Utilidades.pintaMenuPideNum(opciones, "Escoja una opción");
			switch (seleccion) {
			case 1:Ejercicio1.pidePalabraCuentaPalabra("Introduzca una palabra para contar cuántos caracteres tiene");break;
			case 2:Ejercicio2.pidePalabraVerificaVocal("Introduzca una palabra para verificar si la primera letra es vocal");break;
			case 3:Ejercicio3.pideFraseCuentaPalabras("Introduzca una frase para contar cuántas palabras tiene");break;
			case 4:Ejercicio4.pideFraseInvierteFrase("Introduzca una frase para invertir el orden de las palabras");break;
			case 5:Ejercicio5.pideTextoCompruebaPalindromo("Introduzca un texto para comprobar si es palíndromo");break;
			case 6:System.out.println("Hasta luego!");exit=true;break;
			}
		} while (exit==false);
	}

}
