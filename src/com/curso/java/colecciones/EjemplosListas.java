package com.curso.java.colecciones;

import java.util.ArrayList;
import java.util.List;

import com.curso.java.poo.ejercicios.alumno.Alumno;

public class EjemplosListas {

	public static void main(String[] args) {

		List<Alumno> lista = new ArrayList();
		
//		lista.add("Hola");
//		lista.add(1);
		lista.add(new Alumno("111A","N1","A1"));
		lista.add(new Alumno("222B","N2","A2"));
		lista.add(new Alumno("333C","N3","A3"));
		
		for (Alumno alumno : lista) {
			System.out.println(alumno.getNombre());
		}
		System.out.println("===============================================");
		for (int i = 0; i < lista.size(); i++) {
			Alumno alumno = lista.get(i);
			System.out.println(alumno.getNombre());
		}
		System.out.println("===============================================");
		
		Alumno alumno4 = new Alumno("4444D","N4","A4");
		lista.add(0, alumno4);
		lista.add(0, alumno4);
		
		for (Alumno alumno : lista) {
			System.out.println(alumno.getNombre());
		}
		System.out.println("===============================================");
		
		lista.remove(alumno4);
		for (Alumno alumno : lista) {
			System.out.println(alumno.getNombre());
		}
		System.out.println("===============================================");
		
		String dni = "333C";
		for (Alumno alumno : lista) {
			if(alumno.getDni().equals(dni)) {
				System.out.println(alumno.getNombre());
				break;
			}
		}
		
		System.out.println(lista.indexOf(alumno4));
	}

}





