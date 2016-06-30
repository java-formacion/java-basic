package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CursoTest {

	@Test
	public void test() {
	
		Curso cursoJava = new Curso("5865", "Curso de JAVA", 125);
		
		assertEquals("5865",cursoJava.getCodigo());
		assertEquals("Curso de JAVA",cursoJava.getNombre());
		assertEquals(125,cursoJava.getHoras());
		
		cursoJava.setCodigo("5867");
		cursoJava.setNombre("Curso de Android");
		cursoJava.setHoras(150);
		
		assertEquals("5867",cursoJava.getCodigo());
		assertEquals("Curso de Android",cursoJava.getNombre());
		assertEquals(150,cursoJava.getHoras());
		
	}

}
