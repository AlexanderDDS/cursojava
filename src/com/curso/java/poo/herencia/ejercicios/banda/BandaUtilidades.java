package com.curso.java.poo.herencia.ejercicios.banda;

public class BandaUtilidades {
	public static void afinarInstrumentos(Instrumento[] instrumentos) {
		for (Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}
	}
	public static void tocarInstrumentos(Instrumento[] instrumentos) {
		boolean suenaMal=false;
		for (Instrumento instrumento : instrumentos) {
			if (instrumento.getNombre().toLowerCase().contains("tambor")) {
				((Tambor)instrumento).aporrear();
			}else {
				instrumento.tocar();
			}
			if (!instrumento.getAfinado()) {
				suenaMal=true;
			}
		}
		if (suenaMal) {
			System.out.println("La banda suena mal");
		}
	}
}
