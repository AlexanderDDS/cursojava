package com.curso.java.inicio.condicionales.ejercicios;

public class EjercicioIf {
	public static void main (String[] args) {
		
		//Variables
		String asignatura = "Histología";
		String nombreAlumno = "Regadera";
		int nota = 8;
		String resultado = "";
		
		
		//Indicar rangos de notas
		if (nota>=0 && nota<5) {
			resultado = "Insuficiente";	
		}else if (nota>=5 && nota<7) {
			resultado = "Aprobado";
		}else if (nota>=7 && nota<9) {
			resultado = "Notable";
		}else if (nota>=9 && nota<=10) {
			resultado = "Sobresaliente";
		}
		
		if (resultado != "") {
			System.out.println("La nota " + nota + " es incorrecta");
		}else {
		System.out.println("El alumno " + nombreAlumno + " en la asignatura " + asignatura + " tiene un " + resultado);
		}
	}
}