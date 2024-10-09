package com.curso.java.ficheros.ejercicios;

import java.io.File;

public class EjercicioFicheros {

	public static void main(String[] args) {
		int numeroFicheros = 0;
		long tamanioFicheroMaximo = 0;
		String pathname = "C:\\Users\\Tardes.SB03-14\\Desktop\\ejercicioficheros", nombreFicheroMaximo = "";
		File dir = new File(pathname);
		System.out.println("Vamos a mostrar los nombres de los ficheros que son imágenes dentro de este directorio: \n"+pathname);
		if (dir.isDirectory()) {
			String[] ficheros = dir.list();
			for (String nombreFichero : ficheros) {
				File file = new File(pathname+nombreFichero);
				if (!file.isDirectory()) {
					numeroFicheros++;
					if (file.getName().endsWith(".jpg")) {
						System.out.println("\t"+nombreFichero);
					}
					if (file.length()>tamanioFicheroMaximo) {
						tamanioFicheroMaximo = file.length();
						nombreFicheroMaximo = nombreFichero;
					}
				}
			}
			System.out.println("Además, en este directorio hay en total "+numeroFicheros+" ficheros");
			System.out.println("El fichero del tamaño más grande es "+nombreFicheroMaximo+", con un tamaño de "+tamanioFicheroMaximo);
		}
	}
}
