package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CandidatoTest {

	@Test
	public void Candidatotest() {
		Candidato c = new Candidato("Mikel", "Alonso", "Alonso", "00000000K", "mikel@kktel.com", 8);
		
		
		
		
		assertEquals("Mikel", c.getNom());
		
		c.setNom("mIkEl  ");
		
		assertEquals("Mikel", c.getNom());
		assertEquals(true, c.isAceptado());
		
		c.setNota(-1);
		assertEquals(0,c.getNota());
		
		
	}

}
