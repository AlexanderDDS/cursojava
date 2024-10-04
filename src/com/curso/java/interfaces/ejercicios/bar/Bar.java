package com.curso.java.interfaces.ejercicios.bar;

import java.util.Arrays;

import com.curso.java.excepciones.InsufficientCupsOfCoffeeException;
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
		System.out.println(ConsoleColors.BLUE_BACKGROUND+ConsoleColors.CYAN_BOLD_BRIGHT+"*_*_*_*_*_*_BIENVENIDO A CASA PEPE_*_*_*_*_*_*\n"+ConsoleColors.RESET);
		Cliente[] clientes = crearClientes();
		ServibleCafe[] serviblesCafe = seleccionarClientesServiblesCafe(clientes);
		TazaCafe[] tazasCafe = crearTazasCafe();
		try {
			servirCafe(serviblesCafe, tazasCafe);
		}catch (InsufficientCupsOfCoffeeException icoce1) {
			System.out.println(icoce1.getMessage());
			//Intentar servir café de nuevo con nuevas tazas de café (con longitud de array igual a cantidad de servibles) con método añadirTazasCafe()
			TazaCafe[] nuevasTazasCafe = añadirTazasCafe(serviblesCafe.length, tazasCafe);
			try {
				servirCafe(serviblesCafe, nuevasTazasCafe);
			}catch (InsufficientCupsOfCoffeeException icoce2) {
				System.out.println(icoce2.getMessage());
			}
		}
	}
	private Cliente[] crearClientes() {
		Huesped h1 = new Huesped("Gregorio", "03C");
		Huesped h2 = new Huesped("Paco", "01A");
		Comensal c1 = new Comensal("Juan", true);
		Comensal c2 = new Comensal("Alberto", false);
		ClienteAsiduo ca1 = new ClienteAsiduo("Eulalio", "el Barbas", "latte");
		ClienteAsiduo ca2 = new ClienteAsiduo("Darío", "el Friki", "cappuccino");
		Cliente[] clientes = {h1, h2, c1, c2, ca1, ca2};
		return clientes;
	}
	private TazaCafe[] crearTazasCafe() {
		TazaCafe t1 = new TazaCafe(darTipoCafe());
		TazaCafe t2 = new TazaCafe(darTipoCafe());
		TazaCafe t3 = new TazaCafe(darTipoCafe());
		TazaCafe[] tazasCafe = {t1, t2, t3};
		return tazasCafe;
	}
	public TazaCafe[] añadirTazasCafe(int numeroServibles, TazaCafe[] tazasCafe) {
		System.out.println("Estamos poniendo más tazas de café para servir\n");
		TazaCafe[] nuevasTazasCafe = new TazaCafe[numeroServibles];
		for (int i=0; i<nuevasTazasCafe.length; i++) {
			if (i<tazasCafe.length) {
				nuevasTazasCafe[i]=tazasCafe[i];
			}else {
				nuevasTazasCafe[i] = new TazaCafe(darTipoCafe());
			}
		}
		return nuevasTazasCafe;
	}
	private String darTipoCafe() {
		String tipoCafe="";
		double numTipoCafe = Math.random()*4;
		switch((int)numTipoCafe) {
			case 0: tipoCafe="espresso";break;
			case 1: tipoCafe="latte";break;
			case 2: tipoCafe="cappuccino";break;
			case 3: tipoCafe="mocca";break;
		}
		return tipoCafe;
	}
	public int darCantidadClientesServiblesCafe (Cliente[] clientes) {
		int cantidadClientesServibles=0;
		for (Cliente cliente : clientes) {
			if (cliente!=null) {
				if (cliente instanceof ServibleCafe) {
					cantidadClientesServibles++;
				}
			}
		}
		return cantidadClientesServibles;
	}
	public ServibleCafe[] seleccionarClientesServiblesCafe (Cliente[] clientes) {
		int cantidadClientesServiblesCafe = darCantidadClientesServiblesCafe(clientes);
		ServibleCafe[] serviblesCafe = new ServibleCafe[cantidadClientesServiblesCafe];
		if (cantidadClientesServiblesCafe>0) {
			for (int i=0, j=0; i<clientes.length; i++) {
				if (clientes[i] instanceof ServibleCafe) {
					serviblesCafe[j]=(ServibleCafe)clientes[i];
					j++;
				}
			}
		}else {
			System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"No hay nadie a quien poder servir café en el bar..."+ConsoleColors.RESET);
		}
		return serviblesCafe;
	}
	public void servirCafe(ServibleCafe[] serviblesCafe, TazaCafe[] tazasCafe) throws InsufficientCupsOfCoffeeException{
		System.out.println("Vamos a servir café (esperando a ser servidos="+serviblesCafe.length+")");
		mostrarTazasCafe(tazasCafe);
		if (tazasCafe.length<serviblesCafe.length) {
			InsufficientCupsOfCoffeeException icoce = new InsufficientCupsOfCoffeeException(ConsoleColors.RED_BOLD_BRIGHT+"No hay suficientes tazas de café!!"+ConsoleColors.RESET);
			throw icoce;
		}
		for (int i=0; i<serviblesCafe.length; i++) {
			try {
				serviblesCafe[i].tomarCafe(tazasCafe[i]);
				serviblesCafe[i]=null;
			}catch(TooHotTemperatureException thte) {
				System.out.println(thte.getMessage());
			}catch(TooColdTemperatureException tcte) {
				System.out.println(tcte.getMessage());
			}
			System.out.println("");
		}
	}
	public void mostrarTazasCafe(TazaCafe[] tazasCafe) {
		System.out.print("Ahora mismo hay estas tazas de café en el bar:\n\t");
		String stringsTazasCafe = ConsoleColors.PURPLE_BACKGROUND+Arrays.toString(tazasCafe).substring(1).replace("]]", "]"+ConsoleColors.RESET).replace("], ", "]"+ConsoleColors.RESET+"\n\t"+ConsoleColors.PURPLE_BACKGROUND);
		System.out.println(stringsTazasCafe);
	}
}