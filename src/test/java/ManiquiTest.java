package test.java;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.curso.java.poo.ejercicios.escaparate.Boton;
import com.curso.java.poo.ejercicios.escaparate.Camisa;
import com.curso.java.poo.ejercicios.escaparate.Maniqui;
import com.curso.java.poo.ejercicios.escaparate.Pantalon;
import com.curso.java.poo.ejercicios.escaparate.Vestido;

public class ManiquiTest {
	Maniqui maniqui1;
	Maniqui maniqui2;
	Maniqui maniqui3;
	Maniqui maniqui4;
	@Before
	public void metodo0() {
		Boton boton1 = new Boton("redondo", "gris", 2.0);
		Boton boton2 = new Boton("redondo", "negro", 2.0);
		Boton[] botones = {boton1, boton1, boton1, boton1, boton1};
		Pantalon pantalon1 = new Pantalon("azul", 34.5, 40.0, boton2);
		Pantalon pantalon2 = new Pantalon("marrón", 36.0, 38.0, boton1);
		Camisa camisa1 = new Camisa("verde", "L", 27.5, botones);
		Camisa camisa2 = new Camisa("morada", "XL", 25.7, botones);
		Vestido vestido1 = new Vestido("naranja", "M", 57.5);
		maniqui1 = new Maniqui("A1", pantalon1, camisa1);
		maniqui2 = new Maniqui("B2", vestido1);
		maniqui3 = new Maniqui("C3");
		maniqui4 = new Maniqui("D4");
	}
	
	@Test
	public void vestirConVestidoTest() {
		Vestido vestidoRojo = new Vestido("rojo", "L", 40);
		maniqui3.vestir(vestidoRojo);
		assertNotNull(maniqui3.getVestido());
	}
	@Test
	public void desvestirTest() {
		maniqui2.desvestir();
		assertNull(maniqui3.getPantalon());
		assertNull(maniqui3.getCamisa());
		assertNull(maniqui3.getVestido());
	}
	@Test
	public void camisaConBotonesTest() {
		assertNotEquals(0, maniqui1.getCamisa().getBotones().length);
	}
}
