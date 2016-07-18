package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;



public class HashMapTest {

	
	@Test
	public void test() {
		
		HashMap<String,Persona> hmPersonas = new HashMap<String, Persona>();
		
		//Aqui todavia la fila esta vacia
		
		 assertEquals(0,hmPersonas.size());
		 assertTrue(hmPersonas.isEmpty());
		
		 
		 hmPersonas.put("111111H", new Persona("pepe", "gorriti", "iza", "111111H", "JJJ@gsmail"));
		 
		 //Como hemos añadido una fila ya te comprueba que ya no esta vacio false= d (isEmpty)
		 
		 assertEquals(1,hmPersonas.size());
		 assertFalse(hmPersonas.isEmpty());
			
		
		 
	}

}
