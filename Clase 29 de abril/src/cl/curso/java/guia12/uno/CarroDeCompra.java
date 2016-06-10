/**
 * 
 */
package cl.curso.java.guia12.uno;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class CarroDeCompra {
	private Usuario usuario;
	private List<Producto> productos;
	
	public CarroDeCompra() {
	}

	/**
	 * @param usuario
	 * @param productos
	 */
	public CarroDeCompra(Usuario usuario, List<Producto> productos) {
		super();
		this.usuario = usuario;
		this.productos = productos;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public void agregarProducto(Producto producto){
		this.getProductos().add(producto);
	}
	
	public void eliminarProducto(Producto producto){
		this.getProductos().remove(producto);
	}
	
	public int valorProductos(){
		int valorTotal = 0;
		for(Producto producto : productos)
			valorTotal = valorTotal+producto.getPrecio();
		return valorTotal;
	}
	
	public void ordenarPorPrecio(){
		Collections.sort(this.getProductos(), new Comparator<Producto>() {

			@Override
			public int compare(Producto o1, Producto o2) {
				return new Integer(o1.getPrecio()).compareTo(new Integer(o2.getPrecio()));
			}
		});
	}
	
	public void imprimir(){
		System.out.println(this.getUsuario());
		System.out.println(this.getProductos());
		System.out.println(this.valorProductos());
	}
}
