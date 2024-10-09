package com.curso.java.colecciones;

import java.util.HashSet;
import java.util.Set;

import com.curso.java.poo.ejercicios.alumno.Alumno;

public class EjemplosSet {

	public static void main(String[] args) {

		Set<Alumno> conjunto = new HashSet();
		
		conjunto.add(new Alumno("222B","N2","A2"));
		conjunto.add(new Alumno("333C","N3","A3"));
		conjunto.add(new Alumno("111A","N1","A1"));
		conjunto.add(new Alumno("444D","N4","A4"));
		conjunto.add(new Alumno("444D","N6","A4"));
		conjunto.add(new Alumno("444D","N7","A4"));
		conjunto.add(new Alumno("444D","N8","A4"));
		
		for (Alumno alumno : conjunto) {
			System.out.println(alumno.getNombre());
		}

		Alumno alumno5 = new Alumno("555E","N5","A5");
		System.out.println(conjunto.add(alumno5));
		System.out.println(conjunto.add(alumno5));
		
		System.out.println("===============================================");
		for (Alumno alumno : conjunto) {
			System.out.println(alumno.getNombre());
		}
		
		
		System.out.println("===============================================");
		
		String dni = "333C";
		for (Alumno alumno : conjunto) {
			if(alumno.getDni().equals(dni)) {
				System.out.println(alumno.getNombre());
				break;
			}
		}

		
	}

}
