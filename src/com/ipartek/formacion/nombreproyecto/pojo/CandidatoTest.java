package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CandidatoTest {

	@Test
	public void Candidatotest() {
		
		Candidato c = new Candidato("Mikel  ", "alonso", "AlONso", "00000000K", "mikel@kktel.com", 8);
		
		assertEquals("Mikel", c.getNom());
		assertEquals("Alonso", c.getApell1());
		assertEquals("Alonso", c.getApell2());
		assertEquals("00000000K", c.getDni());
		assertEquals("mikel@kktel.com", c.getEmail());
		assertEquals(8, c.getNota());
		assertEquals(true, c.isAceptado());
		
		c.setNota(-1);
		assertEquals(0,c.getNota());
		assertEquals(false,c.isAceptado());
		
		c.setNota(15);
		assertEquals(10,c.getNota());
		assertEquals(true,c.isAceptado());
		
		
	}

}
