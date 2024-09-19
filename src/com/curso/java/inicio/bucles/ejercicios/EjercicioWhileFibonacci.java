package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioWhileFibonacci {

	public static void main(String[] args) {
		long a=0, b=1, c=0, i=0, f=0;
		
		System.out.println("Introduzca una posición en la serie Fibonacci");
		Scanner scan = new Scanner (System.in);
		long p = scan.nextLong();
		
		while ((i+1)<=p) {
			f=a;
			c= a+b;
			if ((i+1)<p) {
				System.out.print(f+", ");
			}
			if ((i+1)==p) {
				System.out.print(f);
			}
			a=b;
			b=c;
			if ((i+1)==p) {
				System.out.println("\nLa posición "+p+" tiene un valor de "+f);
			}
			i++;
		}

	}

}
