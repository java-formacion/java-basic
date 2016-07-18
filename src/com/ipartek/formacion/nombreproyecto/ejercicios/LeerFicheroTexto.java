package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.ipartek.formacion.nombreproyecto.pojo.Persona;

public class LeerFicheroTexto {

	public static void main(String[] args) {
		
		long tiempo = System.currentTimeMillis();
		String pathFichero = "data/personas.txt";
		
		try{
			FileReader fr = new FileReader(pathFichero);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			Persona p = null;
			int cont = 0;
			int contErrores = 0;
			String campos[];
			StringBuffer sb = new StringBuffer();
			while( (linea = br.readLine()) != null ){
				
				campos = linea.split(",");
				if ( campos.length == 7){
					//crear objeto persona
					p = new Persona(campos[0], campos[1], campos[2],  campos[5],  campos[4]);
					//TODO insertar en tabla de la bbdd
					
				}else{
					contErrores++;
					sb.append( cont + ": " + linea);
				}						
				cont++;				
			}
			
			System.out.println("-----------------------------");
			System.out.println("Personas leidas: " + cont );
			System.out.println("Personas Erroneas: " + contErrores );
			System.out.println("Detalle lineas Erroneas: ");
			System.out.println( sb.toString() );
			System.out.println("----------------------------------------");
			System.out.println("Tiempo: " + ( System.currentTimeMillis() - tiempo ) + " ms");
			System.out.println("----------------------------------------");
			
			
			br.close();
			fr.close();
			
		}catch(FileNotFoundException e){
			System.out.println("No se puede leer fichero " + pathFichero);
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Excepcion no controlada");
			e.printStackTrace();
		}	
		
	}
	
}
