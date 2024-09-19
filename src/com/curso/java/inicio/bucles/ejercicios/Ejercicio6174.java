package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio6174 {

	public static void main(String[] args) {
		// Introducir numero de 4 cifras. Se produce 2 numeros, uno con cifras en orden creciente, otro en orden decreciente. Se restan ambas cifras. El número resultante vuelve a pasar por el mismo proceso.
		// En teoría, antes de repetir el proceso 7 veces, el resultado dará 6174
		
		System.out.println("Introduce un número de 4 cifras:");
		Scanner scan = new Scanner(System.in);
		int primerNum = scan.nextInt();
		
		if (primerNum<1000 || primerNum>9999) {
			System.out.println("No se permite ese número");
		}else {
			int num = primerNum;
			int cuantasVecesBucle = 0;
			
			do {
				String number = String.valueOf(num);
				
				int digito1=0, digito2=0, digito3=0, digito4=0;
				
				for(int i=0; i<4; i++) {
				    int j = Character.digit(number.charAt(i), 10);
				    System.out.println("\tDígito "+(i+1)+": " + j);
				    
				    // Ordenar dígitos de menor a mayor
				    if (j>digito4) {
				    	digito1=digito2;
				    	digito2=digito3;
				    	digito3=digito4;
				    	digito4=j;
				    }else if (j>digito3) {
				    	digito1=digito2;
				    	digito2=digito3;
				    	digito3=j;
				    }
				    else if (j>digito2) {
				    	digito1=digito2;
				    	digito2=j;
				    }
				    else if (j>digito1) {
				    	digito1=j;
				    }		
				    System.out.println("\t"+digito1+" "+digito2+" "+digito3+" "+digito4);
				    
				}
				int numMenorAMayor = (digito1*1000)+(digito2*100)+(digito3*10)+digito4;
				int numMayorAMenor = (digito4*1000)+(digito3*100)+(digito2*10)+digito1;
				System.out.println("Número ordenado de menor a mayor: "+numMenorAMayor);
				System.out.println("Número ordenado de mayor a menor: "+numMayorAMenor);
				
				num = numMayorAMenor-numMenorAMayor;
				System.out.println(numMayorAMenor+" - "+numMenorAMayor+" = "+num);
				
				if (num==0) {
					System.out.println("No se puede continuar");
					break;
				}
				
				cuantasVecesBucle++;
			}
			while (num!=6174);
			
			System.out.println("Hemos conseguido el número "+num+" tras hacer el bucle "+(cuantasVecesBucle)+" veces");
			
		}
	}

}
