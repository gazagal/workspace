/**
 * 
 */
package cl.curso.java.ayudantia.dos_composite;

/**
 * @author Gabriel Zagal
 *
 */
public abstract class Directorio {
	private String nombre;
	
	public Directorio() {
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
	
	public abstract void calcularPeso();
}
