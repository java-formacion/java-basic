package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandidatoTest {

	@Test
	public void testCapitalizarString() {
		assertEquals("Andoni", Candidato.capitalizarString("andoni"));
		assertEquals("Andoni", Candidato.capitalizarString("ANDONI"));
		assertEquals("Andoni", Candidato.capitalizarString("Andoni"));
		assertEquals("AndoniLunaMoreno", Candidato.capitalizarString("ANDONI luna MorEnO"));
		assertEquals("AndoniLunaMoreno", Candidato.capitalizarString("andoni luna moreno"));
		assertEquals("AndoniLunaMoreno", Candidato.capitalizarString("ANDONI luna MORENO"));
		assertEquals(null, Candidato.capitalizarString(null));
		assertEquals("AndoniLunaMoreno", Candidato.capitalizarString("ANDONI  luna MORENO"));
	}

}
