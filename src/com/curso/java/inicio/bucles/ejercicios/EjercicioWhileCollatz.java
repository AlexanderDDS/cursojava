package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioWhileCollatz {

	public static void main(String[] args) {
		String respuesta = "";
		do {
			System.out.println("Introduzca un número:");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();

			while (num!=1) {
				if (num%2==0) {
					num/=2;
				}else {
					num = num*3+1;
				}
				System.out.println(num);
			}
			
			System.out.println("Deseas cotinuar?");
			scan = new Scanner(System.in);
			respuesta = scan.nextLine();
			}
		while (respuesta.equalsIgnoreCase("si"));
		
		System.out.println("Adios!");
		}
	}

