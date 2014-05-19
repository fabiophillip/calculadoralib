package tutorial;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCalculadora {

	Calculadora calc;
	@Before
	public void setUp() throws Exception {
		calc = new Calculadora();
	}

	@Test
	public void testSoma() {
		assertEquals(calc.somar(2, 2), 4);
	}
	
	@Test
	public void testDividir() {
		assertEquals(calc.dividir(2, 2), 1);
	}
	
	@Test
	public void testMultiplicar() {
		assertEquals(calc.multiplicar(2, 2), 4);
	}
	
	@Test
	public void testSubtrair() {
		assertEquals(calc.subtrair(2, 2), 0);
	}

}
