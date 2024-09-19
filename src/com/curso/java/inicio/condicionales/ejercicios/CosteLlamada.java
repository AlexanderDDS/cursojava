package com.curso.java.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class CosteLlamada {
	public static void main(String[] args) {
		
		//Variables llamada
		String dia = "";
		double coste = 0.0;
		
		System.out.println("Vamos a calcular el coste de la llamada. Por favor, esriba el día en el que se hizo la llamada:");
		Scanner scan = new Scanner(System.in);
		dia = scan.nextLine();
		
		System.out.println("Esriba la hora a la que se hizo la llamada, de 0 a 23:");
		scan = new Scanner(System.in);
		int hora = scan.nextInt();
		
		System.out.println("Esriba los minutos que duró la llamada:");
		scan = new Scanner(System.in);
		int minutos = scan.nextInt();
		
		//Coste por minutos
		if (minutos>0) {
			coste = 1.0;
		}if (minutos>5) {
			coste += 0.8;
		}if (minutos>8) {
			coste += 0.7;
		}if (minutos>10) {
			coste += 0.5*(minutos-10);
		}if (minutos<=0){
			System.out.println("Los minutos "+minutos+" son incorrectos");
		}
			
		//Precio por día y hora al añadir impuesto a coste
		if (minutos>0) {
			if (dia.equalsIgnoreCase("Domingo")) {
				coste = coste*1.03;
				System.out.println("El coste de la llamada es "+coste);
			}else if (dia.equalsIgnoreCase("Lunes") || dia.equalsIgnoreCase("Martes") || dia.equalsIgnoreCase("Miércoles") || dia.equalsIgnoreCase("Jueves") || dia.equalsIgnoreCase("Viernes") || dia.equalsIgnoreCase("Sábado")) {
				if (hora>=6 && hora<12) {
					coste = coste*1.15;
					System.out.println("El coste de la llamada es " + coste);
				}else if (hora>=12 && hora<23) {
					coste = coste*1.10;
					System.out.println("El coste de la llamada es " + coste);
				}else if ((hora>=0 && hora<6) || (hora>=23 && hora<24)) {
					coste = coste*0.9;
					System.out.println("El coste de la llamada es " + coste);
				}else {
					System.out.println("La hora "+hora+" es incorrecta");
				}
			}else {
				System.out.println("El día "+dia+" es incorrecto");
			}
		}
	}
}
