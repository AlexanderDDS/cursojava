package com.curso.java.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.curso.java.colecciones.ejercicios.juguetes.Munieca;
import com.curso.java.poo.ejercicios.alumno.Alumno;

public class EjemploMapas {
	public static void main(String[] args) {
		
		//Mapa con String como clave y Alumno como valor
		Map<String, Alumno> mapaAlumnos =  new HashMap();
		
		Alumno a1 = new Alumno("111A","N1","A1");
		mapaAlumnos.put(a1.getDni(), a1);
		Alumno a2 = new Alumno("222B","N2","A2");
		Alumno a3 = new Alumno("333C","N3","A3");
		mapaAlumnos.put(a2.getDni(), a2);
		mapaAlumnos.put(a3.getDni(), a3);
		
		String dni = "333C";
		Alumno a4 = mapaAlumnos.get(dni);
		System.out.println(a4.getDni());
		
		
		Alumno a5 = new Alumno("444D","N4","A4");
		Alumno a6 = mapaAlumnos.put("222B", a5);
		System.out.println(a6.getNombre());
		Alumno a7 = mapaAlumnos.get("222B");
		System.out.println(a7.getNombre());
		
		Set<String> dnis = mapaAlumnos.keySet();
		
		System.out.println("Dnis");
		for (String dniAlumno : dnis) {
			System.out.println(dniAlumno);
		}
		
		Collection<Alumno> alumnos = mapaAlumnos.values();
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getApellidos());
		}
		
		
		
		//Otro ejemplo
		//Mapa con String como clave y Listado de Doll como valor
		Map<String, List<Munieca>> muniecasColor = new HashMap();
		Munieca doll1 = new Munieca("D1", 50, "BArbie", "rojo");
		Munieca doll2 = new Munieca("D2", 60, "BArbie", "azul");
		Munieca doll3 = new Munieca("D3", 80, "Nenuco", "rojo");
		Munieca doll4 = new Munieca("D4", 100, "BArbie", "blanco");
		
		muniecasColor.put(null, null);
		
		List<Munieca> dollsRojo = new ArrayList<Munieca>() ;
		dollsRojo.add(doll1);
		dollsRojo.add(doll3);
		List<Munieca> dollsAzul = new ArrayList<Munieca>() ;
		dollsAzul.add(doll2);
		List<Munieca> dollsBlanco = new ArrayList<Munieca>() ;
		dollsBlanco.add(doll4);
		
		muniecasColor.put(null, dollsBlanco);
		System.out.println("--: "+muniecasColor.get(null).size());
		
		muniecasColor.put("rojo", dollsRojo);
		muniecasColor.put("azul", dollsAzul);
		muniecasColor.put("blanco", dollsBlanco);
		
		Set<String> colores = muniecasColor.keySet();
		for (String color : colores) {
			//System.out.println(color);
			List<Munieca> muniecas =  muniecasColor.get(color);
			double precioTotal = 0;
			for (Munieca munieca : muniecas) {
				precioTotal += munieca.getPrecio();
			}
			System.out.println("Para el color "+ color + " el total es " + precioTotal);
		}
		
		
		Set<Entry<String,List<Munieca>>> entries =  muniecasColor.entrySet();
		for (Entry<String, List<Munieca>> entry : entries) {
			String color = entry.getKey();
			List<Munieca> muniecas = entry.getValue();
			double precioTotal = 0;
			for (Munieca munieca : muniecas) {
				precioTotal += munieca.getPrecio();
			}
			System.out.println("Para el color "+ color + " el total es " + precioTotal);
			
		}
		
		
		
		
		
		
		
		
	}
}


