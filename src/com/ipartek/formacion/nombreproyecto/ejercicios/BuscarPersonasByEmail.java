package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BuscarPersonasByEmail {

	/**
	 * ejercicio para buscar personas en la tabla 'persona' las cuales contengan
	 * en su email la palabra 'spanbob'
	 */
	//constantes para la conexion
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String SERVER = "127.0.0.1";
	private static final String DATABASE = "javabasic";
	private static final String USUARIO = "root";
	private static final String PASS = "";
	private static final String PORT = "3306";
	static String consulta ="select id, nombre, email from persona where email like '%spanbob%';";
	
	public static void main(String[] args) throws Exception {
		
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection("jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE, USUARIO, PASS);
		
		PreparedStatement pst =  con.prepareStatement(consulta);
		
		ResultSet rs = pst.executeQuery();
		
		while ( rs.next()){
			System.out.println("id: " + rs.getInt("id")); 
			System.out.println("nombre: " + rs.getString("nombre"));
			System.out.println("email: " + rs.getString("email"));
			
			
		}
		rs.close();
		pst.close();
		con.close();
		
	}

}
