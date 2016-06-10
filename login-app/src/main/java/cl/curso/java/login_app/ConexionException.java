/**
 * 
 */
package cl.curso.java.login_app;

/**
 * @author Gabriel Zagal
 *
 */
public class ConexionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5069116260646357683L;

	/**
	 * @param message
	 * @param cause
	 */
	public ConexionException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public ConexionException(String message) {
		super(message);
	}
	
	
	
}
