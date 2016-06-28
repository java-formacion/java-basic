package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandidatoTest {

	@Test
	public void testCandidato() {
		
		Candidato c = new Candidato("manolo", "1111111H");
		
		assertEquals("Manolo", c.getNombre() );
		assertEquals("1111111H", c.getDni());
		
		
		
	}

	@Test
	public void testGetCapitalizar() {
		
		Candidato c = new Candidato("manolo", "1111111H");
		c.setApellido1("goRRiti");
		assertEquals("Gorriti", c.getApellido1() );
		c.setApellido2(" roDriguez");
		assertEquals("Rodriguez", c.getApellido2() );
		
		
		
	}

}
