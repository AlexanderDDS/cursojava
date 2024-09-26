package com.curso.java.poo.herencia.ejercicios.hospital;

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
	public void descansar() {
		System.out.println("El doctor "+this.getNombre()+" está descansando en la sala de docencia");
	}
	public Enfermo diagnosticarPaciente(Paciente paciente, String enfermedad) {
		Enfermo enfermoDiagnosticado = null;
		double healthCheck = Math.random()*10+1;
		boolean estaEnfermo = (int)healthCheck>8;
		if (estaEnfermo) {
			enfermoDiagnosticado = new Enfermo(paciente.getNombre(), paciente.getEdad(), enfermedad);
		}
		return enfermoDiagnosticado; //Si no está enfermo, regresará un objeto Enfermo null
	}
}
