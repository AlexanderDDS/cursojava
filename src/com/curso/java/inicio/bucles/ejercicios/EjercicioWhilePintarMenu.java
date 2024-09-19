package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioWhilePintarMenu {

	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("1. Pintar cuadrado \n2. Validar email \n3. Crear alumno \n4. Salir \n\nSelecciona una opción");
			Scanner scan = new Scanner (System.in);
			num = scan.nextInt();
			
			switch (num) {
				case 1: 
				case 2:
				case 3: System.out.println("Has seleccionado "+num);continue;
				case 4: System.out.println("Adios!"); break;
			}
				
		}
		while (num<4);

	}

}
