/**
 * 
 */
package cl.curso.java.guia10.cinco;

/**
 * @author Gabriel Zagal
 *
 */
public class Moto implements Desplazable {
	private String marca;
	private String modelo;
	
	public Moto() {
	}
	
	/**
	 * @param marca
	 * @param modelo
	 */
	public Moto(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void desplazar(int km) {
		System.out.println("La moto se desplaza por Tierra "+km+" Kilometros");
	}

}
