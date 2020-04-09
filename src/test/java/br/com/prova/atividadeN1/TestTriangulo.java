package br.com.prova.atividadeN1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.prova.model.Triangulo;

public class TestTriangulo {
	
	@Before
	public void setUp() throws Exception {
		new Triangulo(1,1,1);
	}
	
		
	@Test
	public void testeTriangulo() {
		assertFalse(new Triangulo(0,0,0).eTriangulo());
		assertTrue(new Triangulo(14,11,8).eTriangulo());
	}
	
	@Test
	public void testeTrianguloEquilatero() {
		assertEquals("Triangulo Equilatero", new Triangulo(4,4,4).tipoTriangulo());
		assertEquals("Triangulo Equilatero", new Triangulo(2,2,5).tipoTriangulo());
	}
	
	@Test
	public void testeTrianguloEscaleno() {
		assertEquals("Triangulo Escaleno", new Triangulo(5,5,5).tipoTriangulo());
		assertEquals("Triangulo Escaleno", new Triangulo(10,7,5).tipoTriangulo());
	}
	
	@Test
	public void testeTrianguloIsoceles() {
		assertEquals("Triangulo Isosceles", new Triangulo(5,6,5).tipoTriangulo());
		assertEquals("Triangulo Isosceles", new Triangulo(2,2,0).tipoTriangulo());
		assertEquals("Triangulo Isosceles", new Triangulo(2,2,-5).tipoTriangulo());
	}
}