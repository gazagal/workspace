/**
 * 
 */
package cl.curso.java.prueba_dos.gzagal;

/**
 * @author Gabriel Zagal 
 * Crea y describe el comportamiento de una estacion ruta
 * verde
 */
public class EstacionRutaVerde extends Estacion {

	public EstacionRutaVerde() {
	}

	/**
	 * @param nombre
	 * @param linea
	 */
	public EstacionRutaVerde(String nombre, String linea) {
		super(nombre, linea);
	}

	@Override
	public boolean seDetieneTrenRutaRoja() {
		return false;
	}

	@Override
	public boolean seDetieneTrenRutaVerde() {
		return true;
	}

}
