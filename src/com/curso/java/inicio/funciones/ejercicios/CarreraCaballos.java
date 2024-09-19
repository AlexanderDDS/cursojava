package com.curso.java.inicio.funciones.ejercicios;

import com.curso.java.utils.Utilidades;

public class CarreraCaballos {

	public static void main(String[] args) {
		System.out.println("============Bienvenido a la carrera de caballos de 100 metros!============");
		//Cuántos caballos van a competir
		int numCaballos = Utilidades.pideDatoNumerico("Cuántos caballos van a competir?");
		//Nombre, edad y peso de cada caballo
		String[] nombresCaballos = new String[numCaballos];
		int[] edadesCaballos = new int[numCaballos];
		int[] pesosCaballos = new int[numCaballos];
		for (int i=0; i<nombresCaballos.length; i++) {
			nombresCaballos[i] = Utilidades.pideDatoString("Introduzca el nombre del caballo "+(i+1));
			edadesCaballos[i] = Utilidades.pideDatoNumerico("Introduzca la edad del caballo "+(i+1)+" (la vida media de un caballo es de 30 años)");
			pesosCaballos[i] = Utilidades.pideDatoNumerico("Introduzca el peso en kg del caballo "+(i+1)+" (el caballo promedio pesa 420 kg, pudiendo llegar hasta los 1000 kg)");
		}
		System.out.println("");
		//Inicia carrera y decir cuál caballo ha ganado (llegando primero a una posición determinada)
		String nombreCaballoGanador = "";
		double[] posicionesCaballos = new double[numCaballos];
		boolean ganador = false;
		while (ganador==false) {
			for (int i=0; i<posicionesCaballos.length; i++) {
				//Caballo puede avanzar entre 2 y 7.5m, y se le resta edad/30 (puede llegar a -1m a los 30 años) y peso/1000 (puede llegar a -1m a los 1000kg)
				double distanciaSinDesventajas = Math.random()*5.5+2;
				double desventajaEdad = edadesCaballos[i]*0.03;
				double desventajaPeso = pesosCaballos[i]*0.001;
				posicionesCaballos[i] += distanciaSinDesventajas-desventajaEdad-desventajaPeso;
				System.out.println(nombresCaballos[i]+" = "+(int)posicionesCaballos[i]+"m");
				//Imprimir representación visual de progreso cada 10m
				for (int track=0 ; track<=posicionesCaballos[i]; track+=10) {
					if (track>=100.0) {
						System.out.print(track+"m");
						break;
					}
					System.out.print(track+"m---|");
				}
				System.out.println("");
				if (posicionesCaballos[i]>=100.0) {
					nombreCaballoGanador = nombresCaballos[i];
					ganador=true;
					break;
				}
			}
			System.out.println("=========================================================================");
		}
		System.out.println("\n\t==========El caballo ganador es "+nombreCaballoGanador+"!==========");
	}

}
