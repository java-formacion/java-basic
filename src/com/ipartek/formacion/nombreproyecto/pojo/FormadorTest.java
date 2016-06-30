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
		
		assertEquals("Angel",f.getNom());
		assertEquals("Angeles",f.getApell1());
		assertEquals("Angelico",f.getApell2());
		assertEquals("77777777L",f.getDni());
		assertEquals("angel@kkfonica",f.getEmail());
		
		f.setNom("Manolo");
		f.setApell1("El del");
		f.setApell2("Bombo");
		f.setDni("55555555T");
		f.setEmail("spain@isdiferent.com");
	
		assertEquals("Manolo",f.getNom());
		assertEquals("ElDel",f.getApell1());
		assertEquals("Bombo",f.getApell2());
		assertEquals("55555555T",f.getDni());
		assertEquals("spain@isdiferent.com",f.getEmail());
		
		//assertEquals("",((Curso)f.getCursos()).getCodigo());
		
		
	}

}
