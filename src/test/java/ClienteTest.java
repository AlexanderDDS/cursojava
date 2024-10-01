package test.java;

import com.curso.java.poo.herencia.ejercicios.tienda.Cliente;
import com.curso.java.poo.herencia.ejercicios.tienda.Libro;
import com.curso.java.poo.herencia.ejercicios.tienda.Producto;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("a", "1", "2", true);
		Libro libro1 = new Libro("123", 50.5, "1234123", "Libro 1");
		Libro libro2 = new Libro("456", 52.3, "9876987", "Libro 2");
		Producto[] productos = {(Producto)libro1, (Producto)libro2};
		cliente.setCarritoCompra(productos);
		double precioTotal = 102.8;
		cliente.pagar(precioTotal);
	}

}
