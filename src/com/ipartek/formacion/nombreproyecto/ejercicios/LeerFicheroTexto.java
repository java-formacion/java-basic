package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.nombreproyecto.enumeraciones.Vaso;
import com.ipartek.formacion.nombreproyecto.pojo.Persona;


public class LeerFicheroTexto {
	
	private static final String DRIVER   = "com.mysql.jdbc.Driver";
	private static final String SERVER   = "127.0.0.1";
	private static final String DATABASE = "personas";
	private static final String USER     = "root";
	private static final String PASS     = "";
	private static final String PORT     = "3306";
	
	private static String insert_persona = "INSERT INTO `personas`.`persona` (`nombre`, `email`) VALUES (?, ?);";

	
	public static void main(String[] args) {

		Connection con = null;	
		PreparedStatement pst = null;
		
		String  pathFichero = "data/personas2.txt";
		long tiempo = System.currentTimeMillis();
		
		try {
			Scanner scanner = new Scanner(System.in);
						
			

			
			//Cargar Driver BaseDatos MySQL
			Class.forName(DRIVER);
			
			//Establecer conexion
			con = DriverManager.getConnection("jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE, USER, PASS);
			
			
			
			FileReader fr = new FileReader(pathFichero);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			int cont = 0;
			int contInsert = 0;
			int contError = 0;
			StringBuffer sb = new StringBuffer();	
			
			//Vaciar tabla?
			System.out.println("¿Vaciar tabla? NO=0, SI=1"); 
			int limpiar = scanner.nextInt();
			if(limpiar==1){
				pst = con.prepareStatement("TRUNCATE `persona`;");
				pst.executeUpdate();
			}
			
			while( (linea = br.readLine()) != null ){
				
				System.out.println(linea);
				
				String campos[] = linea.split(",");
								
				//crear objeto persona
				//contar cuantos se crean y cuantos dan error (si <7 = MAL)
				if(campos.length == 7){
					//Crear objeto persona
//					p.add( new Persona(campos[0], campos[1], campos[2], campos[5], campos[4]));
					
					//Preparar sentencia SQL y sustituimos los '?' por valores
					pst = con.prepareStatement( insert_persona );
					pst.setString(1, campos[0]);
					pst.setString(2, campos[4]);
					
					//Ejecutar Sentencia
					if ( pst.executeUpdate() == 1){
						contInsert++;
						
					}else{
						contError++;
						sb.append(cont + ": " + linea);
						
					}
					
				}else{
					contError++;
					sb.append(cont + ": " + linea);
				}	
				
				cont++;
				
			}
			
			System.out.println("----------------------");
			System.out.println("Personas leidas: " + cont);
			System.out.println("Personas insertadas: " + contInsert);
			System.out.println("Personas erroneas: " + contError);
			System.out.println("Detalle lineas errones: " + sb.toString());
			System.out.println("----------------------");
			System.out.println("Tiempo de ejecucion: " + ((System.currentTimeMillis() - tiempo) + " ms"));
			
			
			br.close();
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se puede leer el fichero " + pathFichero);
			e.printStackTrace();
			
		}catch(SQLException e){
			System.out.println("Fallo de Base de Datos");
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			System.out.println("No existe DRIVER mySql: " + DRIVER);
			
		}catch (Exception e) {
			System.out.println("Excepcion no controlada");
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				System.out.println("Excepcion Cerrando Conexion");
				e.printStackTrace();
				
			}
		}
		
		
	}

	
	
}
