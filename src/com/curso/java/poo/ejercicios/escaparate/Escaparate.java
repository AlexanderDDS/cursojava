package com.curso.java.poo.ejercicios.escaparate;

public class Escaparate {

	public static void main(String[] args) {
		Boton boton1 = new Boton("redondo", "gris", 2.0);
		Boton boton2 = new Boton("redondo", "negro", 2.0);
		Boton[] botones = {boton1, boton1, boton1, boton1, boton1};
		Pantalon pantalon1 = new Pantalon("azul", 34.5, 40.0, boton2);
		Pantalon pantalon2 = new Pantalon("marrón", 36.0, 38.0, boton1);
		Camisa camisa1 = new Camisa("verde", "L", 27.5, botones);
		Camisa camisa2 = new Camisa("morada", "XL", 25.7, botones);
		Vestido vestido1 = new Vestido("naranja", "M", 57.5);
		Maniqui maniqui1 = new Maniqui("A1", pantalon1, camisa1);
		Maniqui maniqui2 = new Maniqui("B2", vestido1);
		Maniqui maniqui3 = new Maniqui("C3");
		Maniqui maniqui4 = new Maniqui("D4");
		maniqui3.vestir(vestido1);
		maniqui3.desvestir();
		maniqui3.vestir(camisa2,pantalon2);
		Maniqui[] maniquies = {maniqui1, maniqui2, maniqui3, maniqui4};
		Escaparate escaparate = new Escaparate();
		escaparate.mostrarEscaparate(maniquies);
		escaparate.mostrarPrecioDeLaRopa(maniquies);
	}
	public void mostrarEscaparate(Maniqui[] maniquies) {
		System.out.println("Vamos a ver qué llevan puesto los maniquíes:");
		for (Maniqui maniqui : maniquies) {
			if (maniqui.getVestido()!=null||maniqui.getPantalon()!=null||maniqui.getCamisa()!=null) {
				System.out.println("El maniquí "+maniqui.getId()+" lleva puesto:");
				if (maniqui.getVestido()!=null) {
					System.out.println("\t- Un vestido de color "+maniqui.getVestido().getColor()+" y talla "+maniqui.getVestido().getTalla());
				}if (maniqui.getPantalon()!=null) {
					System.out.println("\t- Un pantalón de color "+maniqui.getPantalon().getColor()+" y talla "+maniqui.getPantalon().getTalla()+", con un botón "+maniqui.getPantalon().getBoton().getForma()+" y "+maniqui.getPantalon().getBoton().getColor());
				}if (maniqui.getCamisa()!=null) {
					System.out.println("\t- Una camisa de color "+maniqui.getCamisa().getColor()+" y talla "+maniqui.getCamisa().getTalla()+", con "+maniqui.getCamisa().getBotones().length+" botones");
				}
			}
			else {
				System.out.println("El maniquí "+maniqui.getId()+" no lleva puesto nada");;
			}
			System.out.println("");
		}
	}
	public void mostrarPrecioDeLaRopa(Maniqui[] maniquies) {
		System.out.println("Vamos a ver el precio de la ropa de cada uno de los maniquíes:");
		for (Maniqui maniqui : maniquies) {
			double precioTotal=0.0;
			if (maniqui.getVestido()!=null||maniqui.getPantalon()!=null||maniqui.getCamisa()!=null) {
				System.out.println("El maniquí "+maniqui.getId()+" tiene:");
				if (maniqui.getVestido()!=null) {
					double precioVestido = maniqui.getVestido().getPrecio();
					System.out.println("\t- Un vestido de "+precioVestido+" euros");
					precioTotal+=precioVestido;
				}if(maniqui.getPantalon()!=null) {
					double precioPantalon = maniqui.getPantalon().getPrecio();
					System.out.println("\t- Un pantalón de "+precioPantalon+" euros");
					precioTotal+=precioPantalon;
				}if(maniqui.getCamisa()!=null)  {
					double precioCamisa = maniqui.getCamisa().getPrecio();
					System.out.println("\t- Una camisa de "+precioCamisa+" euros");
					precioTotal+=precioCamisa;
				}
				System.out.println("\tEl precio total es de "+precioTotal+" euros");
			}else {
				System.out.println("El maniquí "+maniqui.getId()+" no lleva puesto nada");
			}
			System.out.println("");
		}
		
	}
	
}
