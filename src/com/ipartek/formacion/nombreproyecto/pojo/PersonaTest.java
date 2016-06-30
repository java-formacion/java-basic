package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void test() {
		
		Persona p = new Persona("pepe", "palitos", "palotes", "77777777P", "opkp@koko.com");
		assertEquals("Pepe", p.getNom());
		assertEquals("Palitos", p.getApell1());
		assertEquals("Palotes", p.getApell2());
		assertEquals("77777777P", p.getDni());
		assertEquals("opkp@koko.com", p.getEmail());
	}

}
