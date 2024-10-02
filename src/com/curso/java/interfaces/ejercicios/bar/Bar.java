package com.curso.java.interfaces.ejercicios.bar;

import com.curso.java.excepciones.TooColdTemperatureException;
import com.curso.java.excepciones.TooHotTemperatureException;
import com.curso.java.utils.ConsoleColors;

public class Bar {
	private String nombre;
	public Bar(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public static void main(String[] args) {
		Bar casaPepe = new Bar("Casa Pepe");
		casaPepe.abrirBar();
	}
	public void abrirBar() {
		System.out.println(ConsoleColors.YELLOW_BACKGROUND+ConsoleColors.BLUE_BOLD+"*_*_*_*_*_*_BIENVENIDO A CASA PEPE_*_*_*_*_*_*"+ConsoleColors.RESET);
		Cliente[] clientes = crearClientes();
		ServibleCafe[] serviblesCafe = {(ServibleCafe)clientes[1], (ServibleCafe)clientes[2]};
		servirCafe(serviblesCafe);
	}
	private Cliente[] crearClientes() {
		Huesped h = new Huesped("Paco", "01A");
		Comensal c = new Comensal("Juan", true);
		ClienteAsiduo ca = new ClienteAsiduo("Eulalio", "el Barbas");
		Cliente[] clientes = {h, c, ca};
		return clientes;
	}
	private TazaCafe[] crearTazasCafe() {
		TazaCafe t1 = new TazaCafe("capuccino");
		TazaCafe t2 = new TazaCafe("cortado");
		TazaCafe t3 = new TazaCafe("capuccino");
		TazaCafe[] tazasCafe = {t1, t2, t3};
		return tazasCafe;
	}
	public void servirCafe(ServibleCafe[] serviblesCafe) {
		TazaCafe[] tazasCafe = crearTazasCafe();
		for (int i=0; i<serviblesCafe.length; i++) {
			if (serviblesCafe[i]!=null) {
				try {
					serviblesCafe[i].tomarCafe(tazasCafe[i]);
				}catch(TooHotTemperatureException thte) {
					System.out.println(thte.getMessage());
				}catch(TooColdTemperatureException tcte) {
					System.out.println(tcte.getMessage());
				}
			}
		}
	}
}
