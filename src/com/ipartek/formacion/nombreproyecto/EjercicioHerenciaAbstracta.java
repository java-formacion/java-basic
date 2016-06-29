package com.ipartek.formacion.nombreproyecto;

import com.ipartek.formacion.nombreproyecto.pojo.Circulo;
import com.ipartek.formacion.nombreproyecto.pojo.DosRombos;
import com.ipartek.formacion.nombreproyecto.pojo.Linea;
import com.ipartek.formacion.nombreproyecto.pojo.LineaColor;
import com.ipartek.formacion.nombreproyecto.pojo.Triangulo;

public class EjercicioHerenciaAbstracta {

	public static void main(String[] args) {
		
		Linea l = new Linea(3);
		LineaColor lc = new LineaColor(13,"rojo");
		Circulo c = new Circulo(5);
		Triangulo t = new Triangulo(3,4,7);
		DosRombos dr = new DosRombos();
		
		
		System.out.println(l.dibujar());
		System.out.println(lc.dibujar());
		System.out.println(c.dibujar());
		System.out.println(t.dibujar());
		System.out.println(dr.dibujar());
	}

}
