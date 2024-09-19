package com.curso.java.poo.ejercicios.alumno;

public class Alumno {
	//Atributos
	private String dni;
	private String nombre;
	private String apellidos;
	private boolean mayorEdad;
	private int nota;
	
	//Constructores
	public Alumno() {
		
	}
	public Alumno(String dni, String nombre, String apellidos) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	public Alumno(String dni, String nombre, String apellidos, int nota) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nota=nota;
	}
	public Alumno(String dni, String nombre, String apellidos, int nota, boolean mayorEdad) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nota=nota;
		this.mayorEdad=mayorEdad;
	}
	
	//Get/Set
	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni=dni;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public boolean getMayorEdad() {
		return this.mayorEdad;
	}
	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad=mayorEdad;
	}
	public int getNota() {
		return this.nota;
	}
	public void setNota(int nota) {
		this.nota=nota;
	}
	
	//Otros métodos
	public void verNota() {
		if (mayorEdad) {
			if (this.nota==0) {
				System.out.println("El alumno "+this.nombre+" "+this.apellidos+" no ha estudiado nada");
			}
			else if (this.nota<5) {
				System.out.println("El alumno "+this.nombre+" "+this.apellidos+" ha estudiado poco");
			}
			else if (this.nota<10) {
				System.out.println("El alumno "+this.nombre+" "+this.apellidos+" ha estudiado mucho");
			}
			else if (this.nota==10) {
				System.out.println("El alumno "+this.nombre+" "+this.apellidos+" es un genio");
			}else {
				System.out.println("La nota del alumno "+this.nombre+" "+this.apellidos+"es incorrecta");
			}
		}else {
			System.out.println("No hay permisos para ver la nota");
		}
	}
	
}
