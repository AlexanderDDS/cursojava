package com.curso.java.inicio.ejercicios;

import java.util.Scanner;

public class EjercicioIntroducirNumero {

	public static void main(String[] args) {
		
		int numeroRuleta = 0;
		do {
			System.out.println("¿Por cuál numero quieres apostar (0-36)?");
			Scanner scan = new Scanner (System.in);
			numeroRuleta = scan.nextInt();
		}
		while (numeroRuleta<0 || numeroRuleta>36);
		
		System.out.println("Has apostado por "+numeroRuleta);
	}

}
