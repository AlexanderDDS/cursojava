package com.curso.java.poo.ejercicios.alumno;

public class AlumnoMain {

	public static void main(String[] args) {
		//4 objetos de tipo alumno
		Alumno alumno1 = new Alumno(); //1 usando el const. vacio
		alumno1.setDni("1A");
		alumno1.setNombre("Isabel");
		alumno1.setApellidos("Paredes");
		alumno1.setNota(0);
		alumno1.setMayorEdad(false);
		Alumno alumno2 = new Alumno("2B", "Pepe", "Fernandez"); //1 usando (dni, nombre, apellidos)
		alumno2.setNota(7);
		alumno2.setMayorEdad(true);
		Alumno alumno3 = new Alumno("3C", "Laura", "Calle", 10); //1 usando (dni, nombre, apellidos, nota)
		alumno3.setMayorEdad(true);
		Alumno alumno4 = new Alumno("4D", "Miguel", "Redondo", 4, true); //1 usando (dni, nombre, apellidos, nota, mayorEdad)
		//Llamar de cada objeto al metodo verNota()
		alumno1.verNota();
		alumno2.verNota();
		alumno3.verNota();
		alumno4.verNota();
		//Meter a todos los alumnos en un array, crear método que reciba un array de alumnos y muestre la información (nombre y apellidos - nota) de todos los que han aprobado 
		Alumno[] alumnos = {alumno1, alumno2, alumno3, alumno4};
		AlumnoMain alumnoMain = new AlumnoMain();
		alumnoMain.mostrarInformacionAlumnosAprobados(alumnos);
	}
	public void mostrarInformacionAlumnosAprobados (Alumno[] alumnos) {
		System.out.println("Vamos a mostrar el nombre, apellido y nota de todos los alumnos aprobados:");
		for (Alumno alumn : alumnos) {
			if (alumn.getNota()>=5) {
				System.out.println("El alumno "+alumn.getNombre()+" "+alumn.getApellidos()+" tiene una nota de "+alumn.getNota());
			}
		}
	}
}
