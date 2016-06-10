/**
 * 
 */
package cl.curso.java.guia11.threads.tres;

/**
 * @author Gabriel Zagal
 *
 */
public class Asiento {
	private boolean disponible;
	
	public Asiento() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param disponible
	 */
	public Asiento(boolean disponible) {
		super();
		this.disponible = disponible;
	}

	/**
	 * @return the disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * @param disponible the disponible to set
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
}
