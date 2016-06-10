/**
 * 
 */
package cl.curso.java.prueba_dos.gzagal;

/**
 * @author Gabriel Zagal 
 * Crea el comportamiento y los atributos de un tren para
 * heredarlo a las clases hijas
 */
public abstract class Tren {
	private int numero;
	private String linea;
	
	public Tren() {
	}

	/**
	 * @param numero
	 * @param linea
	 */
	public Tren(int numero, String linea) {
		this.numero = numero;
		this.linea = linea;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}

	/**
	 * @param linea the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}
	
	public abstract boolean seDetiene(Estacion estacion);
}
