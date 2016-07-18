package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.ipartek.formacion.nombreproyecto.pojo.Persona;

public class LeerFicheroTexto {

	
	public static void main(String[] args) {
		
		String pathFichero = "data/personas.txt";
		long tiempo = System.currentTimeMillis();
		FileReader fr;
		BufferedReader br;
		try {
			
			fr = new FileReader(pathFichero);
			br = new BufferedReader(fr);
				
			//leemos línea a línea
			String linea = "";
			
			int cont = 0;
			int erroneas = 0;
			int lineaErronea = 0;
			StringBuffer sb = new StringBuffer();
			//7 campos
			String campos[];
			Persona per = null;
			while((linea = br.readLine()) != null){
				System.out.println(linea);			
				cont++;
				campos = linea.split(",");
				//si tiene menos de 7 campos, MAL
				if (campos.length != 7){
					lineaErronea++;		
					sb.append(cont + ": " + linea);
				} else {
				per = new Persona(campos[0], campos[1], campos[2], campos[5], campos[4]);
				if (per == null){
					erroneas++;
					System.out.println("Creación persona incorrecta en linea" + cont);
				}
				//TODO insertar en tabla de bbdd
				}
			}
			
			System.out.println("----------------------------------");
			System.out.println("Personas leidas " + cont);
			System.out.println("Líneas erróneas " + lineaErronea);
			System.out.println("Personas erroneas " + erroneas);
			System.out.println("Detalle de líneas erróneas: ");
			System.out.println(sb.toString());
			System.out.println("----------------------------------");
			System.out.println("Tiempo: " + (System.currentTimeMillis() - tiempo) + " ms");
			System.out.println("----------------------------------");
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se puede leer fichero " + pathFichero);
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Excepcion no controlada");
			e.printStackTrace();
		}
			
		
		
		
	}
	
	
	
}
