package com.curso.java.poo.herencia.ejercicios.hospital;

import com.curso.java.utils.ConsoleColors;

public class Doctor extends EmpleadoHospital {
	private String especialidad;
	public Doctor(String nombre, int edad, String turno, String especialidad) {
		super(nombre, edad, turno);
		this.especialidad = especialidad;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	@Override
	public String toString() {
		return "Doctor [nombre="+getNombre()+", edad="+getEdad()+", turno="+getTurno()+", especialidad="+especialidad+"]";
	}
	@Override
	public void fichar() {
		super.fichar();
		System.out.println("\t"+ConsoleColors.PURPLE_BACKGROUND+toString()+ConsoleColors.RESET);
	}
	@Override
	public void descansar() {
		System.out.println("El doctor "+this.getNombre()+" está descansando en la sala de docencia");
	}
	public Enfermo diagnosticarPaciente(Paciente paciente) {
		Enfermo enfermoDiagnosticado = null;
		double healthCheck = Math.random()*10+1;
		boolean estaEnfermo = (int)healthCheck>8;
		if (estaEnfermo) {
			String enfermedad= darEnfermedad();
			enfermoDiagnosticado = new Enfermo(paciente.getNombre(), paciente.getEdad(), enfermedad);
			System.out.println(ConsoleColors.RED_BRIGHT+"El paciente "+enfermoDiagnosticado.getNombre()+" ha sido diagnosticado de "+enfermoDiagnosticado.getEnfermedad()+" por el Dr "+getNombre()+ConsoleColors.RESET);
		}else {
			System.out.println(ConsoleColors.BLUE_BRIGHT+"El paciente "+paciente.getNombre()+" ha sido atendido por el Dr "+getNombre()+", el cual ha visto que no está enfermo"+ConsoleColors.RESET);
		}
		return enfermoDiagnosticado; //Si no está enfermo, regresará un objeto Enfermo null
	}
	private String darEnfermedad() {
		String enfermedad="";
		double numAleatorio = Math.random()*6;
		switch ((int)numAleatorio) {
			case 0: enfermedad="mimitis aguda";break;
			case 1: enfermedad="apendicitis";break;
			case 2: enfermedad="gastritis";break;
			case 3: enfermedad="cáncer";break;
			case 4: enfermedad="pancreatitis";break;
			case 5: enfermedad="cólico biliar";break;
		}
		return enfermedad;
	}
}
