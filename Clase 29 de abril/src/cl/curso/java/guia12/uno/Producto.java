/**
 * 
 */
package cl.curso.java.guia12.uno;

/**
 * @author Gabriel Zagal
 *
 */
public class Producto {
	private int identificador;
	private String nombre;
	private int precio;
	
	public Producto() {
	}

	/**
	 * @param identificador
	 * @param nombre
	 * @param precio
	 */
	public Producto(int identificador, String nombre, int precio) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.precio = precio;
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Producto){
			Producto producto = (Producto)obj;
			return new Integer(this.getIdentificador()).equals(new Integer(producto.getIdentificador()));
		}
		return false;
	}

	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
