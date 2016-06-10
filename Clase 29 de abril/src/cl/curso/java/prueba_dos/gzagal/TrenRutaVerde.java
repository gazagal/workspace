/**
 * 
 */
package cl.curso.java.prueba_dos.gzagal;

/**
 * @author Gabriel Zagal
 *Crea y describe el comportamiento de un tren ruta verde
 */
public class TrenRutaVerde extends Tren {

	/**
	 * 
	 */
	public TrenRutaVerde() {
	}

	/**
	 * @param numero
	 * @param linea
	 */
	public TrenRutaVerde(int numero, String linea) {
		super(numero, linea);
	}

	@Override
	public boolean seDetiene(Estacion estacion) {
		return estacion.seDetieneTrenRutaVerde();
	}

}
