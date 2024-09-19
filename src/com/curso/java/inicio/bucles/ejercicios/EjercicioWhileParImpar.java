package com.curso.java.inicio.bucles.ejercicios;

public class EjercicioWhileParImpar {

	public static void main(String[] args) {
		
		int par = 0, impar = 0, a=2, b=99;
		
		while (a<=100 && b>=1) {
			if (a%2==0) {
				par = a;
			}else {
				par=0;
			}
			
			if (b%2!=0) {
				impar = b;
			}else {
				impar=0;
			}
			if (par!=0 && impar!=0) {
				System.out.println(par+","+impar);
			}
			a++; b--;
		}
	
	}

}

