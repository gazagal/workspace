/**
 * 
 */
package cl.curso.java.adapter;

/**
 * @author Gabriel Zagal
 *
 */
public class GuitarraElectricaAcustica implements Guitarra {
	private GuitarraAcustica guitarraAcustica;
	
	/**
	 * @param guitarraAcustica
	 */
	public GuitarraElectricaAcustica(GuitarraAcustica guitarraAcustica) {
		super();
		this.guitarraAcustica = guitarraAcustica;
	}

	/**
	 * @return the guitarraAcustica
	 */
	public GuitarraAcustica getGuitarraAcustica() {
		return guitarraAcustica;
	}


	/**
	 * @param guitarraAcustica the guitarraAcustica to set
	 */
	public void setGuitarraAcustica(GuitarraAcustica guitarraAcustica) {
		this.guitarraAcustica = guitarraAcustica;
	}


	/* (non-Javadoc)
	 * @see cl.curso.java.adapter.Guitarra#encender()
	 */
	public void encender() {
		this.getGuitarraAcustica().tocar();
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.adapter.Guitarra#apagar()
	 */
	public void apagar() {
		this.getGuitarraAcustica().dejarDeTocar();
	}

}
