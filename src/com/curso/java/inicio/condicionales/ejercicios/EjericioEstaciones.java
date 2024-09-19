package com.curso.java.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class EjericioEstaciones {
	public static void main(String[] args) {

		String mes = "";
		String estacion = "";
		
		System.out.println("Vamos a conocer a qué estación pertenece un mes. Esribe un mes");
		Scanner scan = new Scanner(System.in);
		mes = scan.nextLine();
		
		//Método 1
		if(mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero")|| mes.equalsIgnoreCase("Marzo")) {
			estacion = "Invierno";
		}else if(mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo")|| mes.equalsIgnoreCase("Junio")) {
			estacion = "Primavera";
		}else if(mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto")|| mes.equalsIgnoreCase("Septiembre")) {
			estacion = "Verano";
		}else if(mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre")|| mes.equalsIgnoreCase("Diciembre")) {
			estacion = "Otoño";
		}
		
		//Método 2
		switch (mes.toLowerCase()) {
			case "enero":
			case "febrero":
			case "marzo": estacion = "Invierno";break;
			case "abril":
			case "mayo":
			case "junio": estacion = "Primavera";break;
			case "julio":
			case "agosto":
			case "septiembre": estacion = "Verano";break;
			case "octubre":
			case "noviembre":
			case "diciembre": estacion = "Otoño";break;
		}
			
		//Método 3 más nuevo y simplificado del método 2
		switch (mes.toLowerCase()) {
			case "enero","febrero","marzo": estacion = "Invierno";break;
			case "abril","mayo","junio": estacion = "Primavera";break;
			case "julio","agosto","septiembre": estacion = "Verano";break;
			case "octubre","noviembre","diciembre": estacion = "Otoño";break;
		}
		
		//Resultado
		if (estacion.equals("")) {
			System.out.println("El mes "+mes+" es erróneo");
		}else {
			System.out.println("El mes "+mes+" está en la estación "+estacion);
		}
		
	}
}
