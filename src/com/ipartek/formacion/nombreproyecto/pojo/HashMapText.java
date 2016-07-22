package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class HashMapText {

	@Test
	public void test() {
		HashMap<String, Persona> hmPersonas = new HashMap<String, Persona>();

		assertEquals(0, hmPersonas.size());
		assertTrue(hmPersonas.isEmpty());

		hmPersonas.put("23456784H", new Persona("pepito", "tres", "palotes", "23456784H", "palotestres@gmail.com"));
		assertEquals(1, hmPersonas.size());
		assertFalse(hmPersonas.isEmpty());
		
		
	}

}
