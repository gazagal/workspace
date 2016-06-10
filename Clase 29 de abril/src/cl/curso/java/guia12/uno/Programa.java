/**
 * 
 */
package cl.curso.java.guia12.uno;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Producto producto1 = new Producto(1234, "ChocKiss", 400);
		Producto producto2 = new Producto(2345, "Pan", 680);
		Producto producto3 = new Producto(3456, "Queso", 1000);
		Producto producto4 = new Producto(4567, "Mortadela", 750);
		Producto producto5 = new Producto(1234, "Leche", 650);
		
		List<Producto> lista1 = new ArrayList<>();
		
		CarroDeCompra carro1 = new CarroDeCompra(new Usuario("Gabo", "1234567890"), lista1);
		
		carro1.agregarProducto(producto1);
		carro1.agregarProducto(producto1);
		carro1.agregarProducto(producto2);
		carro1.agregarProducto(producto3);
		carro1.agregarProducto(producto4);
		carro1.agregarProducto(producto5);
		carro1.agregarProducto(producto5);
		
		carro1.imprimir();
		
		carro1.eliminarProducto(producto3);
		
		System.out.println(".............");
		carro1.imprimir();
		System.out.println(".............");
		carro1.ordenarPorPrecio();
		carro1.imprimir();
		
		
	}

}
