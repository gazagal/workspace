/**
 * 
 */
package cl.curso.java.composite;

/**
 * @author Gabriel Zagal
 *
 */
public class ComandoCerrar implements Command {

	/* (non-Javadoc)
	 * @see cl.curso.java.composite.Command#ejecutar()
	 */
	public void ejecutar() {
		System.out.println("Cerrar.");
	}

}
