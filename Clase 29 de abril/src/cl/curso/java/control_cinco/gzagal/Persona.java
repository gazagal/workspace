/**
 * 
 */
package cl.curso.java.control_cinco.gzagal;

/**
 * @author Gabriel Zagal
 *define una persona
 */
public abstract class Persona {
	private String rut;
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Persona(String rut, String nombre, String apellido, int edad) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
}
