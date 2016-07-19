package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void test() {
		HashMap<String, Persona> hmPersonas = new HashMap<String, Persona>();
		
		hmPersonas.put("11111111H", new Persona("Ernesto", "Pecho", "Presto", "11111111H", "pechoPresto@gmail.com"));
		assertFalse(hmPersonas.isEmpty());
	}

}
