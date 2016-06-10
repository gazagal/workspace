/**
 * 
 */
package cl.curso.java.guia10.cuatro;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Rut rut = new Rut(18941219, "3");
//		System.out.println(rut.validar());
//		System.out.println(rut.getDigitoVerificador());
		
		ISBN isbn = new ISBN(817525766, "0");
		System.out.println(isbn.validar());
	}

}
