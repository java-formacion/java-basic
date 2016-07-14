package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class HassMapTest {

	@Test
	public void test() {
		HashMap<String, Persona> hmPersonas = new HashMap<String, Persona>();
		assertEquals(1,hmPersonas.size());
		assertFalse(hmPersonas.isEmpty());
		
		hmPersonas.put("1122334H", new Persona("DonPinpon", "Barrio", "Sesamero", "1122334H", "donpin@gmail.com"));
		
		Persona DonPinpon = hmPersonas.get("1122334H");
	}

}
