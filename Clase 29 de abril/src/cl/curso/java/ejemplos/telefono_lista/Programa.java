/**
 * 
 */
package cl.curso.java.ejemplos.telefono_lista;

import java.util.ArrayList;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Contacto> contactos = new ArrayList<>();
		contactos.add(new Contacto("fifo", 69696969, "meeegust@poco.com"));
		contactos.add(new Contacto("gabo", 2314124, "asdasd.asjd@lqd.com"));
		contactos.add(new Contacto("Wololo", 12345564, "blue@red.com"));
		
		
		Telefono telefono = new Telefono(contactos);
//		telefono.imprimirFor();
//		telefono.imprimirForeach();
		telefono.imprimirIterator();
		
	}

}
