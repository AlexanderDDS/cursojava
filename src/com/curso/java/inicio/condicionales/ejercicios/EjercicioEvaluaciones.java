package com.curso.java.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class EjercicioEvaluaciones {
	public static void main(String[] args) {
		
		// Intro
		System.out.println("¡Hola! Vamos a calcular la nota de tres estudiantes distintos");	
		
		// Introducir datos alumno A
		
		for (int numeroEstudiantes=1 ; numeroEstudiantes<=3 ; numeroEstudiantes++) {
			System.out.println("Introduzca el nombre del estudiante "+numeroEstudiantes+":");
			Scanner scan = new Scanner(System.in);
			String nombreAlumno = scan.nextLine();
			nombreAlumno = nombreAlumno + numeroEstudiantes;
		}
		
		System.out.println("Introduzca el nombre del primer estudiante:");
		Scanner scan = new Scanner(System.in);
		String nombreAlumnoA = scan.nextLine();
		
		System.out.println("Introduzca la nota del primer examen de "+nombreAlumnoA+":");
		scan = new Scanner(System.in);
		int notaExamen1AlumnoA = scan.nextInt();

		System.out.println("Introduzca la nota del segundo examen de "+nombreAlumnoA+":");
		scan = new Scanner(System.in);
		int notaExamen2AlumnoA = scan.nextInt();

		System.out.println("Introduzca la nota del primer proyecto de "+nombreAlumnoA+":");
		scan = new Scanner(System.in);
		int notaProyecto1AlumnoA = scan.nextInt();

		System.out.println("Introduzca la nota del segundo proyecto de "+nombreAlumnoA+":");
		scan = new Scanner(System.in);
		int notaProyecto2AlumnoA = scan.nextInt();

		System.out.println("Introduzca la nota de la participación de "+nombreAlumnoA+":");
		scan = new Scanner(System.in);
		int notaParticipacionAlumnoA = scan.nextInt();
		
		// Valoración
		int notaMediaExamenesAlumnoA = (notaExamen1AlumnoA + notaExamen2AlumnoA)/2;
		if (notaMediaExamenesAlumnoA<50) {
			System.out.println(nombreAlumnoA+" está suspenso al no superar el 50% en la media de ambos exámenes");
		}else {
			int notaFinalAlumnoA = notaExamen1AlumnoA/4 + notaExamen2AlumnoA/4 + notaProyecto1AlumnoA/5 + notaProyecto2AlumnoA/5 + notaParticipacionAlumnoA/10;
			System.out.println("La nota de "+nombreAlumnoA+" previa a las modificaciones es "+notaFinalAlumnoA);
			
			int notaMediaProyectosAlumnoA = (notaProyecto1AlumnoA + notaProyecto2AlumnoA)/2;
			if (notaMediaProyectosAlumnoA>=90 && notaParticipacionAlumnoA>=70) {
				notaFinalAlumnoA = notaFinalAlumnoA * 105/100;
			}else if (notaParticipacionAlumnoA<30) {
				notaFinalAlumnoA = notaFinalAlumnoA * 90/100;
			}
			
			if (notaFinalAlumnoA>=0 && notaFinalAlumnoA<50) {
				System.out.println(nombreAlumnoA+" suspende con la nota "+notaFinalAlumnoA);
			}else if (notaFinalAlumnoA>=50 && notaFinalAlumnoA<=100) {
				System.out.println(nombreAlumnoA+" aprueba con la nota "+notaFinalAlumnoA);
			}else {
			System.out.println("La nota de "+nombreAlumnoA+" es incorrecta");
			}
		}

	}
}
