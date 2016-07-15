package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.ipartek.formacion.nombreproyecto.pojo.Persona;

public class LeerFicheroTexto {
	
	public static void main(String[] args) {
		
	String pathFichero = "data/personas.txt";
	try {
		FileReader fr = new FileReader(pathFichero);
		BufferedReader br = new BufferedReader(fr);
		
		String linea = "";
		
		int cont = 0;
		int cont2 = 0;
				
		ArrayList pErronea[] = null;
		
		while ( (linea = br.readLine()) != null){
			System.out.println(linea);
			
			String campos[] = linea.split(",");  //me crea un array en el que en cada posicion me 
												//guarda los datos de la linea que estan separados por ","
			//TODO crear objeto Persona
			if(campos.length != 7){
				Persona p = Persona(campos[1], campos[2], campos[3], campos[6], campos[5]);
				cont2++;
				ArrayList pErronea = ArrayList(p);
				
			}else{
				
			}
			
			cont++;
			
		}
		
		System.out.println("------------------------------");
		System.out.println("Personas leídas: " + cont);
		System.out.println("Personas erroneas: " + cont2);
		
		br.close();
		fr.close();
		
	} catch (FileNotFoundException e) {
		System.out.println("No se puede leer el fichero" + pathFichero);
		e.printStackTrace();
	}catch (Exception e) {
		System.out.println("Excepion no controlada");
		e.printStackTrace();
	}
	

	}
}