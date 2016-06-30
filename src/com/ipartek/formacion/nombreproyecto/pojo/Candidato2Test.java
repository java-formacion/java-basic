package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Candidato2Test {

	@Test
	public void test() {
		
		Candidato2 candidato = new Candidato2("Paco", "Perez", "Gomez", "22222222B", "paco@yahoo.com");
		assertEquals("Paco", candidato.getNombre());
		assertEquals("Perez", candidato.getApellido1());
		assertEquals("Gomez", candidato.getApellido2());
		assertEquals("22222222B", candidato.getDni());
		assertEquals("paco@yahoo.com", candidato.getEmail());
		
		candidato.setNota(11);
		assertEquals(candidato.NOTA_MAXIMA, candidato.getNota());
		assertTrue(candidato.estaAceptado());
		
		candidato.setNota(-1);
		assertEquals(candidato.NOTA_MINIMA, candidato.getNota());
		assertFalse(candidato.estaAceptado());
		
		
		
	}

}
