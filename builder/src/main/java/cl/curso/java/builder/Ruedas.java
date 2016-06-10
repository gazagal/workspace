/**
 * 
 */
package cl.curso.java.builder;

/**
 * @author Gabriel Zagal
 *
 */
public class Ruedas {
	private int diametro;

	/**
	 * @return the diametro
	 */
	public int getDiametro() {
		return diametro;
	}

	/**
	 * @param diametro the diametro to set
	 */
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ruedas [diametro=" + diametro + "]";
	}
	
}
