package com.curso.java.poo.ejercicios.cine;

import com.curso.java.utils.Utilidades;

public class CineMainUtilidades {
	public static int[] verUbicacionEspectador(Sala sala, Espectador espectador) {
		int i=0, j=0;
		boolean conseguido = false;
		for (i=0; i<sala.getButacas().length; i++) {
			for (j=0; j<sala.getButacas()[i].length; j++) {
				if (sala.getButacas()[i][j]==espectador) {
					conseguido=true;
					break;
				}
			}
			if (conseguido) {
				break;
			}
		}
		int[] ubicacionEspectador = {i+1, j+1};
		return ubicacionEspectador;
	}
	public static Espectador[] verEspectadoresSala(Sala sala) {
		int butacasOcupadas = verButacasOcupadas(sala);
		Espectador[] espectadores = new Espectador[butacasOcupadas];
		int i=0;
		for (Espectador[] fila : sala.getButacas()) {
			for (Espectador butaca : fila) {
				if (butaca!=null) {
					espectadores[i] = butaca;
					i++;
				}
			}
		}
		return espectadores;
	}
	public static int numeroButacasTotales(Sala sala) {
		int butacasTotales=0;
		for (Espectador[] fila : sala.getButacas()) {
			butacasTotales+=fila.length;
		}
		return butacasTotales;
	}
	public static int verNumeroButacasVacias(Sala sala) {
		int butacasVacias=0;
		for (Espectador[] fila : sala.getButacas()) {
			for (Espectador butaca : fila) {
				if (butaca==null) {
					butacasVacias++;
				}
			}
		}
		return butacasVacias;
	}
	public static int verButacasOcupadas(Sala sala) {
		int butacasTotales = numeroButacasTotales(sala);
		int butacasVacias = verNumeroButacasVacias(sala);
		int butacasOcupadas = butacasTotales - butacasVacias;
		return butacasOcupadas;
	}
	public static int verNumeroSalasLibres(Cine cine, int numeroEntradas) {
		int numSalasLibres=0;
		for (Sala sala : cine.getSalas()) {
			int butacasVacias = verNumeroButacasVacias(sala);
			if (butacasVacias>=numeroEntradas) {
				numSalasLibres++;
			}
			butacasVacias=0;
		}
		return numSalasLibres;
	}
	public static Sala[] obtenerSalasDisponibles(Cine cine, int numeroEntradas, int numeroSalasLibres) {
		Sala[] salasLibres = new Sala[numeroSalasLibres];
		int i=0, butacasVacias=0;
		for (Sala sala : cine.getSalas()) {
			butacasVacias = verNumeroButacasVacias(sala);
			if (butacasVacias>=numeroEntradas) {
				salasLibres[i]=sala;
				i++;
			}
			butacasVacias=0;
		}
		return salasLibres;
	}
	public static String[] obtenerTitulosPeliculasDeSalas(Sala[] salas) {
		String[] peliculasDisponibles = new String[salas.length];
		int i=0;
		for (Sala sala : salas) {
			peliculasDisponibles[i] = sala.getTituloPelicula();
			i++;
		}
		return peliculasDisponibles;
	}
	public static void pintaButacas(Sala sala) {
		System.out.println("Aquí puede ver las butacas disponibles (_) en la sala "+sala.getNumero()+" para la película "+sala.getTituloPelicula());
		System.out.println("");
		int fila=0, columna=0, filas=sala.getButacas().length, columnas=sala.getButacas()[fila].length;
		for (fila=0; fila<=filas; fila++) {
			if (fila==0) {
				System.out.print("  ");
				for (columna=0; columna<columnas; columna++) {
					System.out.print((columna+1)+" ");
				}
			}
			if (fila>0) {
				System.out.print("\n"+fila+" ");
				for (columna=0; columna<columnas; columna++) {
					if (sala.getButacas()[fila-1][columna]==null) {
						System.out.print("_ ");
					}else {
						System.out.print("X ");
					}
				}
			}
		}
	}
	public static int[][] darUbicacionAsientosEntradas(Espectador[][] butacas, int numeroEntradas) {
		int[][] ubicacionAsientosEntradas = new int[numeroEntradas][2]; //Matriz en la que cada fila representa una entrada, y las columnas dan ubicación de butaca
		for (int entrada=0; entrada<numeroEntradas; entrada++) {
			boolean repetido=false, ocupado=false;
			do {
				System.out.println("Vamos a escoger la ubicación de la butaca para la entrada "+(entrada+1)+"/"+numeroEntradas+":");
				int fila=0, asiento=0;
				do {
					fila = Utilidades.pideDatoNumerico("Escoja una fila")-1;
					if (fila<0||fila>=butacas.length) {
						System.out.println("Fila incorrecta, inténtelo de nuevo");
					}
				}while (fila<0||fila>=butacas.length);
				ubicacionAsientosEntradas[entrada][0] = fila;
				do {
					asiento = Utilidades.pideDatoNumerico("Escoja un asiento")-1;
					if (asiento<0||asiento>=butacas[fila].length) {
						System.out.println("Asiento incorrecto, inténtelo de nuevo");
					}
				}while (asiento<0||asiento>=butacas[fila].length);
				ubicacionAsientosEntradas[entrada][1] = asiento;
				for (int i=0; i<entrada; i++) {
					if (ubicacionAsientosEntradas[i][0]==fila&&ubicacionAsientosEntradas[i][1]==asiento) {
						System.out.println("Ya ha seleccionado este asiento y fila, escoja de nuevo");
						repetido=true;
						break;
					}else {
						repetido=false;
					}
				}
				if (butacas[fila][asiento]!=null) {
					System.out.println("Este asiento está ocupado, escoja de nuevo");
					ocupado=true;
				}else {
					ocupado=false;
				}
			}while (repetido||ocupado);
		}
		return ubicacionAsientosEntradas;
	}
	public static Espectador[] pedirEspectadoresEntradas(Espectador espectador, int numeroEntradas) {
		Espectador[] espectadores = new Espectador[numeroEntradas];
		int entradaComprador = 0;
		do {
			entradaComprador = Utilidades.pideDatoNumerico("Cuál va a ser su entrada, "+espectador.getNombre())-1;
		}while (entradaComprador<0||entradaComprador>=numeroEntradas);
		for (int entrada=0; entrada<numeroEntradas; entrada++) {
			if (entrada==entradaComprador) {
				espectadores[entrada] = espectador;
			}else {
				String nombre = Utilidades.pideDatoString("Introduzca el nombre del espectador "+(entrada+1));
				String dni = Utilidades.pideDatoString("Introduzca el DNI del espectador "+(entrada+1));
				espectadores[entrada] = new Espectador(nombre, dni);
			}
		}
		return espectadores;
	}
	public static void colocarEspectadoresButacas(Espectador[][] butacas, Espectador[] espectadores, int[][] ubicacionAsientosEntradas) {
		for (int entrada=0; entrada<espectadores.length; entrada++) {
			int fila = ubicacionAsientosEntradas[entrada][0];
			int asiento = ubicacionAsientosEntradas[entrada][1];
			butacas[fila][asiento] = espectadores[entrada];
		}
	}
}
