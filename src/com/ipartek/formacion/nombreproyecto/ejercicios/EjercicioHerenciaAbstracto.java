package com.ipartek.formacion.nombreproyecto.ejercicios;

import com.ipartek.formacion.nombreproyecto.pojo.DosTriangulos;
import com.ipartek.formacion.nombreproyecto.pojo.Linea;
import com.ipartek.formacion.nombreproyecto.pojo.LineaColor;
public class EjercicioHerenciaAbstracto {

	public static void main(String[] args) {
		
		//Las clases abstract al ser incompleta la implementacion
		//no es posible instanciarlas
		//MAL ObjetoGrafico og = new ObjetoGrafico(); 
		Linea l1 = new Linea();		
		l1.setLongitud(3);
		System.out.println(l1.dibujar());
		
		LineaColor lc1 = new LineaColor();
		lc1.setLongitud(13);
		lc1.setColor("azul");
		System.out.println(lc1.dibujar());
		
		DosTriangulos dt1 = new DosTriangulos();		
		dt1.setTipo("equilatero");
		System.out.println(dt1.dibujar());
		
	}

}
