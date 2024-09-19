package com.curso.java.inicio.strings.ejercicios;

import java.util.Scanner;

public class EjercicioValidarEmail {

	public static void main(String[] args) {
		
		System.out.println("Vamos a validar un email!");
		boolean correcto = true;
		String email = "";
		
		do {
			System.out.println("Introduce el email");
			Scanner scan = new Scanner (System.in);
			email = scan.nextLine();
			
			email = email.trim();
			correcto = true;
			
			//1. Solo contiene una arroba 
			int posicion = 0, arroba = 0;
			for (posicion = 0; posicion<email.length(); posicion++) {
				if (email.charAt(posicion) == '@') {
					arroba++;
				}
				if (arroba>1) {
					System.out.println("El email es incorrecto porque contiene más de una @");
					correcto = false;
					break;
				}
			}
			if (arroba==0) {
				System.out.println("El email es incorrecto porque no contiene una @");
				correcto = false;
			}else {
				//3. Después de @ debe haber al menos un punto
				if (!email.substring(email.indexOf("@")).contains(".")) {
					System.out.println("El email es incorrecto porque no hay un punto después de la @");
					correcto = false;
				}else {
					//4. Entre @ y primer punto que esté después tiene que haber separación de al menos 2 caracteres
					for (posicion = 0; posicion<email.substring(email.indexOf("@")).length(); posicion++) {
						if (email.substring(email.indexOf("@")).charAt(posicion) == '.') {
							break;
						}
					}
					if (posicion<3) {
						System.out.println("El email es incorrecto porque no hay una separación de 2 caracteres entre la @ y el primer punto después de la @");
						correcto = false;
					}
				}
				
				//5. Después del último punto tiene que haber entre 2 y 5 caracteres
				if (email.substring(email.indexOf("@")).contains(".") && (email.substring(email.lastIndexOf(".")).length()<2 || email.substring(email.lastIndexOf(".")).length()>5)) {
					System.out.println("El email es incorrecto porque no hay entre 2 y 5 caracteres después del último punto después de la @");
					correcto = false;
					}
			}
			
			//2. No puede contener espacios en blanco
			if (email.contains(" ")) {
				System.out.println("El email es incorrecto porque contiene espacios en blanco");
				correcto = false;
			}
			
			//Si no hay error, el correo es válido
			if (correcto == true) {
				System.out.println("El email "+email+" es corecto");
			}
		}
		while (correcto == false);

	}

}
