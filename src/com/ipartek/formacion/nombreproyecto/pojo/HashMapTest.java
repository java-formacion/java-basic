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
		
		hmPersonas.put("11111111H", new Persona("Periko", "Palotes", "Duros", "11111111H", "palo@email.com"));
		assertEquals(1, hmPersonas.size());
		assertFalse(hmPersonas.isEmpty());
		Persona p = hmPersonas.get("11111111H");
		
		
	}

}
