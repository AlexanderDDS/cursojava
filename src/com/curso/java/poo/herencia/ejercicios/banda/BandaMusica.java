package com.curso.java.poo.herencia.ejercicios.banda;

public class BandaMusica {

	public static void main(String[] args) {
		BandaMusica bandaMusica = new BandaMusica();
		bandaMusica.empezarConcierto();
	}
	public void empezarConcierto() {
		Guitarra guitarra1 = new Guitarra("guitarra", "acústica", 6);
		GuitarraElectrica guitarraElectrica1 = new GuitarraElectrica("guitarra eléctrica", "stratocaster", 6, 12.0);
		Piano piano1 = new Piano("piano", "acústico", 3, "de cola");
		Tambor tambor1 = new Tambor("tambor", "caja", "cuero");
		Instrumento[] instrumentos = {guitarra1, guitarraElectrica1, piano1, tambor1};
		BandaUtilidades.afinarInstrumentos(instrumentos);
		BandaUtilidades.tocarInstrumentos(instrumentos);
	}
}
