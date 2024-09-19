package com.curso.java.inicio.strings.ejercicios;

import java.util.Scanner;

public class EjercicioStringsSubstring {

	public static void main(String[] args) {
		//A partir de un fichero como fichero.txt, sacar dos Strings, el nombre fichero, y la extensión .txt, por las posiciones
		System.out.println("Introduce el nombre del fichero");
		Scanner scan = new Scanner (System.in);
		String fichero = scan.nextLine();
		
		fichero = fichero.replace(" ", "");
		
		System.out.println("Dentro del fichero "+fichero);
		System.out.println("El nombre sin extensión del fichero es: "+fichero.substring(0, fichero.lastIndexOf(".")));
		System.out.println("La extensión del fichero es: "+fichero.substring(fichero.lastIndexOf(".")));
		
	}

}
