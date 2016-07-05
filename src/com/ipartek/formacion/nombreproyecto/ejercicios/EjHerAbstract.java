package com.ipartek.formacion.nombreproyecto.ejercicios;

import com.ipartek.formacion.nombreproyecto.pojo.Circulo;
import com.ipartek.formacion.nombreproyecto.pojo.Linea;
import com.ipartek.formacion.nombreproyecto.pojo.LineaColor;

public class EjHerAbstract {
	
	static Linea l1=new Linea();
	static LineaColor lc1 =new LineaColor();
	static Circulo c1=new Circulo();
	
	

	public static void main(String[] args) {
		
		l1.setLongitud(3);
		lc1.setLongitud(13);
		lc1.setColor("rojo");
		c1.setRadio(5);
		
		System.out.println(l1.dibujar());
		System.out.println(lc1.dibujar());
		System.out.println(c1.dibujar());
		

		
	}

}
