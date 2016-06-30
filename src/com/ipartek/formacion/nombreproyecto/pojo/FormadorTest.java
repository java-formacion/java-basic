package com.ipartek.formacion.nombreproyecto.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class FormadorTest {

	@Test
	public void test() {
		
		Curso cursoJava = new Curso("5865", "Curso de JAVA", 125);
		Curso cursoAndroid = new Curso("5867", "Curso de Android", 150);
		ArrayList<Curso> aCursos= new ArrayList<Curso>();
		aCursos.add(cursoJava);
		aCursos.add(cursoAndroid);
		Formador f = new Formador("ANGEL", "AngelEs", "Angelico", "77777777L", "angel@kkfonica", aCursos);
		assertEquals("Angeles",f.getApell1());
	}

}
