/**
 * 
 */
package cl.curso.java.guia9.uno;

/**
 * @author {Gabriel Zagal}
 *
 */
public class Persona {
	private String nombre;
	private String apellido;
	private int telefono;
	
	/**
	 * constructor por defecto
	 */
	public Persona() {
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 */
	public Persona(String nombre, String apellido, int telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
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
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public boolean validarTelefono(){
		return (this.getTelefono() <=999999999 && this.getTelefono() >99999999 );
	}
	
	public void imprimir(){
		System.out.println("Datos de la Persona"+"\nNombre: "+this.getNombre()+"\nApellido: "+this.getApellido()+"\nTelefono: "+this.getTelefono());
		if (!this.validarTelefono())
		{
			System.out.println("Numero invalido");
		}
	}
	
	
	
}
