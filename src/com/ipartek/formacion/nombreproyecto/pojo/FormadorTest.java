package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class FormadorTest {

	@Test
	public void test() {
		
		Formador f = new Formador("Marta", "Lekue", "Arriaga", "33333333C", "marta@gmail.com");
		
		assertEquals("Marta", f.getNombre());
		assertEquals("Lekue", f.getApellido1());
		assertEquals("Arriaga", f.getApellido2());
		assertEquals("33333333C", f.getDni());
		assertEquals("marta@gmail.com", f.getEmail());
		
		assertNull(f.getCursos());
		
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		Curso c = new Curso("789","PHP", 120);
		cursos.add(c);
		f.setCursos(cursos);
		assertNotNull(f.getCursos());
		
		assertEquals("789", f.getCursos().get(0).getCodigo());
		assertEquals("PHP", f.getCursos().get(0).getNombre());
		assertEquals(120, f.getCursos().get(0).getHoras());
		
		
		
	}

}
