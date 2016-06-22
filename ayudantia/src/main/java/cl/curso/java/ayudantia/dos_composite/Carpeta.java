/**
 * 
 */
package cl.curso.java.ayudantia.dos_composite;

import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class Carpeta extends Directorio {
	private List<Directorio> directorio;
	
	/**
	 * 
	 */
	public Carpeta() {
		super();
	}

	/**
	 * @return the directorio
	 */
	public List<Directorio> getDirectorio() {
		return directorio;
	}


	/**
	 * @param directorio the directorio to set
	 */
	public void setDirectorio(List<Directorio> directorio) {
		this.directorio = directorio;
	}

	@Override
	public void calcularPeso() {
	}

}
