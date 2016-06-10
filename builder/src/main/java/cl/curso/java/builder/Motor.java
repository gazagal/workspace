/**
 * 
 */
package cl.curso.java.builder;

/**
 * @author Gabriel Zagal
 *
 */
public class Motor {
	private int caballosDeFuerza;

	/**
	 * @return the caballosDeFuerza
	 */
	public int getCaballosDeFuerza() {
		return caballosDeFuerza;
	}

	/**
	 * @param caballosDeFuerza the caballosDeFuerza to set
	 */
	public void setCaballosDeFuerza(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Motor [caballosDeFuerza=" + caballosDeFuerza + "]";
	}
	
}
