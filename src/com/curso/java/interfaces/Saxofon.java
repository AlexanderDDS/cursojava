package com.curso.java.interfaces;

import com.curso.java.poo.herencia.ejercicios.banda.Instrumento;

public class Saxofon extends Instrumento implements Interfaz3, Interfaz1, Vendible{
	
	public Saxofon(String nombre, String tipo, boolean afinado) {
		super(nombre, tipo, afinado);
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void metodo1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void metodo2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void metodo3() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void metodo4() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void metodo5() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void metodo6() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void vender() {
		System.out.println("Vendiendo saxofón");
		
	}
	
}
