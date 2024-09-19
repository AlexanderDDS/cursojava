package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioWhilePintarCuadrado {

	public static void main(String[] args) {
		System.out.println("Introduzca tamaño del lado del cuadrado:");
		Scanner scan = new Scanner(System.in);
		int ladoCuadrado = scan.nextInt();

		//Cuadrado relleno
		
		int columna = 0, fila = 0;

		while (fila < ladoCuadrado) {
			while (columna < ladoCuadrado) {
				System.out.print("* ");
				columna++;
			}
			System.out.println();
			columna = 0;
			fila++;

		}

		System.out.println();
		columna = 0;
		fila = 0;
		
		//Cuadrado vacío

		while (fila == 0) {
			while (columna < ladoCuadrado) {
				System.out.print("* ");
				columna++;
			}
			fila++;
		}
		
		System.out.println();
		columna = 0;
		
		while (fila < (ladoCuadrado-1)) {
			while (columna==0) {
				System.out.print("*");
				columna++;
			}
			while (columna < (ladoCuadrado-1)) {
				System.out.print("  ");
				columna++;
			}
			while (columna==(ladoCuadrado-1)) {
				System.out.print(" *");
				columna++;
			}
			System.out.println();
			fila++;
			columna = 0;
		}
		
		while (fila == (ladoCuadrado-1)) {
			while (columna < ladoCuadrado) {
				System.out.print("* ");
				columna++;
			}
		}
	}

}
