/**
 * 
 */
package cl.curso.java.ayudantia.cinco_builder;

/**
 * @author Gabriel Zagal
 *
 */
public class ComboComidaRapida {
	private String nombre;
	private int precio;
	private Bebida bebida;
	private PapasFritas papas;
	private Hamburgesa hamburguesa;
	
	public ComboComidaRapida() {
	}

	/**
	 * @param nombre
	 * @param precio
	 * @param bebida
	 * @param papas
	 * @param hamburguesa
	 */
	public ComboComidaRapida(String nombre, int precio, Bebida bebida, PapasFritas papas, Hamburgesa hamburguesa) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.bebida = bebida;
		this.papas = papas;
		this.hamburguesa = hamburguesa;
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
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * @return the bebida
	 */
	public Bebida getBebida() {
		return bebida;
	}

	/**
	 * @param bebida the bebida to set
	 */
	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	/**
	 * @return the papas
	 */
	public PapasFritas getPapas() {
		return papas;
	}

	/**
	 * @param papas the papas to set
	 */
	public void setPapas(PapasFritas papas) {
		this.papas = papas;
	}

	/**
	 * @return the hamburguesa
	 */
	public Hamburgesa getHamburguesa() {
		return hamburguesa;
	}

	/**
	 * @param hamburguesa the hamburguesa to set
	 */
	public void setHamburguesa(Hamburgesa hamburguesa) {
		this.hamburguesa = hamburguesa;
	}
	
}
