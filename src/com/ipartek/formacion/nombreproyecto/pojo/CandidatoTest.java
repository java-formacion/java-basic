package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandidatoTest {

	@Test
	public void testCandidato() {
		Candidato c = new Candidato("manolo", "xxxx");
		
		assertEquals("Manolo", c.getNombre());
		
	}

	@Test
	public void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetApellido1() {
		fail("Not yet implemented");
	}

}
