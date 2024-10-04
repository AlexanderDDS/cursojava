package com.curso.java.colecciones.ejercicios.juguetes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

import com.curso.java.utils.Utilidades;

public class Tienda {

	public static void main(String[] args) {
		Tienda tienda = new Tienda();
		tienda.abrirTienda();
	}
	public void abrirTienda() {
		List<Juguete> juguetes = crearListaJuguetes();
		System.out.println("Precio total="+daPrecioTotalJuguetesMuestraModeloTrenes(juguetes)+" euros");
		// B) metodoUsandoListIterator(juguetes);
		// A) borrarMuniecasMismoColor(juguetes);
		
		muestraJuguetes(juguetes);
	}
	//4 objetos 2 trenes y 2 muñecas. Se meten en una lista
	private List<Juguete> crearListaJuguetes() {
		//List<Juguete> juguetes = new ArrayList();
		List<Juguete> juguetes = new CopyOnWriteArrayList(); // C) El mejor método, simplemente crear lista al principio como CopyOnWriteArrayList, en lugar de ArrayList
		Juguete j1 = new Tren("Tren1", 30.0, "Bizak", "T400");
		Juguete j2 = new Tren("Tren2", 20.0, "Bizak", "A80");
		Juguete j3 = new Munieca("Muñeca1", 43.0, "Bizak", "rojo");
		Juguete j4 = new Munieca("Muñeca2", 38.0, "Bizak", "verde");
		juguetes.add(j1);
		juguetes.add(j2);
		juguetes.add(j3);
		juguetes.add(j4);
		return juguetes;
	}
	//Recorrer lista. Mostrar el precio total de todos los juguetes de la lista. Cuando sea un tren, el modelo de tren
	public double daPrecioTotalJuguetesMuestraModeloTrenes(List<Juguete> juguetes) {
		double precioTotal=0.0;
		for (Juguete juguete : juguetes) {
			precioTotal+=juguete.getPrecio();
			if (juguete instanceof Tren) {
				System.out.println("Modelo="+((Tren)juguete).getModelo());
			}
		}
		return precioTotal;
	}
	//Preguntar por un color y borrar todas las muñecas de ese color
	public List<Juguete> crearListaJuguetesConMuniecasMismoColor(List<Juguete> juguetes) {
		List<Juguete> muniecasMismoColor = new ArrayList(); // A)
		String colorSeleccionado = Utilidades.pideDatoString("Escoja un color de muñeca:").toLowerCase().trim();
		for (Juguete juguete : juguetes) {
			if (juguete instanceof Munieca) {
				if (((Munieca)juguete).getColor().toLowerCase().equals(colorSeleccionado)) {
					juguetes.remove(juguete); //=========== Esto dará ConcurrentModificationException, no se puede cambiar tamaño de lista (al usar remove() ) mientras se está recorriendo esa lista. ===========
												// =============================== POSIBLES SOLUCIONES: A) B) C) ===============================
					//muniecasMismoColor.add(juguete); // A)
				}
			}
		}
		return muniecasMismoColor; // A)
	}
	// A) Método alternativo creando otra lista con muñecas del color que queremos borrar (mientras recorremos lista original), y luego usando removeAll() las quitamos en este método
	public void borrarMuniecasMismoColor(List<Juguete> juguetes) {
		System.out.println("Vamos a borrar de la lista de juguetes todas las muñecas de un mismo color");
		juguetes.removeAll(crearListaJuguetesConMuniecasMismoColor(juguetes));
	}
	// B) Método alternativo creando ListIterator en lugar de List, para evitar ConcurrentModificationException
	private void metodoUsandoListIterator(List<Juguete> juguetes) {
		ListIterator<Juguete> juguetesLI = juguetes.listIterator();
		String colorSeleccionado = Utilidades.pideDatoString("Escoja un color de muñeca:").toLowerCase().trim();
		while(juguetesLI.hasNext()){
			if (juguetesLI.next() instanceof Munieca) {
				if(((Munieca)juguetesLI.next()).getColor().toLowerCase().equals(colorSeleccionado)){
					juguetesLI.remove();
				}
			}
		}
	}
	public void muestraJuguetes(List<Juguete> juguetes) {
		for (Juguete juguete : juguetes) {
			System.out.println(juguete);
		}
	}
}