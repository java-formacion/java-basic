package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.nombreproyecto.HelloWorld;

public class DadoTest {

	@Test
	public void test() {
		
		String titulo = "Java 6";
		Libro l3 = new Libro(titulo,"","",0);
		
		assertTrue("titulo incorrecto", titulo.equals(l3.getTitulo()));
		assertTrue(l3.getPags()==0);
		assertTrue(l3.getIsbn().equals(""));
	}

}


