package com.curso.java.poo.herencia.ejercicios.hospital;

import java.util.Arrays;

public class Paciente extends Persona {
	private String[] sintomas;
	public Paciente(String nombre, int edad, String[] sintomas) {
		super(nombre, edad);
		this.sintomas = sintomas;
	}
	public String[] getSintomas() {
		return sintomas;
	}
	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}
	@Override
	public String toString() {
		return "Paciente [nombre="+getNombre()+", edad="+getEdad()+", sintomas=" + Arrays.toString(sintomas) + "]";
	}
	@Override
	public void comer() {
		System.out.println("El paciente "+this.getNombre()+" está comiendo en la cafetería");
	}
}
