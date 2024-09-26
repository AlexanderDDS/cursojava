package com.curso.java.poo.herencia.ejercicios.hospital;

public class HospitalUtilidades {
	public static void ficharEmpleados(EmpleadoHospital[] empleados) {
		for (EmpleadoHospital empleado : empleados) {
			empleado.fichar();
		}
	}
	public static void descansarEmpleados(EmpleadoHospital[] empleados) {
		for (EmpleadoHospital empleado : empleados) {
			empleado.descansar();
		}
	}
	public static void comerPersonas(Persona[] personas) {
		for (Persona persona : personas) {
			persona.comer();
		}
	}
	public static void ingresarEnfermo(Enfermo enfermo, Hospital hospital) {
		boolean enfermoIngresado=false;
		for (Habitacion habitacion : hospital.getHabitaciones()) {
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
