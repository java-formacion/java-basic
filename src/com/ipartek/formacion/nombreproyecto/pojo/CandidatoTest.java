package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandidatoTest {

	@Test
	public void testCandidato() {
		
		Candidato c = new Candidato("manolo", "1111111H");
		
		assertEquals("Manolo", c.getNombre() );
		//TODO resto de atributos
		
		
		
	}

	@Test
	public void testGetCapitalizar() {
		
		Candidato c = new Candidato("manolo", "1111111H");
		c.setApellido1("goRRiti");
		assertEquals("Gorriti", c.getApellido1() );
		
		//TODO resto de Setter y getters
		
		
	}

	

}
