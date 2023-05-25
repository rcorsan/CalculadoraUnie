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
		Calculadora prueba = new Calculadora(2,1);
	}

	@Test
	void testSumarr() {
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

		int a = 3;
		int b = 2;
		Calculadora prueba = new Calculadora(a,b);
		int multiplicar = prueba.multiplicar();
		int resultado = 6;
		assertEquals(resultado, multiplicar);
	}

	@Test
	void testDividir() {
		int a = 6;
		int b = 2;
		Calculadora prueba = new Calculadora(a,b);
		int dividir = prueba.dividir();
		int resultado = 3;
		assertEquals(resultado, dividir);
	}

}
