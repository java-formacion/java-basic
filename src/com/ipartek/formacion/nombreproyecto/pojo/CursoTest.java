package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CursoTest {

	@Test
	public void test() {
		
		Curso c = new Curso("aoedjk", "Java avanzado", 510);
		assertEquals("aoedjk", c.getCodigo());
		assertEquals("Java avanzado", c.getNombre());
		assertEquals(510, c.getHoras());
		
	}

}
