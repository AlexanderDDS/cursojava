package com.curso.java.inicio.strings.ejercicios;

public class EjercicioStringsQuijote {

	public static void main(String[] args) {
		String quijote = "    En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda...           ";
		quijote = quijote.trim();
		//Tamaño del texto sin espacios en blanco de principio y final
		System.out.println("El tamaño del texto es: "+quijote.length());
		//Mostrar segunda frase
		System.out.println("La segunda frase es: \n"+quijote.substring(quijote.indexOf(".")+1));
		//Aparece la palabra Quijote?
		String respuesta = quijote.contains("Quijote")?"Sí":"No";
		System.out.println(respuesta+" incluye la palabra Quijote");
		//Cuántas comas aparecen en el texto?
		int posicion = 0, coma = 0;
		for (posicion = 0; posicion<quijote.length(); posicion++) {
			if (quijote.charAt(posicion) == ',') {
				coma++;
			}	
		}
		System.out.println("Hay "+coma+" comas en el texto");
		//Encontrar la palabra más larga
		String quijoteSoloPalabras = quijote.replace(",", "").replace(".", "");
		String quijoteUnaPalabra = "";
		int longitudMaxima= 0;
		String quijotePalabraMaxima = "";
			//Esto es para ir revisando todas las palabras hasta la última (todas tienen un espacio delante)
		while (quijoteSoloPalabras.contains(" ")) {
			quijoteUnaPalabra = quijoteSoloPalabras.substring(0, quijoteSoloPalabras.indexOf(" "));
			if (quijoteUnaPalabra.length()>longitudMaxima) {
				longitudMaxima = quijoteUnaPalabra.length();
				quijotePalabraMaxima = quijoteUnaPalabra;
			}
			quijoteSoloPalabras = quijoteSoloPalabras.substring(quijoteSoloPalabras.indexOf(" ")+1);
		}
			//Esto es para revisar la última palabra, que no tiene un espacio delante
		if (quijoteSoloPalabras.length()>longitudMaxima) {
			longitudMaxima = quijoteSoloPalabras.length();
			quijotePalabraMaxima = quijoteSoloPalabras;
		}
		System.out.println("La palabra más larga es "+quijotePalabraMaxima);
		//Encontrar la palabra que más se repite
		String palabraMax = "";
		int frecuencia = 0;
		int frecuenciaMax= 0;
		String[] quijotePalabras = quijote.toLowerCase().replace(",","").replace(".","").split(" ");

		for (String palabra : quijotePalabras) {
			for (int i=0; i<quijotePalabras.length; i++) {
				if (palabra.equals(quijotePalabras[i])) {
					frecuencia++;
				}
			}
			if (frecuencia>frecuenciaMax) {
				palabraMax = palabra;
				frecuenciaMax = frecuencia;
			}
			frecuencia = 0;
		}
		System.out.println("La palabra más repetida es: \n\t"+palabraMax+" ("+frecuenciaMax+" veces)");
		//Invertir palabras sin cambiar el orden en el que están
		String quijoteInverso = "";
		while (quijote.contains(" ")) {
			String quijotePalabraInversa = "";
			quijoteUnaPalabra = quijote.substring(0, quijote.indexOf(" "));
			char[] ch = quijoteUnaPalabra.toCharArray();
			for (int i = ch.length-1; i>=0; i--) {
				quijotePalabraInversa += ch[i];
	        }
			quijoteInverso = quijoteInverso + quijotePalabraInversa + " ";
			quijote = quijote.substring(quijote.indexOf(" ")+1);
		}
		String quijotePalabraInversa = "";
		char[] ch = quijote.toCharArray();
		for (int i = ch.length-1; i>=0; i--) {
			quijotePalabraInversa += ch[i];
	    }
		quijoteInverso = quijoteInverso + quijotePalabraInversa + " ";
		System.out.println(quijoteInverso);
		
	}
}
