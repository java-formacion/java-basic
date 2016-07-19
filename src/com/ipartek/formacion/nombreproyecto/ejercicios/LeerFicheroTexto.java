package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ipartek.formacion.nombreproyecto.enumeraciones.Vaso;
import com.ipartek.formacion.nombreproyecto.pojo.Persona;
import com.ipartek.formacion.nombreproyecto.pojo.Utilidades;



public class LeerFicheroTexto {

	private static final String DRIVER   = "com.mysql.jdbc.Driver";
	private static final String SERVER   = "127.0.0.1";
	private static final String DATABASE = "javabasic";
	private static final String USUARIO  = "root";
	private static final String PASS     = "";
	private static final String PORT     = "3306";
	private static final String PATH_FICHERO = "data/personas.txt";
	
	private static String insert_persona = "INSERT INTO `persona` (`nombre`, `email`) VALUES (?, ?);" ;
	private static String vaciar_personas = "TRUNCATE `persona`;";
	//faltaría incluir esto de resetear
	private static String resetear_autoincrement = "ALTER TABLE persona AUTO_INCREMENT = 348;";
	
	public static void main(String[] args) {
		
		
		
		FileReader fr;
		BufferedReader br;
		
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			
			//Cargar Driver BaseDatos MySql
			Class.forName(DRIVER);
			
			//Establecer conexion
			con = DriverManager.getConnection("jdbc:mysql://"+SERVER+":"+PORT+"/"+DATABASE, USUARIO, PASS );
					
			fr = new FileReader(PATH_FICHERO);
			br = new BufferedReader(fr);
				
			//leemos línea a línea
			String linea = "";
			
			int cont = 0;
			int erroneas = 0;
			int lineaErronea = 0;
			int contInsert = 0;
			StringBuffer sb = new StringBuffer();
			//7 campos
			String campos[];
			//Persona per = null;
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("¿Desea vaciar la tabla Persona? SI:s NO:n");
			String op = scanner.next().trim();
			
			System.out.println("Ha seleccionado " + op);
			if ("s".equals(op)){
				pst = con.prepareStatement(vaciar_personas);
				pst.executeUpdate();
			}
			long tiempo = System.currentTimeMillis();
			
			while((linea = br.readLine()) != null){
				System.out.println(linea);			
				cont++;
				campos = linea.split(",");
				//si tiene menos de 7 campos, MAL
				if (campos.length != 7){
					lineaErronea++;		
					sb.append(cont + ": " + linea);
				} else {
				
				//Preparar sentencia SQL y sustituimos interrogantes por valores
				pst = con.prepareStatement(insert_persona);
				pst.setString(1, campos[0]);
				pst.setString(2, campos[4]);
				
				//Ejecutar sentencia
				if (pst.executeUpdate() == 1){
					contInsert++;
				}else{
					erroneas++;
					sb.append(cont + ": " + linea);
				}
				
				/*per = new Persona(campos[0], campos[1], campos[2], campos[5], campos[4]);
				
				if (per == null){
					erroneas++;
					System.out.println("Creación persona incorrecta en linea" + cont);
				}*/
				
				
				}
			}
					
			
			long duracion = (System.currentTimeMillis() - tiempo);
					
			System.out.println("----------------------------------");
			System.out.println("Personas leidas " + cont);
			System.out.println("Personas insertadas " + contInsert);
			System.out.println("Líneas erróneas " + lineaErronea);
			System.out.println("Personas que dan error al insertar " + erroneas);
			System.out.println("Detalle de líneas erróneas: ");
			System.out.println(sb.toString());
			System.out.println("----------------------------------");
			System.out.println(Utilidades.tiempoEmpleado(duracion));
			System.out.println("----------------------------------");
			
			br.close();
			fr.close();
			
		}catch (SQLException e){	
			System.out.println("Fallo BBDD");
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			System.out.println("No existe DRIVER MySql " + DRIVER);
		} catch (FileNotFoundException e) {
			System.out.println("No se puede leer fichero " + PATH_FICHERO);
			e.printStackTrace();
		}catch (Exception e) {
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
