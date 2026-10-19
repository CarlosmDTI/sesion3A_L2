package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sesion3A.Calculadora;

class CalculadoraTest {
	
	@Test
	void testSuma() {
		assertEquals(5, Calculadora.suma(2,3));
	}
	
	@Test
	void testResta() {
		assertEquals(5, Calculadora.resta(10,5));
	}
	
	@Test
	void testMultiplicacion() {
		assertEquals(6, Calculadora.multiplica(2,3));
	}
	
	@Test
	void testDivision() {
		assertEquals(2, Calculadora.division(4,2));
	}
	
}
