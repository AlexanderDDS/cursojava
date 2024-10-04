package com.curso.java.colecciones;

import java.util.ArrayList;

import com.curso.java.poo.ejercicios.alumno.Alumno;

public class EjemplosListas {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		lista.add("Hola");
		lista.add(1);
		lista.add(new Alumno());
	}

}
