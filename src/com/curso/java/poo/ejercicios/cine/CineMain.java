package com.curso.java.poo.ejercicios.cine;

import com.curso.java.utils.Utilidades;

public class CineMain {

	public static void main(String[] args) {
		Espectador espectador1 = new Espectador("Juan Pozo", "001A");
		Espectador espectador2 = new Espectador("Laura Canales", "002B");
		Espectador espectador3 = new Espectador("Pepe Arroyo", "003C");
		Espectador[] espectadores = {espectador1, espectador2, espectador3};
		Espectador[][] butacas1 = new Espectador[3][2];
		Espectador[][] butacas2 = new Espectador[2][3];
		Espectador[][] butacas3 = new Espectador[2][2];
		Sala sala1 = new Sala(1, "La Comunidad del Anillo", butacas1);
		Sala sala2 = new Sala(2, "El Imperio Contraataca", butacas2);
		Sala sala3 = new Sala(3, "El Viaje de Chihiro", butacas3);
		Sala[] salas = {sala1, sala2, sala3};
		Cine cine1 = new Cine("Yelmo", salas);
		CineMain cineMain = new CineMain();
		for (Espectador espectador : espectadores) {
			cineMain.ventaEntradas(cine1, espectador);
		}
		cineMain.mostrarInformacionSalas(cine1);
	}
	public void ventaEntradas(Cine cine, Espectador espectador) {
		System.out.println("Bienvenido al cine "+cine.getNombre()+", "+espectador.getNombre());
		int numeroEntradas = Utilidades.pideDatoNumerico("Cuántas entradas quiere comprar?");
		int numeroSalasLibres = CineMainUtilidades.verNumeroSalasLibres(cine, numeroEntradas);
		if (numeroSalasLibres==0) {
			System.out.println("Lo sentimos, no hay ninguna sala con espacio suficiente disponible");
		}else {
			Sala[] salasLibres = CineMainUtilidades.obtenerSalasDisponibles(cine, numeroEntradas, numeroSalasLibres);
			String[] peliculasDisponibles = CineMainUtilidades.obtenerTitulosPeliculasDeSalas(salasLibres);
			int peliculaEscogida = Utilidades.pintaMenuPideNum(peliculasDisponibles, "Escoja la película que desea ver:");
			Sala salaEscogida = salasLibres[peliculaEscogida-1];
			CineMainUtilidades.pintaButacas(salaEscogida);
			System.out.println("");
			int [][] ubicacionAsientosEntradas = CineMainUtilidades.darUbicacionAsientosEntradas(salaEscogida.getButacas(), numeroEntradas);
			Espectador[] espectadoresEntradas = CineMainUtilidades.pedirEspectadoresEntradas(espectador, numeroEntradas);
			CineMainUtilidades.colocarEspectadoresButacas(salaEscogida.getButacas(), espectadoresEntradas, ubicacionAsientosEntradas);
			System.out.println("Sus entradas están listas, esperamos que disfrute de la función!\n==================================================");
		}
	}
	public void mostrarInformacionSalas(Cine cine) {
		for (Sala sala : cine.getSalas()) {
			System.out.println("La sala "+sala.getNumero()+" está mostrando la película "+sala.getTituloPelicula());
			Espectador[] espectadores = CineMainUtilidades.verEspectadoresSala(sala);
			System.out.println("Hay "+espectadores.length+" espectadores dentro:");
			for (Espectador espectador : espectadores) {
				int[] ubicacionEspectador = CineMainUtilidades.verUbicacionEspectador(sala, espectador);
				System.out.println("\t- "+espectador.getNombre()+" con DNI "+espectador.getDni()+" en el asiento "+ubicacionEspectador[1]+" de la fila "+ubicacionEspectador[0]);
			}
		}
	}
	
}
