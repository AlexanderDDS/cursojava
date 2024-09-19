package com.curso.java.inicio.ejercicios;

import java.util.Scanner;

public class Ecuacion2oGrado {
	public static void main(String[] args) {
		System.out.println("Introduzca los coeficientes de una ecuación de segundo grado. Empecemos por el primer coeficiente:");
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		
		System.out.println("Introduzca el segundo coeficiente:");
		scan = new Scanner (System.in);
		int b = scan.nextInt();
		
		System.out.println("Introduzca el segundo coeficiente:");
		scan = new Scanner (System.in);
		int c = scan.nextInt();
		
		System.out.println("Tu ecuación es: "+a+"x^2 + "+b+"x + "+c+" = 0");
		
		int d = (int) Math.pow(b, 2) - 4*a*c;
		
		if (d<0) {
			System.out.println("La ecuación no tiene solución con numeros reales");
		}else {
			int x1 = (b*(-1) + (int)Math.sqrt(d))/(2*a);
			int x2 = (b*(-1) - (int)Math.sqrt(d))/(2*a);

			
			System.out.println("La solución es: x = "+x1+" y x = "+x2);
		}

	}
}
