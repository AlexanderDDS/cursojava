package com.curso.java.poo.herencia.ejercicios.hospital;

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
	public void descansar() {
		System.out.println("El enfermero "+this.getNombre()+" está descansando en la sala de enfermeros");
	}
	public void atenderPaciente(Paciente paciente, Doctor doctor, Hospital hospital) {
		System.out.println("El paciente "+paciente.getNombre()+" está siendo atendido por el enfermero "+this.getNombre());
		Enfermo enfermoAtendido = doctor.diagnosticarPaciente(paciente, "mimitis aguda");
		if (enfermoAtendido!=null) {
			System.out.println("El paciente "+enfermoAtendido.getNombre()+" ha sido diagnosticado de "+enfermoAtendido.getEnfermedad()+" por el Dr "+doctor.getNombre()+" y va a ser ingresado");
			HospitalUtilidades.ingresarEnfermo(enfermoAtendido, hospital);
		}else {
			System.out.println("El paciente "+paciente.getNombre()+" ha sido atendido por el Dr "+doctor.getNombre()+", el cual ha visto que no está enfermo y le ha dicho que se puede ir a casa");
		}
	}
}
