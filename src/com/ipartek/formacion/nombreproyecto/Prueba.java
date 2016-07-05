package com.ipartek.formacion.nombreproyecto;

import com.ipartek.formacion.apppersona.Persona;
import com.ipartek.formacion.nombreproyecto.Utilidades;


public class Prueba {


	public static void main(String[] args) {
		Persona p1 = new Persona("fDtr ewtSd","dsaDSAa","fsdf","654366433","njldakl@as.com",0);
		
		
		
		Utilidades.validarNombre(p1.getNombre(),p1.getApellido1(),p1.getApellido2());
		Utilidades.validarEmail(p1.getEmail());
		
		System.out.println(Utilidades.validarNombre(p1.getNombre(),p1.getApellido1(),p1.getApellido2()));
		System.out.println(Utilidades.validarEmail(p1.getEmail()));
	}

}
