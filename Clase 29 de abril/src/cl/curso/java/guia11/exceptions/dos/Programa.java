/**
 * 
 */
package cl.curso.java.guia11.exceptions.dos;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 * @throws CuentaBloqueadaException 
	 * @throws AutenticacionException 
	 */
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("gabriel", "123", 2);
		try {
			usuario.login("gabriel", "1234");
		} catch (AutenticacionException e) {
			System.out.println(e.getMessage());
		} catch (CuentaBloqueadaException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
