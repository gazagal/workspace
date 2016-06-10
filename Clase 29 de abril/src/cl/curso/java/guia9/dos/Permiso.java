/**
 * 
 */
package cl.curso.java.guia9.dos;

/**
 * @author Gabriel Zagal
 *
 */
public class Permiso {
	private String nombre;
	private int identificador;
	private String descripcion;
	
	public Permiso(){
		
	}

	/**
	 * @param nombre
	 * @param identificador
	 * @param descripcion
	 */
	public Permiso(String nombre, int identificador, String descripcion) {
		this.nombre = nombre;
		this.identificador = identificador;
		this.descripcion = descripcion;
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
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void imprimir(){
		System.out.println(this.getNombre());
		System.out.println(this.getIdentificador());
		System.out.println(this.getDescripcion());
	}
	
}
