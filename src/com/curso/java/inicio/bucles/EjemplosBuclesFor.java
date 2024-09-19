package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjemplosBuclesFor {

	public static void main(String[] args) {
		/* int numeroTabla = 3;
		for (int i = 1; i <= 10; i++) {
			System.out.println(numeroTabla + " X " + i + " = " + numeroTabla * i);
		}

		System.out.println("FIN"); */

		// Intro
		System.out.println("¡Hola! Vamos a calcular la nota de tres estudiantes distintos");

		// Introducir datos alumno A
		Scanner scan = new Scanner(System.in);
		int numeroEstudiantes = 1;
		for (numeroEstudiantes = 1; numeroEstudiantes <= 3; numeroEstudiantes++) {
			System.out.println("Introduzca el nombre del estudiante " + numeroEstudiantes + ":");
			scan = new Scanner(System.in);
			String nombreAlumno = scan.nextLine();
			nombreAlumno = nombreAlumno + numeroEstudiantes;
		}

	}

}
