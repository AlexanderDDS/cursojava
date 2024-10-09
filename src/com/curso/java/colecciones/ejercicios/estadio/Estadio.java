package com.curso.java.colecciones.ejercicios.estadio;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.curso.java.utils.ConsoleColors;

public class Estadio {

	public static void main(String[] args) {
		Estadio estadio = new Estadio();
		estadio.iniciarPartido();
	}
	public void iniciarPartido() {
		Map<Equipo, List<Jugador>> mapaEstadio = crearMapa();
		mostrarNombresJugadores(mapaEstadio);
		mostrarInfoEquipoYDatosJugadores(mapaEstadio);
	}
	private Map<Equipo, List<Jugador>> crearMapa() {
		Jugador j1 = new Jugador("Jorge", 34, "defensa");
		Jugador j2 = new Jugador("Quique", 33, "portero");
		Jugador j3 = new Jugador("Fede", 26, "delantero");
		Jugador j4 = new Jugador("Alberto", 32, "defensa");
		Jugador j5 = new Jugador("Miguel", 27, "portero");
		Jugador j6 = new Jugador("Sergio", 29, "delantero");
		List<Jugador> jugadoresE1 = List.of(j1,j2,j3);
		List<Jugador> jugadoresE2 = List.of(j4,j5,j6);
		Equipo e1 = new Equipo("Real Madrid", 1, 1);
		Equipo e2 = new Equipo("Barça", 1, 1);
		Map<Equipo, List<Jugador>> mapaEstadio = new HashMap();
		mapaEstadio.put(e1, jugadoresE1);
		mapaEstadio.put(e2, jugadoresE2);
		return mapaEstadio;
	}
	public void mostrarNombresJugadores(Map<Equipo, List<Jugador>> mapaEstadio) {
		System.out.println("Vamos a mostrar todos los jugadores:");
		Collection<List<Jugador>> listasJugadores = mapaEstadio.values();
		for (List<Jugador> listaJugadores : listasJugadores) {
			for (Jugador jugador : listaJugadores) {
				System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+jugador.getNombre()+ConsoleColors.RESET);
			}
		}
	}
	public void mostrarInfoEquipoYDatosJugadores (Map<Equipo, List<Jugador>> mapaEstadio) {
		System.out.println("Vamos a ver los datos de cada equipo y de todos sus jugadores:");
		Set<Entry<Equipo, List<Jugador>>> entries = mapaEstadio.entrySet();
		for (Entry<Equipo, List<Jugador>> entry : entries) {
			System.out.println("======================================================================");
			System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+entry.getKey()+ConsoleColors.RESET);
			List<Jugador> listaJugadores = entry.getValue();
			for (Jugador jugador : listaJugadores) {
				System.out.println("\t"+ConsoleColors.GREEN_BOLD_BRIGHT+jugador+ConsoleColors.RESET);
			}
			System.out.println("======================================================================");
		}
	}
}