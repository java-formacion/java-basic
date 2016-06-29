package com.ipartek.formacion.ejercicios;

public class HerenciaClaseAbstracta {
	public static void main(String[] args) {
		
		//Las clases abstractas al ser incompleta la implementación
		//no es posible instanciarlas
		//ObjetoGrafico og = new ObjetoGrafico();
		
		//Creamos objetos de las clases hijas de ObjetoGrafico
		Linea l1 = new Linea();
		LineaColor lc1 = new LineaColor();
		Cuadrado cuad1 = new Cuadrado();
		Circulo cir1 = new Circulo();
		//Les pasamos valores
		l1.setLongitud(3);
		lc1.setLongitud(13);
		lc1.setColor("rojo");
		cuad1.setSuperficie(7);
		cir1.setArea(8);
		//Muestro los resultados
		System.out.println(l1.dibujar());
		System.out.println(lc1.dibujar());
		System.out.println(cuad1.dibujar());
		System.out.println(cir1.dibujar());
	}
}
