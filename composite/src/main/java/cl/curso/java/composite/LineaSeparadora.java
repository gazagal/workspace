/**
 * 
 */
package cl.curso.java.composite;

/**
 * @author Gabriel Zagal
 *
 */
public class LineaSeparadora extends Menu {

	
	/**
	 * 
	 */
	public LineaSeparadora() {
		super();
	}

	/**
	 * @param nombre
	 */
	public LineaSeparadora(String nombre, Command comando) {
		super(nombre, comando);
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.composite.Menu#pintarMenu()
	 */
	@Override
	public void pintarMenu() {
		System.out.println("----------------------");

	}

}
