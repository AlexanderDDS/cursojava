package com.curso.java.inicio.arrays;

import java.util.Scanner;

public class EjercicioHundirLaFlota {

	public static void main(String[] args) {
		//Matriz 5x5 donde hay barcos: 1 acorazado (definido por 1s, dos espacios), 2 destructores (definido por 2s, en un solo espacio) y un submarino (definido por 3s, en un solo espacio)
		//Tendrá 10 oportundades para hundir tus barcos, si pasadas las diez algún barco sigue en el agua el usuario pierde
		//Le pedimos a qué posición quiere atacar. A1, B2, etc. Le indicamos si ha tocado agua (0s) o si ha tocado un barco, o si ha tocado y hundido, y mostramos matriz 5x5 con la posición marcada
		int [][] tablero = new int[5][5];
		
		tablero [1][1] = 1;
		tablero [1][2] = 1;
		tablero [3][0] = 2;
		tablero [0][4] = 2;
		tablero [3][3] = 3;
		
		System.out.println("Empieza el juego de Hundir la Flota!");
		int oportunidades=10, acorazado=2, destructor=1, submarino=1, barcos=4;
		do {
			int i=0, j=0, fila=0, columna=0;
			String coordenada = "";
			System.out.print("\n");
			for (fila=0; fila<6; fila++) {
				if (fila==0) {
					while (columna<6) {
						columna++;
						if (columna==1) {
							System.out.print("  A ");
						}
						if (columna==2) {
							System.out.print("B ");
						}
						if (columna==3) {
							System.out.print("C ");
						}
						if (columna==4) {
							System.out.print("D ");
						}
						if (columna==5) {
							System.out.print("E");
						}
					}
				}
				if (fila>0) {
					for (columna=0; columna<6; columna++) {
						if (columna==0) {
							System.out.print("\n"+fila+" ");
							columna++;
						}
						if (tablero[(fila-1)][(columna-1)]==-1) {
							System.out.print("X ");
						}
						if (tablero[(fila-1)][(columna-1)]==-2) {
							System.out.print("O ");
						}
						if (tablero[(fila-1)][(columna-1)]>=0) {
							System.out.print("- ");
						}
					}
				}
			}
			System.out.println("\nTe quedan "+oportunidades+" oportunidades.");
			System.out.println("Escoge una coordenada para atacar (primero letra en minúscula para la fila, luego un número para la columna, p.ej.: a1)");
			Scanner scan = new Scanner (System.in);
			coordenada = scan.nextLine();
			if (coordenada.length()!=2) {
				System.out.println("Entrada incorrecta. Tiene que tener solo dos caracteres.");	
				continue;
			}
			if (coordenada.charAt(0)!='a'&coordenada.charAt(0)!='b'&coordenada.charAt(0)!='c'&coordenada.charAt(0)!='d'&coordenada.charAt(0)!='e') {
				System.out.println("Entrada incorrecta. Primer caracter no es a-e.");	
				continue;
			}
			if (coordenada.charAt(1)!='1'&coordenada.charAt(1)!='2'&coordenada.charAt(1)!='3'&coordenada.charAt(1)!='4'&coordenada.charAt(1)!='5') {
				System.out.println("Entrada incorrecta. Segundo caracter no es 1-5.");	
				continue;
			}
			if (coordenada.startsWith("b")) {
				j=1;
			}
			if (coordenada.startsWith("c")) {
				j=2;
			}
			if (coordenada.startsWith("d")) {
				j=3;
			}
			if (coordenada.startsWith("e")) {
				j=4;
			}
			if (coordenada.endsWith("2")) {
				i=1;
			}
			if (coordenada.endsWith("3")) {
				i=2;
			}
			if (coordenada.endsWith("4")) {
				i=3;
			}
			if (coordenada.endsWith("5")) {
				i=4;
			}
			if (tablero[i][j]==-2) {
				System.out.println("Ya habías fallado intentando esta posición...");
				continue;
			}
			if (tablero[i][j]==-1) {
				System.out.println("Ya habías acertado con esta posición...");
				continue;
			}
			if (tablero[i][j]==0) {
				System.out.println("Qué lástima! Le has dado al agua");
				tablero[i][j] = -2;
			}
			if (tablero[i][j]==1) {
				System.out.println("Le has dado al acorazado!");
				tablero[i][j] = -1;
				acorazado--;
				if (acorazado==0) {
					System.out.println("Has hundido al acorazado!");
					barcos--;
				}
			}
			if (tablero[i][j]==2) {
				System.out.println("Le has dado y has hundido a un destructor!");
				tablero[i][j] = -1;
				destructor--;
				barcos--;
			}
			if (tablero[i][j]==3) {
				System.out.println("Le has dado y has hundido al submarino!");
				tablero[i][j] = -1;
				submarino--;
				barcos--;
			}
			oportunidades--;
			if (barcos==0) {
				System.out.println("Felicidades! Has ganado!");
				break;
			}
			if (oportunidades==0) {
				System.out.println("Te has quedado sin más oportunidades!");
				break;
			}
		} while (oportunidades>=0);
		
	}

}
