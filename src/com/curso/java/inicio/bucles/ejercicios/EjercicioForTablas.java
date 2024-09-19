package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioForTablas {

	public static void main(String[] args) {
		
		int numeroTabla = 0;
		System.out.println("Vamos a ver las tablas de multiplicar");
		for (numeroTabla = 1; numeroTabla <= 10; numeroTabla++) {
			System.out.println("\nTabla de multiplicar del "+numeroTabla);
			for (int i = 0; i <= 10; i++) {
				System.out.println("\t"+numeroTabla + " X " + i + " = " + numeroTabla * i);
				
			}
			System.out.println("\n¿Quieres ver la siguiente tabla?");
			Scanner scan = new Scanner (System.in);
			String respuesta = scan.nextLine();
			if (respuesta.equalsIgnoreCase("no")) {
				System.out.println("De acuerdo, finalizando programa");
				break;
			}else if (respuesta.equalsIgnoreCase("si")) {
				continue;
			}else {
				System.out.println("\nPerdona, no te he entendido");
				break;
			}
		}

	}

}
