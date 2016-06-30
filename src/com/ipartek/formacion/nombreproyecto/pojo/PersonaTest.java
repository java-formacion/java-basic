package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void test() {
		
		CandidatoNuevo ca1 = new CandidatoNuevo("pEpe", "poRras", 4);
		ca1.setApellido2(" apellido2");
		ca1.setEmail("pepito@gmail.com");

		assertEquals("Pepe", ca1.getNombre());
		assertEquals("Porras", ca1.getApellido1());
		assertEquals("Apellido2", ca1.getApellido2());
		assertEquals("pepito@gmail.com", ca1.getEmail());
				
	}

}
