package com.curso.java.inicio.arrays;

import java.util.Scanner;

public class EjercicioMatrices2 {

	public static void main(String[] args) {
		//Hacer matriz 4x4, pedir valor de cada posición, mostrar matriz, invertir posición de diagonal izq-sup a der-inf, y mostrar matriz de nuevo
		int [][] numeros = new int[4][4];
		System.out.println("Vamos a rellenar una matriz 4x4.");
		for (int i=0; i<numeros.length; i++) {
			for (int j=0; j<numeros[i].length; j++) {
				System.out.print("Introduzca la posición "+i+", "+j);
				Scanner scan = new Scanner (System.in);
				numeros[i][j] = scan.nextInt();
			}
		}
		for (int[] filas : numeros) {
			for (int num : filas) {
				System.out.print(num+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Los números de la diagonal son: ");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i][i]+" ");
		}
		for (int i=0; i<numeros.length/2; i++) {
			int temp = numeros[i][i];
			numeros[i][i] = numeros[numeros.length-(i+1)][numeros.length-(i+1)];
			numeros[numeros.length-(i+1)][numeros.length-(i+1)] = temp;
		}
		System.out.println("\n=========");
		for (int[] filas : numeros) {
			for (int num : filas) {
				System.out.print(num+" ");
			}
			System.out.print("\n");
		}
	}

}
