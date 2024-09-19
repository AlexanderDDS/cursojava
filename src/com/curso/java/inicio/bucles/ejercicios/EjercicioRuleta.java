package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioRuleta {

	public static void main(String[] args) {

		int modificador = 0;
		double saldo = 500.0, apuesta = 0.0;
		String respuesta = "";
		
		System.out.println("Bienvenido a la ruleta Sevillana, donde el jugador siempre gana!");
		
		do {
			//Preguntar por cuál juego va a jugar
			int opcionJuego = 0;
			do {
				System.out.println("Tienes "+saldo+" euros. Cuál juego quieres jugar? \n1. Número \n2. Par Impar \n3. Bloques");
				Scanner scan = new Scanner (System.in);
				opcionJuego = scan.nextInt();
				
				switch (opcionJuego) {
					case 1:
						System.out.println("Has elegido apostar por un número");
						modificador = 36; break;
					case 2:
						System.out.println("Has elegido apostar por par o impar");
						modificador = 2; break;
					case 3:
						System.out.println("Has elegido apostar por un bloque");
						modificador = 5; break;
				}
			}
			while (opcionJuego<1 || opcionJuego>3);
			
			//Preguntar por número para apostar (juego 1)
			int numeroRuleta = 0;
			if (opcionJuego==1) {
				do {
					System.out.println("¿Por cuál numero quieres apostar (0-36)?");
					Scanner scan = new Scanner (System.in);
					numeroRuleta = scan.nextInt();
				}
				while (numeroRuleta<0 || numeroRuleta>36);
			}
			
			//Preguntar si va a apostar a par o impar (juego 2)
			int parImpar = 0;
			if (opcionJuego==2) {
				do {
					System.out.println("¿Apuestas por par o impar? Pulsa 1 para par, 2 para impar");
					Scanner scan = new Scanner (System.in);
					parImpar = scan.nextInt();
				}
				while (parImpar<1 || parImpar>2);
			}
			
			//Preguntar por cuál bloque va a apostar (juego 3)
			int numeroBloque = 0;
			if (opcionJuego==3) {
				do {
					System.out.println("¿Por cuál bloque apuestas? Pulsa 1 para 1-12, 2 para 13-24 o 3 para 25-36");
					Scanner scan = new Scanner (System.in);
					numeroBloque = scan.nextInt();
				}
				while (numeroBloque<1 || numeroBloque>3);
			}
			
			//Preguntar por cantidad de dinero que va a apostar
			do {
				System.out.println("¿Cuánto dinero quieres apostar?");
				Scanner scan = new Scanner (System.in);
				apuesta = scan.nextInt();
				if (apuesta>saldo) {
					System.out.println("La apuesta es superior al saldo disponible ("+saldo+")");
					continue;
				}
			}
			while (apuesta<0 || apuesta>saldo);	
			
			//Generar número aleatorio
			int numeroGanador = (int) (Math.random()*37);
			System.out.println("El número ganador es "+numeroGanador);
			
			//Comprobar si salió número correcto (juego 1)
			boolean victoria = false;
			if (opcionJuego==1) {
				if (numeroRuleta==numeroGanador) {
					victoria = true;
				}
			}
			
			//Comprobar si salió par o impar (juego 2)
			if (opcionJuego==2) {
				if (parImpar==1) {
					if (numeroGanador%2==0) {
						victoria = true;
					}
				}
				if (parImpar==2) {
					if (numeroGanador%2!=0) {
						victoria = true;
					}
				}
				
			}
			
			//Comprobar si salió bloque correcto (juego 3)
			if (opcionJuego==3) {
				if (numeroBloque==1) {
					if (numeroGanador>=1 && numeroGanador<=12) {
						victoria = true;
					}
				}
				if (numeroBloque==2) {
					if (numeroGanador>=13 && numeroGanador<=24) {
						victoria = true;
					}
				}
				if (numeroBloque==3) {
					if (numeroGanador>=25 && numeroGanador<=36) {
						victoria = true;
					}
				}
				
			}
			
			// Declarar ganancia o pérdida
			if (victoria == true) {
				saldo = (saldo-apuesta)+apuesta*modificador;
				System.out.println("Felicidades, has ganado! Tu saldo es "+saldo+" euros");
			}else {
				saldo = saldo-apuesta;
				System.out.println("Lo sentimos, has perdido... Tu saldo es "+saldo+" euros");
			}
			
			//Preguntar si seguir jugando, o dejar de jugar si no queda saldo
			if (saldo>0) {
				do {
					System.out.println("¿Quieres seguir jugando?");
					Scanner scan = new Scanner(System.in);
					respuesta = scan.nextLine();
				}
				while (!respuesta.equalsIgnoreCase("si") & !respuesta.equalsIgnoreCase("no"));
				
				if (respuesta.equalsIgnoreCase("no")) {
					System.out.println("Te vas con "+saldo+" euros");break;
				}
				
			}else {
				System.out.println("Lo sentimos compañero, te has quedado sin dinero \nCuando volvamos a verte, seguro que tendrás más suerte!");
			}
		}
		while (respuesta.equalsIgnoreCase("si") & saldo>0);
		
		
	}

}