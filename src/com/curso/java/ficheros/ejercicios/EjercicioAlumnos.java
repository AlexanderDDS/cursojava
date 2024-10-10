package com.curso.java.ficheros.ejercicios;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.curso.java.poo.ejercicios.alumno.Alumno;
import com.curso.java.utils.ConsoleColors;

public class EjercicioAlumnos {

	public static void main(String[] args) {
		List<Alumno> alumnos = null;
		File ficheroAlumnos = new File("fichero_datos.txt");
		try {
			alumnos = cargarAlumnos(ficheroAlumnos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Hay "+alumnos.size()+" alumnos. Sus datos son:");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}
	private static List<Alumno> cargarAlumnos(File file) throws IOException{
		List<Alumno> alumnos = new ArrayList();
		Path path = Paths.get("fichero_datos.txt");
		List<String> lines = null;
		lines = Files.readAllLines(path);
		int numeroLinea = 0;
		for (String linea : lines) {
			StringBuilder sb = new StringBuilder();
			numeroLinea++;
			sb.append(linea);
			String[] datosAlumno = linea.split(";");
			if (datosAlumno.length==6) {
				String nombre = datosAlumno[0];
				String dni = datosAlumno[1];
				String apellido = datosAlumno[2];
				String dato4 = datosAlumno[3];
				String dato5 = datosAlumno[4];
				String dato6 = datosAlumno[5];
				alumnos.add(new Alumno(dni, nombre, apellido, dato4, dato5, dato6));
			}else {
				System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"Ha habido un error de lectura del fichero "+file.getName()+" en la línea "+numeroLinea+":");
				System.out.println("\t"+linea+ConsoleColors.RESET);
			}
		}
		return alumnos;
	}
}
