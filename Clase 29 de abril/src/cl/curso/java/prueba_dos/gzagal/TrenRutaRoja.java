/**
 * 
 */
package cl.curso.java.prueba_dos.gzagal;

/**
 * @author Gabriel Zagal 
 * Crea y describe el comportamiento de un tren ruta roja
 */
public class TrenRutaRoja extends Tren {

	/**
	 * 
	 */
	public TrenRutaRoja() {
	}

	/**
	 * @param numero
	 * @param linea
	 */
	public TrenRutaRoja(int numero, String linea) {
		super(numero, linea);
	}

	@Override
	public boolean seDetiene(Estacion estacion) {
		return estacion.seDetieneTrenRutaRoja();
	}

}
