package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
			Persona p;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				
				String campos[] = linea.split(",");
				
				p = new Persona(campos[0], campos[1], campos[2], campos[3], campos[4]);
				if (campos.length<7){
					cont2++;
					 
				}
				
				cont++;
			}
			
			System.out.println("------------------");
			System.out.println("Personas leidas: "+cont);
			System.out.println("Personas erroneas: "+cont2);
			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se puede leer fichero " + pathFichero);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Excepcion no controlada");
			e.printStackTrace();
		}

	}
}
