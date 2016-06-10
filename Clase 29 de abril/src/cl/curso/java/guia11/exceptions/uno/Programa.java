/**
 * 
 */
package cl.curso.java.guia11.exceptions.uno;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Rut rut =new Rut(18194997, "3");
		System.out.println(rut.validar());
		
	}

}
