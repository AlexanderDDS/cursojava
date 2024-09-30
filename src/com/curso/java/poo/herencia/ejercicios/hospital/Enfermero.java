package com.curso.java.poo.herencia.ejercicios.hospital;

import com.curso.java.utils.ConsoleColors;

public class Enfermero extends EmpleadoHospital {
	private int planta;
	public Enfermero(String nombre, int edad, String turno, int planta) {
		super(nombre, edad, turno);
		this.planta = planta;
	}
	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	@Override
	public String toString() {
		return "Enfermero [nombre="+getNombre()+", edad="+getEdad()+", turno="+getTurno()+", planta="+planta+"]";
	}
	@Override
	public void fichar() {
		super.fichar();
		System.out.println("\t"+ConsoleColors.PURPLE_BACKGROUND+toString()+ConsoleColors.RESET);
	}
	@Override
	public void descansar() {
		System.out.println("El enfermero "+this.getNombre()+" está descansando en la sala de enfermeros");
	}
	public void atenderPaciente(Paciente paciente, Doctor doctor, Habitacion[] habitaciones) {
		System.out.println("El paciente "+paciente.getNombre()+" está siendo atendido por el enfermero "+this.getNombre());
		System.out.println("\t"+ConsoleColors.GREEN_BACKGROUND+paciente+ConsoleColors.RESET);
		Enfermo enfermoAtendido = doctor.diagnosticarPaciente(paciente);
		if (enfermoAtendido!=null) {
			System.out.println("El paciente "+enfermoAtendido.getNombre()+" va a ser ingresado");
			ingresarEnfermo(enfermoAtendido, habitaciones);
		}else {
			System.out.println("El paciente "+paciente.getNombre()+" se puede ir a casa");
		}
	}
	private void ingresarEnfermo(Enfermo enfermo, Habitacion[] habitaciones) {
		boolean enfermoIngresado=false;
		for (Habitacion habitacion : habitaciones) {
			if (habitacion.getEnfermo()==null) {
				habitacion.setEnfermo(enfermo);
				enfermoIngresado=true;
				System.out.println("El enfermo "+enfermo.getNombre()+" ha sido ingresado en la habitación "+habitacion.getNumero());
				break;
			}
		}
		if (!enfermoIngresado) {
			System.out.println("No hay habitaciones suficientes para ingresar al enfermo "+enfermo.getNombre());
		}
	}
}
