package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListTest {

	// crear objeto paises de tipo arrayist
	ArrayList<String> paises;

	// creacion de constantes
	static final String ITALIA = "Italia";
	static final String ALEMANIA = "Alemania";
	static final String FRANCIA = "Francia";

	@Test
	public void test() {

		// paises es nula? Si
		assertNull(paises);

		// inicializar objeto paises
		paises = new ArrayList<String>();

		// paises nulas? No
		assertNotNull(paises);

		// Tamaño de paises vacio ? Si
		assertTrue(paises.isEmpty());
		assertEquals(0, paises.size());

		// meter paises en la arraylist
		paises.add(ALEMANIA);
		paises.add(ITALIA);
		paises.add(FRANCIA);
		paises.add(FRANCIA);

		// tamaño de la arraylist
		assertEquals(4, paises.size());

		// comprobar que el primer pais es alemania en la arraylis paises y el
		// los demas paises
		assertEquals(paises.get(0), ALEMANIA);
		assertEquals(paises.get(1), ITALIA);
		assertEquals(paises.get(2), FRANCIA);
		assertEquals(paises.get(3), FRANCIA);

		// buscar indice de alemania
		assertEquals(2, paises.indexOf(FRANCIA));
		assertEquals(-1, paises.indexOf("INGLATERRA"));

		// elimina LOS DOS ultimoS paisES
		paises.remove(paises.size() - 1);
		paises.remove(paises.size() - 1);
		
		// tamaño de la arraylist
		assertEquals(2, paises.size());

		paises.add(1 , FRANCIA);
		
		assertEquals(paises.get(0), ALEMANIA);
		assertEquals(paises.get(1), FRANCIA);
		assertEquals(paises.get(2), ITALIA);
	}

}
