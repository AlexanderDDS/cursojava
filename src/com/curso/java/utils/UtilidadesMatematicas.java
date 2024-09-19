package com.curso.java.utils;

public class UtilidadesMatematicas {

	//le pasamos dos numeros y nos devuelve la suma
	public static int sumar(int num1, int num2) {
		int resultadoSuma = num1+num2;
		return resultadoSuma;
	}
	//le pasamos tres parámetros, los dos primeros son números y el tercero es la operación a realizar, devolviendo el resultado de la operación
	public static double operar(int num1, int num2, String operacion) {
		double resultadoOperacion = 0.0;
		if (operacion.equals("+")||operacion.equals("suma")) {
			resultadoOperacion = num1+num2;
		}
		if (operacion.equals("-")||operacion.equals("resta")) {
			resultadoOperacion = num1-num2;
		}
		if (operacion.equals("x")||operacion.equals("multiplica")||operacion.equals("*")) {
			resultadoOperacion = num1*num2;
		}
		if (operacion.equals("/")||operacion.equals("divide")) {
			resultadoOperacion = num1/num2;
		}
		else {
			
		}
		return resultadoOperacion;
	}
	//le pasamos un array de enteros y nos devuelve la suma de todos los números
	public static int calculaSumatorio(int[] numeros) {
		int sumaNumeros = 0;
		for (int numero : numeros) {
			sumaNumeros += numero;
		}
		return sumaNumeros;
	}
	//le pasamos array de enteros que llama a la funcion calculaSumatorio para realizar el cálculo y devuelve la media de todos los números del array
	public static int calcularMedia(int[] numeros) {
		int resultadoMedia = 0;
		int sumaNumeros = calculaSumatorio(numeros);
		resultadoMedia = sumaNumeros/numeros.length;
		return resultadoMedia;
	}
}
