package com.curso.java.poo.ejercicios.granpremio;

import com.curso.java.utils.Utilidades;

public class CasaApuestas {

	public static void main(String[] args) {
		//Definir caballos, carreras y Gran Premio
		Caballo caballo1 = new Caballo("S4M", "Bill", 4, 5, 44.4, 200.0);
		Caballo caballo2 = new Caballo("4R4G", "Brego", 5, 10, 55.0, 335.0);
		Caballo caballo3 = new Caballo("151L", "Berek", 6, 15, 60.0, 355.0);
		Caballo caballo4 = new Caballo("G4ND", "Shadowfax", 7, 60, 100.0, 400.0);
		Caballo[] caballos = {caballo1, caballo2, caballo3, caballo4};
		Carrera carrera1 = new Carrera("1ML4D", "Rivendell", caballos, 5000);
		Carrera carrera2 = new Carrera("M0R14", "Khazad-Dum", caballos, 10000);
		Carrera carrera3 = new Carrera("M0RDR", "Monte Destino", caballos, 20000);
		Carrera[] carreras = {carrera1, carrera2, carrera3};
		GranPremio gp1 = new GranPremio("JRRT", "Destruir el Anillo Único", carreras);
		//Presentación Gran Premio
		System.out.println("\t==========Bienvenidos al GP "+gp1.getNombre()+"!==========");
		System.out.println("Número de carreras: "+gp1.getCarreras().length);
		for (Carrera carrera : gp1.getCarreras()) {
			System.out.println("En la carrera "+carrera.getNombre()+" compiten "+carrera.getCaballos().length+" caballos:");
			System.out.print("\t");
			for (Caballo caballo : carrera.getCaballos()) {
				System.out.print("["+caballo.getNumero()+"]"+caballo.getNombre()+" ");
			}
			System.out.println("");
		}
		//Apuestas y carreras
		Apostante apostante1 = new Apostante("Frodo", 2000);
		Apostante apostante2 = new Apostante("Bilbo", 2000);
		Apostante[] apostantes = {apostante1, apostante2};
		for (Carrera carrera : gp1.getCarreras()) {
			System.out.println("\t==========Preparen sus apuestas para la carrera de "+carrera.getNombre()+"!==========");
			int[] numeroCaballoApuesta = {0,0};
			int i=0;
			for (Apostante apostante : apostantes) {
				System.out.println("Estimado cliente "+apostante.getNombre()+", ");
				numeroCaballoApuesta[i] = Utilidades.pideDatoNumerico("Escoja un número de caballo por el que apostar:");
				do {
					apostante.setApuesta(Utilidades.pideDatoNumerico("Introduzca importe de apuesta (tiene un saldo de "+apostante.getSaldo()+"$):"));
				}while (apostante.getApuesta()>apostante.getSaldo());
				apostante.setSaldo(apostante.getSaldo()-apostante.getApuesta());
				i++;
			}
			Caballo caballoGanador = carrera.iniciarCarrera();
			i=0;
			for (Apostante apostante : apostantes) {
				if (numeroCaballoApuesta[i]==caballoGanador.getNumero()) {
					apostante.setSaldo(apostante.getSaldo()+apostante.getApuesta()*5);
					System.out.println("\t"+apostante.getNombre()+" había apostado por el caballo ["+numeroCaballoApuesta[i]+"] y ha ganado "+(apostante.getApuesta()*5)+"$!");
				}
				else {
					System.out.println("\t"+apostante.getNombre()+" había apostado por el caballo ["+numeroCaballoApuesta[i]+"] y ha perdido "+(apostante.getApuesta())+"$...");
				}
				i++;
			}
		}
		System.out.println("\t==========El GP "+gp1.getNombre()+" ha concluido!==========");
		for (Apostante apostante : apostantes) {
			System.out.println("El apostante "+apostante.getNombre()+" se va con un saldo de "+apostante.getSaldo()+"$.");
		}
	}

}
