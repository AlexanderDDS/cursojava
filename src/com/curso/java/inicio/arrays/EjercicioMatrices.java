package com.curso.java.inicio.arrays;

public class EjercicioMatrices {

	public static void main(String[] args) {
		int [][] notas = new int [2][3];
		notas [0][0] = 2;
		notas [0][1] = 5;
		notas [0][2] = 6;
		notas [1][0] = 7;
		notas [1][1] = 3;
		notas [1][2] = 9;
		
		for (int i=0; i<notas.length; i++) {
			for (int j=0; j<notas[i].length; j++) {
				System.out.print(notas[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		System.out.println("======");
		
		for (int[] fila : notas) {
			for (int nota : fila) {
				System.out.print(nota+" ");
			}
			System.out.print("\n");
		}

	}

}
