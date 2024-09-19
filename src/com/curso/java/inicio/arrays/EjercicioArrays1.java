package com.curso.java.inicio.arrays;

public class EjercicioArrays1 {

	public static void main(String[] args) {
		// Definir un array de enteros de longitud 3
		int[] numeros = new int[3];
		
		// Vais a dar valores de cada posición de uno en uno (o por scanner)
		numeros[0] = 12;
		numeros[1] = 26;
		numeros[2] = 85;
		
		//Mostrar de dos maneras: uno por uno, o desde un bucle
		/*
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		*/
		
		for (int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		//Calcular media de todos los números en el array
		int sumaNumeros = 0;
		for (int num : numeros) {
			sumaNumeros += num;
		}
		int media = sumaNumeros/numeros.length;
		System.out.println(media);
	}

}
