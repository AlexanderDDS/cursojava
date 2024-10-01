package test.java;

import org.junit.Before;
import org.junit.Test;

import com.curso.java.poo.herencia.ejercicios.tienda.Admin;
import com.curso.java.poo.herencia.ejercicios.tienda.Tienda;

public class TiendaTest {
	Admin admin1;
	Tienda tienda1;
	@Before
	public void metodo0() {
		admin1 = new Admin("Admin prueba", "user", "password", true);
		tienda1 = new Tienda("Tienda prueba");
	}
	@Test
	public void iniciarSesionTest() {
		
	}
}
