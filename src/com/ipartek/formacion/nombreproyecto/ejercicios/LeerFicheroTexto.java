package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.ipartek.formacion.nombreproyecto.pojo.Persona;

public class LeerFicheroTexto {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String SERVER = "127.0.0.1";
	private static final String DATABASE = "javabasic";
	private static final String USUARIO = "root";
	private static final String PASS = "";
	private static final String PORT = "3306";
	private static final String PATH_FICHERO = "data/personas.txt";
	private static String insert_persona = "INSERT INTO `persona` (`nombre`, `email`) VALUES (?, ?);";
	private static String select_persona = "SELECT * from `persona`;";
	private static String truncate_persona = "TRUNCATE `persona`;";	
	

	public static void main(String[] args) {
		
		
		long tiempo = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			
			//Cargar Driver BaseDatos MySql
			Class.forName(DRIVER);
			
			//Establecer conexion
			con = DriverManager.getConnection("jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE, USUARIO, PASS);
			
			FileReader fr = new FileReader(PATH_FICHERO);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			Persona p = null;
			int cont = 0;
			int cont2 = 0;
			int contInsert = 0;
			String campos[];
			StringBuffer sb = new StringBuffer();
			
			//Comprobar si hay datos en la bbdd y en caso de que haya pedir al usuario si quiere borrar la tabla
			//truncate `persona`;
			pst = con.prepareStatement(select_persona);
			rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println("La tabla personas contiene datos, ¿desea borrarlos?");
				System.out.println("Escriba '1' para decir si o '2' para decir no");
				int op = scanner.nextInt();
				if (op==1){
					pst = con.prepareStatement(truncate_persona);
					System.out.println("Tabla eliminada correctamente");
				}
			}else{
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
					
					campos = linea.split(",");
					
					if (campos.length == 7){
						//Preparar sentencia SQL y sustituimos "?" por valores
						pst = con.prepareStatement(insert_persona);
						pst.setString(1, campos[0]);
						pst.setString(2, campos[4]);
						
						//Ejecutar Sentencia
						if (pst.executeUpdate()==1){
							contInsert++;
						}else{
							cont2++;
							sb.append(cont+": "+linea);
						}
						pst = null;
					}else{
						cont2++;
						sb.append(cont+": "+linea);
					}
					
					cont++;
				}
			}
			
			System.out.println("------------------");
			System.out.println("Personas leidas: "+cont);
			System.out.println("Personas insertadas: "+contInsert);
			System.out.println("Personas erroneas: "+cont2);
			System.out.println("Detalle lineas erroneas: ");
			System.out.println(sb.toString());
			System.out.println("--------------------------------");
			
			System.out.println("Tiempo: "+(System.currentTimeMillis() - tiempo)+" milisegundos");
			System.out.println("--------------------------------");
			
			br.close();
			fr.close();
		} catch (SQLException e){
			System.out.println("Fallo Base Datos");
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			System.out.println("No existe DRIVER mysql: "+DRIVER);
		} catch (FileNotFoundException e) {
			System.out.println("No se puede leer fichero " + PATH_FICHERO);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Excepcion no controlada");
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Excepcion Cerrando Conexion");
				e.printStackTrace();
			}
		}

	}
}
