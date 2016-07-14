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
		
		hmPersonas.put("1111111H", new Persona("Perico", "Palotes", "Gorriti", "1111111H", "perico@palotes.com"));
		assertEquals(1, hmPersonas.size());
		assertTrue(hmPersonas.isEmpty());
		
		
		Persona periko = hmPersonas.get("1111111H");
		
	}

}
