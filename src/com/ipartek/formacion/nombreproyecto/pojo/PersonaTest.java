package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void test() {
		
		CandidatoNuevo ca1 = new CandidatoNuevo("pepe", "porras");
		ca1.setApellido2(" apellido2");
		assertEquals("Apellido2", ca1.ape2);
		
				
	}

}
