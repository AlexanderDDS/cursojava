package com.curso.java.poo.herencia.ejercicios.hospital;

import com.curso.java.utils.ConsoleColors;

public class Hospital {
	private String nombre;
	private Habitacion[] habitaciones;
	private Paciente[] salaEspera;
	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Hospital(String nombre, Habitacion[] habitaciones, Paciente[] salaEspera) {
		super();
		this.nombre = nombre;
		this.habitaciones = habitaciones;
		this.salaEspera = salaEspera;
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
		hospital1.abrirHospital(hospital1);
	}
	private void abrirHospital(Hospital hospital) {
		System.out.println("El Hospital "+hospital.getNombre()+" está abierto!!");
		Habitacion[] habitaciones = crearHabitaciones();
		Paciente[] pacientes = crearPacientes();
		Hospital hospital1 = new Hospital("La Paz", habitaciones, pacientes);
		EmpleadoHospital[] empleados = crearEmpleados();
		ficharEmpleados(empleados);
		Persona[] personasHospital = {pacientes[0], pacientes[1], pacientes[2], empleados[0], empleados[1]};
		comerPersonas(personasHospital);
		int contador = 0;
		for (Paciente paciente : hospital1.getSalaEspera()) {
			((Enfermero)empleados[0]).atenderPaciente(paciente, (Doctor)empleados[1], hospital1); //El enfermero va atendiendo a cada paciente en la sala de espera
			hospital1.getSalaEspera()[contador]=null; //Quitamos al paciente de la sala de espera tras atenderle
			contador++;
		}
		descansarEmpleados(empleados); //Los empleados descansan al finalizar el turno
	}
	private Habitacion[] crearHabitaciones() {
		Habitacion habitacion1 = new Habitacion(1, null);
		Habitacion habitacion2 = new Habitacion(2, null);
		Habitacion[] habitaciones = {habitacion1, habitacion2};
		return habitaciones;
	}
	private Paciente[] crearPacientes() {
		String[] sintomas1 = {"fiebre", "distención abdominal", "dolor al orinar"};
		Paciente paciente1 = new Paciente("Miguel", 67, sintomas1);
		String[] sintomas2 = {"dolor de cabeza", "desorientación", "náuseas"};
		Paciente paciente2 = new Paciente("Francisco", 42, sintomas2);
		String[] sintomas3 = {"dolor abdominal", "pérdida de apetito", "vómitos"};
		Paciente paciente3 = new Paciente("Juan", 54, sintomas3);
		Paciente[] pacientes = {paciente1, paciente2, paciente3};
		return pacientes;
	}
	private EmpleadoHospital[] crearEmpleados() {
		Enfermero enfermero1 = new Enfermero("Fede", 30, "mañana", 2);
		Doctor doctor1 = new Doctor("Guillermo", 36, "mañana", "Medicina Interna");
		EmpleadoHospital[] empleados = {enfermero1, doctor1};
		return empleados;
	}
	private void ficharEmpleados(EmpleadoHospital[] empleados) {
		for (EmpleadoHospital empleado : empleados) {
			empleado.fichar();
			System.out.println("\t"+ConsoleColors.PURPLE_BACKGROUND+empleado+ConsoleColors.RESET);
		}
	}
	private void descansarEmpleados(EmpleadoHospital[] empleados) {
		for (EmpleadoHospital empleado : empleados) {
			empleado.descansar();
		}
	}
	private void comerPersonas(Persona[] personas) {
		for (Persona persona : personas) {
			persona.comer();
		}
	}
}
