/**
 * 
 */
package cl.curso.java.guia10.cinco;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Moto moto = new Moto("BMW", "XT7200");
		moto.desplazar(10);
		
		Barco barco = new Barco("Release the Cuaken", 4);
		barco.desplazar(60);
		
	}

}
