package com.curso.java.inicio.arrays;

import java.util.Scanner;

public class EjercicioArrays3 {

	public static void main(String[] args) {
		//Pedir cuántos números se van a guardar, pedir los valores de cada número, mostrar todos los números introducidos, reordenar números de manera inversa en array, mostrar de nuevo todos los números
		System.out.println("Introduzca cuántos numeros se van a guardar:");
		Scanner scan = new Scanner (System.in);
		int cantidadNumeros = scan.nextInt();
		
		int[] numeros = new int[cantidadNumeros];
		
		for (int i=0; i<cantidadNumeros; i++) {
			System.out.println("Por favor, introduzca el número "+(i+1)+":");
			scan = new Scanner (System.in);
			numeros[i] = scan.nextInt();
		}
		
		int sumaNumeros = 0;
		System.out.println("Los números son: ");
		for (int num : numeros) {
			System.out.print(num+" ");
			sumaNumeros += num;
		}
		
		for (int i=0; i<cantidadNumeros/2; i++) {
			int temp = numeros[i];
			numeros[i] = numeros[cantidadNumeros-(i+1)];
			numeros[cantidadNumeros-(i+1)] = temp;
		}
		System.out.println("\nLos números en orden inverso son: ");
		for (int num : numeros) {
			System.out.print(num+" ");
		}
		
		int media = sumaNumeros/numeros.length;
		System.out.println("\nLa media de todos los números es "+media);
		
	}

}
