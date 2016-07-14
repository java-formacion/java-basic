package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.ipartek.formacion.nombreproyecto.pojo.Persona;

public class LeerFicheroTexto {
	
	public static void main(String[] args) {
		
		String  pathFichero = "data/personas.txt";
		
		try {
			FileReader fr = new FileReader(pathFichero);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			int cont = 0;
			int contError = 0;
			ArrayList<Persona> p = new ArrayList<Persona>();
			
			while( (linea = br.readLine()) != null ){
				
				System.out.println(linea);
				
				String campos[] = linea.split(",");
								
				//crear objeto persona
				//contar cuantos se crean y cuantos dan error (si <7 = MAL)
				if(campos.length == 7){
					p.add( new Persona(campos[0], campos[1], campos[2], campos[5], campos[4]));
					cont++;
				}else{
					contError++;
				}				
				
			}
			
			System.out.println("----------------------");
			System.out.println("Personas leidas: " + cont);
			System.out.println("Personas erroneas: " + contError);
			
			
			br.close();
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se puede leer el fichero " + pathFichero);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Excepcion no controlada");
			e.printStackTrace();
		}
		
		
	}

	
	
}
