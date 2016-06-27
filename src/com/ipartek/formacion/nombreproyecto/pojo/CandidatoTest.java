package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandidatoTest {

	@Test
	public void testCandidato() {
		Candidato c = new Candidato("manolo", "55555555H");
		assertEquals("Manolo", c.getNombre());
	}

	@Test
	public void testGetCapitalizar() {
	
		Candidato c = new Candidato("manolo", "55555555H");
		c.setApellido1("goRRiti");
		assertEquals("Gorriti", c.getApellido1());
	}
	
	
}
