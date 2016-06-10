/**
 * 
 */
package cl.curso.java.guia9.dos;

/**
 * @author Gabriel Zagal
 *
 */
public class Producto {
	private String nombre;
	private String tipoArticulo;
	private int cantidadArticulo;
	private int precio;
	
	public Producto(){
		
	}

	/**
	 * @param nombre
	 * @param tipoArticulo
	 * @param cantidadArticulo
	 * @param precio
	 */
	public Producto(String nombre, String tipoArticulo, int cantidadArticulo, int precio) {
		this.nombre = nombre;
		this.tipoArticulo = tipoArticulo;
		this.cantidadArticulo = cantidadArticulo;
		this.precio = precio;
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
	 * @return the tipoArticulo
	 */
	public String getTipoArticulo() {
		return tipoArticulo;
	}

	/**
	 * @param tipoArticulo the tipoArticulo to set
	 */
	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}

	/**
	 * @return the cantidadArticulo
	 */
	public int getCantidadArticulo() {
		return cantidadArticulo;
	}

	/**
	 * @param cantidadArticulo the cantidadArticulo to set
	 */
	public void setCantidadArticulo(int cantidadArticulo) {
		this.cantidadArticulo = cantidadArticulo;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	/**
	 * imprime nombre y precio de los articulos
	 */
	public void imprimir(){
		System.out.println(this.getNombre()+ " $"+this.getPrecio());
	}
	
}
