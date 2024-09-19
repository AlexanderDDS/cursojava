package com.curso.java.poo.ejercicios.ejercicio1;

//POJO: Plain Old Java Object
public class Factura {
	//Atributos
	private String referencia;
	private String fecha;
	private double importe;
	
	//Constructor
	public Factura(String referencia, String fecha, double importe) {
		this.referencia = referencia;
		this.fecha = fecha;
		this.importe = importe;
	}
	
	//Métodos get y set
	public String getReferencia() {
		return this.referencia;
	}
	public String getFecha() {
		return this.fecha;
	}
	public double getImporte() {
		return this.importe;
	}
	
	//Otros métodos
	public void imprimirFactura() {
		System.out.println("La factura con referencia "+this.referencia+" de un importe de "+this.importe+" se ha impreso a fecha de "+this.fecha);
	}
}
