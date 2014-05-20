package tutorial;

import static org.junit.Assert.*;

import java.util.logging.Level;
import tutorial.Calculadora;
import org.junit.Before;
import org.junit.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class TesteCalculadora {

	static final Logger logger = Logger.getLogger(TesteCalculadora.class);
	Calculadora calc;
	@Before
	public void setUp() throws Exception {
		calc = new Calculadora();
	}

	@Test
	public void testSoma() {
		int resultadoSoma2Mais2 = calc.somar(2, 2);
		DOMConfigurator.configure("log4j.properties");

		logger.info("resultado testSoma() 2 + 2:" + resultadoSoma2Mais2);
		assertEquals(resultadoSoma2Mais2, 4);
		
	}
	
	@Test
	public void testDividir() {
		int resultadoDivisao = calc.dividir(2, 2);
		DOMConfigurator.configure("log4j.properties");
		logger.info("resultado testDividir() 2 / 2:" + resultadoDivisao);
		assertEquals(resultadoDivisao, 1);
	}
	
	@Test
	public void testMultiplicar() {
		int resultadoMultiplicacao = calc.multiplicar(2, 2);
		DOMConfigurator.configure("log4j.properties");
		logger.info("resultado testMultiplicar() 2 * 2:" + resultadoMultiplicacao);
		assertEquals(resultadoMultiplicacao, 4);
	}
	
	@Test
	public void testSubtrair() {
		int resultadoSubtrair = calc.subtrair(2, 2);
		DOMConfigurator.configure("log4j.properties");
		logger.info("resultado testSubtrair() 2 - 2:" + resultadoSubtrair);
		assertEquals(calc.subtrair(2, 2), 0);
	}

}
