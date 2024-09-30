package com.curso.java.poo.herencia.ejercicios.hospital;

import com.curso.java.utils.ConsoleColors;

public class Hospital {
	private String nombre;
	private Habitacion[] habitaciones;
	private Paciente[] salaEspera;
	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
		this.habitaciones = new Habitacion[2];
		this.salaEspera = new Paciente[3];
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}
	public Paciente[] getSalaEspera() {
		return salaEspera;
	}
	public void setSalaEspera(Paciente[] salaEspera) {
		this.salaEspera = salaEspera;
	}
	public static void main(String[] args) {
		Hospital hospital1 = new Hospital("La Paz");
		hospital1.abrirHospital();
	}
	public void abrirHospital() {
		System.out.println("El Hospital "+this.nombre+" está abierto!!");
		crearHabitaciones();
		crearSalaEspera();
		EmpleadoHospital[] empleados = crearEmpleados();
		ficharEmpleados(empleados);
		Persona[] personasHospital = {this.salaEspera[0], this.salaEspera[1], this.salaEspera[2], empleados[0], empleados[1]};
		comerPersonas(personasHospital);
		trabajanEmpleados(empleados);
		descansarEmpleados(empleados); //Los empleados descansan al finalizar el turno
	}
	private void crearHabitaciones() {
		this.habitaciones[0] = new Habitacion(1);
		this.habitaciones[1] = new Habitacion(2);
	}
	private void crearSalaEspera() {
		String[] sintomas1 = {"fiebre", "distención abdominal", "dolor al orinar"};
		this.salaEspera[0] = new Paciente("Miguel", 67, sintomas1);
		String[] sintomas2 = {"dolor de cabeza", "desorientación", "náuseas"};
		this.salaEspera[1] = new Paciente("Francisco", 42, sintomas2);
		String[] sintomas3 = {"dolor abdominal", "pérdida de apetito", "vómitos"};
		this.salaEspera[2] = new Paciente("Juan", 54, sintomas3);
	}
	private EmpleadoHospital[] crearEmpleados() {
		Enfermero enfermero1 = new Enfermero("Fede", 30, "mañana", 2);
		Doctor doctor1 = new Doctor("Guillermo", 36, "mañana", "Medicina Interna");
		EmpleadoHospital[] empleados = {enfermero1, doctor1};
		return empleados;
	}
	public void ficharEmpleados(EmpleadoHospital[] empleados) {
		for (EmpleadoHospital empleado : empleados) {
			empleado.fichar();
		}
	}
	public void descansarEmpleados(EmpleadoHospital[] empleados) {
		for (EmpleadoHospital empleado : empleados) {
			empleado.descansar();
		}
	}
	public void comerPersonas(Persona[] personas) {
		for (Persona persona : personas) {
			persona.comer();
		}
	}
	public void trabajanEmpleados(EmpleadoHospital[] empleados) {
		int posicionPaciente = 0;
		for (Paciente paciente : this.salaEspera) {
			((Enfermero)empleados[0]).atenderPaciente(paciente, (Doctor)empleados[1], this.habitaciones); //El enfermero va atendiendo a cada paciente en la sala de espera
			this.salaEspera[posicionPaciente]=null; //Quitamos al paciente de la sala de espera tras atenderle
			posicionPaciente++;
		}
	}
}
