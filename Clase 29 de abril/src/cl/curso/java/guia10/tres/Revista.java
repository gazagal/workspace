/**
 * 
 */
package cl.curso.java.guia10.tres;

/**
 * @author Gabriel Zagal
 *
 */
public class Revista implements Imprimible {
	private int numeroEdicion;
	private String editorial;
	private String nombre;
	
	public Revista() {
	}
	
	/**
	 * @param numeroEdicion
	 * @param editorial
	 * @param nombre
	 */
	public Revista(int numeroEdicion, String editorial, String nombre) {
		this.numeroEdicion = numeroEdicion;
		this.editorial = editorial;
		this.nombre = nombre;
	}

	/**
	 * @return the numeroEdicion
	 */
	public int getNumeroEdicion() {
		return numeroEdicion;
	}

	/**
	 * @param numeroEdicion the numeroEdicion to set
	 */
	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}

	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
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

	@Override
	public void imprimir() {
		System.out.println(this.getNumeroEdicion());
		System.out.println(this.getEditorial());
		System.out.println(this.getNombre());

	}

}
