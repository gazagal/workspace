/**
 * 
 */
package cl.curso.java.guia9.dos;

/**
 * @author Gabriel Zagal
 *
 */
public class Tienda {
	private String nombreTienda;
	private String tipoTienda;
	private Producto[] productos;
	
	public Tienda(){
		
	}

	/**
	 * @param nombreTienda
	 * @param tipoTienda
	 * @param productos
	 */
	public Tienda(String nombreTienda, String tipoTienda, Producto[] productos) {
		this.nombreTienda = nombreTienda;
		this.tipoTienda = tipoTienda;
		this.productos = productos;
	}

	/**
	 * @return the nombreTienda
	 */
	public String getNombreTienda() {
		return nombreTienda;
	}

	/**
	 * @param nombreTienda the nombreTienda to set
	 */
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	/**
	 * @return the tipoTienda
	 */
	public String getTipoTienda() {
		return tipoTienda;
	}

	/**
	 * @param tipoTienda the tipoTienda to set
	 */
	public void setTipoTienda(String tipoTienda) {
		this.tipoTienda = tipoTienda;
	}

	/**
	 * @return the productos
	 */
	public Producto[] getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	
	public void imprimir(){
		System.out.println(this.getNombreTienda());
		
		for (int i = 0; i<this.getProductos().length; i++){
			this.getProductos()[i].imprimir();
		}
	}
	
}
