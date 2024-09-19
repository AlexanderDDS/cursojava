package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioForCoches {

	public static void main(String[] args) {
		System.out.println("Por favor introuzca el número de coches:");
		Scanner scan = new Scanner (System.in);
		int numeroTotalCoches = scan.nextInt();
		double velocidadMaxima = 0;
		double velocidad = 0;
		
		for (int numeroCoche=0 ; numeroCoche<numeroTotalCoches ; numeroCoche++) {
			System.out.println("Introduzca la velocidad del coche "+(numeroCoche+1)+":");
			scan = new Scanner (System.in);
			velocidad = scan.nextDouble();
			if (velocidadMaxima<velocidad) {
				velocidadMaxima = velocidad;
			}
			
			}
		System.out.println("El coche más rápido va a una velocidad de "+velocidadMaxima);
		}
	}


