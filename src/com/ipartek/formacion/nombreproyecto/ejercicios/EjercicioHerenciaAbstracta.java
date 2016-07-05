package com.ipartek.formacion.nombreproyecto.ejercicios;

import com.ipartek.formacion.nombreproyecto.pojo.DosRombos;
import com.ipartek.formacion.nombreproyecto.pojo.Linea;
import com.ipartek.formacion.nombreproyecto.pojo.LineaColor;


public class EjercicioHerenciaAbstracta {

	public static void main(String[] args) {

		//Las clases abstract al ser imcompleta la implementacion
		//no es posible instanciarlas
		// ObjetoGrafico og = new ObjetoGrafico();
			
		
		Linea l = new Linea();
		l.setLongitud(3);
		System.out.println( l.dibujar() );
		
		LineaColor lc = new LineaColor();
		lc.setLongitud(13);
		lc.setColor("rojo");
		System.out.println( lc.dibujar() );
		
		
		DosRombos dr = new DosRombos();
		System.out.println( dr.dibujar() );
		
	}

}
