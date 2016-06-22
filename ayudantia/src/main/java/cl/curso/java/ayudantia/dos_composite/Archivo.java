/**
 * 
 */
package cl.curso.java.ayudantia.dos_composite;

/**
 * @author Gabriel Zagal
 *
 */
public class Archivo extends Directorio {
	private String atajo;
	private int pesoMB;
	
	/**
	 * 
	 */
	public Archivo() {
		super();
	}

	/**
	 * @return the atajo
	 */
	public String getAtajo() {
		return atajo;
	}

	/**
	 * @param atajo the atajo to set
	 */
	public void setAtajo(String atajo) {
		this.atajo = atajo;
	}

	/**
	 * @return the pesoMB
	 */
	public int getPesoMB() {
		return pesoMB;
	}

	/**
	 * @param pesoMB the pesoMB to set
	 */
	public void setPesoMB(int pesoMB) {
		this.pesoMB = pesoMB;
	}

	@Override
	public void calcularPeso() {
		System.out.println(this.getPesoMB());
	}

}