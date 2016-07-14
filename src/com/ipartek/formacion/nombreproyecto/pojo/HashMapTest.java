package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void test() {
		HashMap<String, Persona> hmPersonas = new HashMap<String, Persona>();
		assertEquals(0, hmPersonas.size());
		assertTrue(hmPersonas.isEmpty());

		hmPersonas.put("1111111H", new Persona("Nombre", "Apellido uno", "Apellido dos", "1111111H", "mail@mail.com"));
		assertEquals(1, hmPersonas.size());
		assertFalse(hmPersonas.isEmpty());
		
		hmPersonas.get("1111111H");
	}

}