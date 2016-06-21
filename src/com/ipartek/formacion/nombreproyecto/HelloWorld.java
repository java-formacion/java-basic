package com.ipartek.formacion.nombreproyecto;

import com.ipartek.formacion.nombreproyecto.pojo.Candidato;
import com.ipartek.formacion.nombreproyecto.pojo.Libro;
import com.ipartek.formacion.nombreproyecto.pojo.Perro;

public class HelloWorld {

	public static void main(String[] args) {
		
		
		//instanciar objeto<Candidato>
		Candidato objeto = new Candidato();
		
		//sin encapsular
		//objeto.nombre = "Ander";
		
		//encapsulado el atributo
		objeto.setNombre("Ander");
		
		
		//System.out.println("Hola " + objeto.nombre );
		System.out.println("Hola " + objeto.getNombre() );
		
		
		/*
		objeto.apellido1 = "Uraga";
		objeto.apellido2 = "Real";
		objeto.dni = "1111111F";
		*/
				
		//System.out.println("Hola " + objeto.nombre + " " + objeto.apellido1 + " " + objeto.apellido2 + " " + objeto.dni);
  
		Perro buba = new Perro("Buba");
		buba.setEdad(7);
		
		System.out.println( buba.toString() );
		
		//instanciar objeto tipo Libro
		Libro libroJava = new Libro("java 6");
		libroJava.setAutor("Roberto Montero Miguel");
		libroJava.setIsbn("deadasd-asdasd-232e");
		libroJava.setPaginas(320);
		
		System.out.println(  libroJava.toString() );
		
		
	}

}
