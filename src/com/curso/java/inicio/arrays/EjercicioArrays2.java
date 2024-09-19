package com.curso.java.inicio.arrays;

import java.util.Scanner;

public class EjercicioArrays2 {

	public static void main(String[] args) {
		//Definir un array de nombres de alumnos de longitud que se pregunta. Mostrar solo aquellos alumnos que contengan una 'a' en el nombre
		System.out.println("Por favor, introduzca el número de alumnos");
		Scanner scan = new Scanner (System.in);
		int numeroAlumnos = scan.nextInt();
		
		String[] nombresAlumnos = new String[numeroAlumnos];
		
		for (int i=0; i<numeroAlumnos; i++) {
			System.out.println("Por favor, introduzca el nombre del alumno "+(i+1));
			scan = new Scanner (System.in);
			nombresAlumnos[i] = scan.nextLine();
		}
		
		System.out.println("\nNombres que contienen la letra A:");
		for (String nombre : nombresAlumnos) {
			if (nombre.toLowerCase().contains("a")) {
				System.out.println("\t"+nombre);
			}
		}
	}

}
