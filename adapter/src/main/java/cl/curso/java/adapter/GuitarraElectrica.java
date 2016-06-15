/**
 * 
 */
package cl.curso.java.adapter;

/**
 * @author Gabriel Zagal
 *
 */
public class GuitarraElectrica implements Guitarra {

	/* (non-Javadoc)
	 * @see cl.curso.java.adapter.Guitarra#encender()
	 */
	public void encender() {
		System.out.println("Guitarra electrica encendida.");
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.adapter.Guitarra#apagar()
	 */
	public void apagar() {
		System.out.println("Guitarra electrica apagada.");
	}

}
