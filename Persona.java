package com.ipartek.formacion.apppersona;


/**
 * Clase para instanciar objetos que representan una persona
 * Los atributos de un Persona:
 * <ol>
 * 	 <li>nombre</li>
 * 	 <li>apellido1</li>
 * 	 <li>apellido2</li>
 * 	 <li>nota</li>
 * 	 <li>email</li>
 * 	 <li>dni</li>
 * </ol>
 * 
 */
public class Persona {
	
	/*creamos unas constantes (final) fijas publicas para el rango de las notas. 
	 * LOS NOMBRES EN MAYUSCULAS
	 */
	public static final int  NOTA_MINIMA = 0;
	public static final int  NOTA_ACEPTADO = 5;
	public static final int  NOTA_MAXIMA = 10;
	
	//atributos
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int nota;
	private String email;
	private String dni;
	

	
	//**************constructor para crear objetos ******************************
	
	/**
	 * Constructor que nos pide obligatoriamente un "nombre", "apellido1"y "dni" de tipo String de <code>Persona</code>.<br>
	 * El resto de atributos del <code>Libro</code> se inicializan:
	 * <ul>
	 * 		<li><code>String</code> apellido2 = "" </li>
	 * 		<li><code>int</code> nota =0</li>
	 * 		<li><code>String</code> email = "" </li>
	 * </ul>
	 * @param titulo <code>String</code>  corresponde al titulo del libro.
	 */
		public Persona(String nombre, String apellido1, String dni){
			super();
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.dni = dni;
			
			this.apellido2 = "";
			this.nota = NOTA_MINIMA;
			this.email = "";
			
		}


		
	//  *********ENCAPSULAMOS LOS ATRIBUTOS  con  (get y set) *******
		
		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public int getNota() {
		return nota;
	}

/**
 * La <code>nota</code> está comprendidda entre 0 y 10 <br>
 * Si <code>nota</code> < 0 asignamos un 0<br>
 * Si <code>nota</code> > 10 asignamos un 10<br>
 * @param nota <code>int<code/> nota del alumno
 */
	public void setNota(int nota) {
		if (nota>10) {
			this.nota=10;
		}
		else if (nota<0) {
			this.nota=0;
		}
		else{
			this.nota = nota;
		}
	}

/**
 * Una {@code Persona} es aceptada con una nota >= 5 ( int)
 * @return
 */
	
	//   {@code Persona}   es lo mismo que   <code>Persona</code>
	public boolean isAceptado() {
		boolean result = false;     //inicializamos la variable que vamos a devolver
		
		if (this.nota >= NOTA_ACEPTADO ){
			result = true;
		}
		return result;                //devolvemos la variable
	}



	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}

// Generamos el toString   Source--->Generate toString..
// para que cuando mandemos sacar por pantalla los datos de l apersona que creeemos en App.java nos 
// muestre todos los datos.
//Si no pusiesemos el toString 

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", nota=" + nota
				+ ", aceptado=" + isAceptado() + ", email=" + email + ", dni=" + dni + "]";
	}
	

	

}
