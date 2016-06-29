package com.ipartek.formacion.nombreproyecto.ejercicios;

import com.ipartek.formacion.nombreproyecto.pojo.Circulo;
import com.ipartek.formacion.nombreproyecto.pojo.DosRombos;
import com.ipartek.formacion.nombreproyecto.pojo.Linea;
import com.ipartek.formacion.nombreproyecto.pojo.LineaColor;
import com.ipartek.formacion.nombreproyecto.pojo.Triangulo;

public class EjercicioHerenciaAbstracto {

	public static void main(String[] args) {
		
		//Las clases abstract, añl ser incompleta la implementación no es posible instanciarlas
		// no podríamos hacer ObjetoGrafico og = new ObjetoGrafico();
		
		
		Linea l = new Linea();
		l.setX(10);
		l.setY(10);
		l.setLongitud(3);
		System.out.println(l.dibujar());
		
		LineaColor lc = new LineaColor();
		lc.setX(10);
		lc.setY(10);
		lc.setLongitud(13);
		System.out.println(lc.dibujar());
		
		Circulo c = new Circulo();
		c.setX(10);
		c.setY(10);
		c.setRadio(5);
		System.out.println(c.dibujar());
		
		Triangulo t = new Triangulo();
		t.setX(10);
		t.setY(10);
		System.out.println(t.dibujar());
		
		DosRombos dr = new DosRombos();
		System.out.println(dr.dibujar());
		
	}

}
