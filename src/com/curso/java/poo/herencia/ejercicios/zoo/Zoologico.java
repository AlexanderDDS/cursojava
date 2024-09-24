package com.curso.java.poo.herencia.ejercicios.zoo;

public class Zoologico {

	public static void main(String[] args) {
		Vaca vaca1 = new Vaca("1", "Lola", 300, "Bradford");
		vaca1.comer();
		vaca1.beber();
		vaca1.mugir();
		System.out.println(vaca1);
	}

}
