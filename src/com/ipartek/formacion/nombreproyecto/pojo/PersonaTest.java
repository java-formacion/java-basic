package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void test() {
		
		Persona p = new Persona("Pepe", "Palitos", "Palotes", "1111111A", "pepito@gmail.com");
		assertEquals("Pepe", p.getNombre());
		assertEquals("Palitos", p.getApellido1());
		assertEquals("Palotes", p.getApellido2());
		assertEquals("1111111A", p.getDni());
		assertEquals("pepito@gmail.com", p.getEmail());
	}

}
