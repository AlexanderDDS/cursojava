package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioForTenistas {

	public static void main(String[] args) {
		int numeroTotalTenistas = 0;
		int numeroTenista = 0;
		String nombreTenista = "";
		int posicionTenista = 0;
		int numeroTenistasTop10 = 0;
		int posicionMejorTenista = Integer.MAX_VALUE;
		String nombreMejorTenista = "";
		
		System.out.println("Por favor, introduzca número de tenistas:");
		Scanner scan = new Scanner (System.in);
		numeroTotalTenistas = scan.nextInt();
		
		for (numeroTenista=0; numeroTenista<numeroTotalTenistas; numeroTenista++) {
			System.out.println("Introduzca el nombre del tenista "+(numeroTenista+1));
			scan = new Scanner (System.in);
			nombreTenista = scan.nextLine();
			
			System.out.println("Introduzca la posición del ranking del tenista "+(numeroTenista+1));
			scan = new Scanner (System.in);
			posicionTenista = scan.nextInt();
			
			if (posicionTenista<=10) {
				numeroTenistasTop10++;
			}
			
			if (posicionTenista<posicionMejorTenista) {
				posicionMejorTenista = posicionTenista;
				nombreMejorTenista = nombreTenista;
			}
			
		}
		System.out.println("El mejor tenista es "+nombreMejorTenista+" con una posición de "+posicionMejorTenista);
		System.out.println("Entre estos tenistas, "+numeroTenistasTop10+" está/n dentro de los 10 mejores en el ranking");

	}

}
