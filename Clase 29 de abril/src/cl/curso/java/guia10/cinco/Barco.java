/**
 * 
 */
package cl.curso.java.guia10.cinco;

/**
 * @author Gabriel Zagal
 *
 */
public class Barco implements Desplazable {
	private String nombre;
	private int numeroDeVelas;
	
	public Barco() {
	}
	
	/**
	 * @param nombre
	 * @param numeroDeVelas
	 */
	public Barco(String nombre, int numeroDeVelas) {
		this.nombre = nombre;
		this.numeroDeVelas = numeroDeVelas;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the numeroDeVelas
	 */
	public int getNumeroDeVelas() {
		return numeroDeVelas;
	}

	/**
	 * @param numeroDeVelas the numeroDeVelas to set
	 */
	public void setNumeroDeVelas(int numeroDeVelas) {
		this.numeroDeVelas = numeroDeVelas;
	}

	@Override
	public void desplazar(int km) {
		System.out.println("El barco se desplaza por Agua "+km+" Kilometros");
	}

}
