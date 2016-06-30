package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CursoTest {

	@Test
	public void test() {
		
		Curso c = new Curso("cod1", "Java avanzado", 510);
		assertEquals("cod1", c.getCodigo());
		assertEquals("Java Avanzado", c.getNombre());
		assertEquals(510, c.getHoras());
		
	}

}
