package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ipartek.formacion.nombreproyecto.pojo.Persona;


public class LeerFicheroTexto {

	private static final String DRIVER   = "com.mysql.jdbc.Driver";
	private static final String SERVER   = "127.0.0.1";
	private static final String DATABASE = "personas";
	private static final String USUARIO  = "root";
	private static final String PASS     = "";
	private static final String PORT     = "3306";

	private static String insert_persona = "INSERT INTO `personas`.`persona` (`nombre`, `email`) VALUES ( ? , ? );";
	
	
	public static void main(String[] args) {
		
		long tiempo = System.currentTimeMillis();
		String pathFichero = "data/personas.txt";
		Connection con = null;
		PreparedStatement pst = null;
		
		try{
			
			//Cargar Driver BaseDatos MySql
			Class.forName(DRIVER);
			
			//Establecer conexion
			con = DriverManager.getConnection("jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE, USUARIO, PASS );
			
			FileReader fr = new FileReader(pathFichero);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			Persona p = null;
			int cont = 0;
			int contInsert = 0;
			int contErrores = 0;
			String campos[];
			StringBuffer sb = new StringBuffer();
			while( (linea = br.readLine()) != null ){
				
				campos = linea.split(",");
				if ( campos.length == 7){
					
					//Preparar sentencia SQL y sustituimos "?" por valores					
					pst = con.prepareStatement( insert_persona );
					pst.setString(1, campos[0]);
					pst.setString(2, campos[4]);
					
					//Ejecutar Sentencia
					if ( pst.executeUpdate() == 1 ){
						contInsert++;						
					}else{
						contErrores++;
						sb.append( cont + ": " + linea);
					}					
					pst = null;
					
				}else{
					contErrores++;
					sb.append( cont + ": " + linea);
				}						
				cont++;				
			}
			
			System.out.println("-----------------------------");
			System.out.println("Personas leidas: " + cont );
			System.out.println("Personas Insertadas: " + contInsert );
			System.out.println("Personas Erroneas: " + contErrores );
			System.out.println("Detalle lineas Erroneas: ");
			System.out.println( sb.toString() );
			System.out.println("----------------------------------------");
			System.out.println("Tiempo: " + ( System.currentTimeMillis() - tiempo ) + " ms");
			System.out.println("----------------------------------------");
			
			
			br.close();
			fr.close();
		
		}catch ( SQLException e){			
			System.out.println("Fallo Base Datos");
			e.printStackTrace();
			
		}catch ( ClassNotFoundException e){			
			System.out.println("No existe DRIVER mysql: " + DRIVER);
			
		}catch(FileNotFoundException e){
			System.out.println("No se puede leer fichero " + pathFichero);
			e.printStackTrace();
			
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
