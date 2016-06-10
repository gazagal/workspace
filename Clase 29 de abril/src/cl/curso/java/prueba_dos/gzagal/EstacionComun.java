/**
 * 
 */
package cl.curso.java.prueba_dos.gzagal;

/**
 * @author Gabriel Zagal 
 * Crea y describe el comportamiento de una estacion comun
 */
public class EstacionComun extends Estacion {

	/**
	 * 
	 */
	public EstacionComun() {
	}

	/**
	 * @param nombre
	 * @param linea
	 */
	public EstacionComun(String nombre, String linea) {
		super(nombre, linea);
	}

	@Override
	public boolean seDetieneTrenRutaRoja() {
		return true;
	}

	@Override
	public boolean seDetieneTrenRutaVerde() {
		return true;
	}

}
