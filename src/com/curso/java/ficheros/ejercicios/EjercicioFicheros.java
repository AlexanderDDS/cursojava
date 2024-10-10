package com.curso.java.ficheros.ejercicios;

import java.io.File;

public class EjercicioFicheros {

	public static void main(String[] args) {
		int numeroFicheros = 0;
		long tamanioFicheroMaximo = 0;
		String nombreFicheroMaximo = "";
		File dir = new File("C:\\Users\\Tardes.SB03-14\\Desktop\\ejercicioficheros");
		System.out.println("Vamos a mostrar los nombres de los ficheros .jpg dentro de este directorio: \n"+dir.getAbsolutePath());
		if (dir.isDirectory()) {
			for (File file : dir.listFiles()) {
				if (!file.isDirectory()) {
					numeroFicheros++;
					if (file.getName().endsWith(".jpg")) {
						System.out.println("\t"+file.getName());
					}
					if (file.length()>tamanioFicheroMaximo) {
						tamanioFicheroMaximo = file.length();
						nombreFicheroMaximo = file.getName();
					}
				}
			}
			System.out.println("Además, en este directorio hay en total "+numeroFicheros+" ficheros");
			System.out.println("El fichero del tamaño más grande es "+nombreFicheroMaximo+", con un tamaño de "+tamanioFicheroMaximo);
		}
	}
}
