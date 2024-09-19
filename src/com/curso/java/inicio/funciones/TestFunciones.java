package com.curso.java.inicio.funciones;

import com.curso.java.utils.UtilidadesMatematicas;

public class TestFunciones {

	public static void main(String[] args) {
		System.out.println(UtilidadesMatematicas.sumar(1, 2));
		System.out.println(UtilidadesMatematicas.operar(2, 2, "*"));
		int[] numeros = {1, 2, 3};
		System.out.println(UtilidadesMatematicas.calculaSumatorio(numeros));
		System.out.println(UtilidadesMatematicas.calcularMedia(numeros));
	}

}
