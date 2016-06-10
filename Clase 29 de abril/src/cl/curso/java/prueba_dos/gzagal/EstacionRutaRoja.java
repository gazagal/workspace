/**
 * 
 */
package cl.curso.java.prueba_dos.gzagal;

/**
 * @author Gabriel Zagal 
 * Crea y describe el comportamiento de una estacion ruta
 * roja
 */
public class EstacionRutaRoja extends Estacion {

	/**
	 * 
	 */
	public EstacionRutaRoja() {
	}

	/**
	 * @param nombre
	 * @param linea
	 */
	public EstacionRutaRoja(String nombre, String linea) {
		super(nombre, linea);
	}

	@Override
	public boolean seDetieneTrenRutaRoja() {
		return true;
	}

	@Override
	public boolean seDetieneTrenRutaVerde() {
		return false;
	}

}
