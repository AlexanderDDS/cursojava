package com.curso.java.poo.herencia.ejercicios.hospital;

public abstract class EmpleadoHospital extends Persona {
	private String turno;
	public EmpleadoHospital(String nombre, int edad, String turno) {
		super(nombre, edad);
		this.turno = turno;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	@Override
	public void comer() {
		System.out.println("El empleado "+this.getNombre()+" está comiendo en el comedor");
	}
	public void fichar() {
		System.out.println("El empleado "+this.getNombre()+" está fichado");
	}
	public abstract void descansar();
}
