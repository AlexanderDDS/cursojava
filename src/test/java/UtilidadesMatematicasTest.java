package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.curso.java.utils.UtilidadesMatematicas;

public class UtilidadesMatematicasTest {
	@Test
	public void testSumar() { 
		int resultado = UtilidadesMatematicas.sumar(2, 3);
		assertEquals(5, resultado);
	}
	@Test
	public void testOperarSuma() {
		double resultado = UtilidadesMatematicas.operar(1, 2, "+");
		assertEquals(3, resultado, 0);
	}
	@Test
	public void testOperarResta() {
		double resultado = UtilidadesMatematicas.operar(2, 1, "-");
		assertEquals(1, resultado, 0);
	}
	@Test
	public void testOperarMultiplicacion() {
		double resultado = UtilidadesMatematicas.operar(2, 3, "*");
		assertEquals(6, resultado, 0);
	}
	@Test
	public void testOperarDivision() {
		double resultado = UtilidadesMatematicas.operar(6, 3, "/");
		assertEquals(2, resultado, 0);
	}
}
