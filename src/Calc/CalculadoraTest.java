package Calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	

	@Test
	void testCalculadora() {
		fail("Not yet implemented");
	}

	@Test
	void testSumarr() {
		//comentario
		int a = 2;
		int b = 3;
		Calculadora prueba = new Calculadora(a,b);
		int suma = prueba.sumar();
		int resultado = 5;
		assertEquals(resultado, suma);
		
	}

	@Test
	void testRestar() {
		
		int a = 3;
		int b = 2;
		Calculadora prueba = new Calculadora(a,b);
		int restar = prueba.restar();
		int resultado = 1;
		assertEquals(resultado, restar);
	}

	@Test
	void testMultiplicar() {
		fail("Not yet implemented");
	}

	@Test
	void testDividir() {
		fail("Not yet implemented");
	}

}
