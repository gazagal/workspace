/**
 * 
 */
package cl.curso.java.guia9.uno;

/**
 * @author {Gabriel Zagal}
 *
 */
public class Vendedor {
	private String nombre;
	private int semanasTrabajadas;
	private int cantidadArticulosVendidos;
	private int valorArticulosVendidos;
	
	/**
	 * constructor por defecto
	 */
	public Vendedor(){
		
	}

	/**
	 * @param nombre
	 * @param semanasTrabajadas
	 * @param cantidadArticulosVendidos
	 * @param valorArticulosVendidos
	 */
	public Vendedor(String nombre, int semanasTrabajadas, int cantidadArticulosVendidos, int valorArticulosVendidos) {
		this.nombre = nombre;
		this.semanasTrabajadas = semanasTrabajadas;
		this.cantidadArticulosVendidos = cantidadArticulosVendidos;
		this.valorArticulosVendidos = valorArticulosVendidos;
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
	 * @return the semanasTrabajadas
	 */
	public int getSemanasTrabajadas() {
		return semanasTrabajadas;
	}

	/**
	 * @param semanasTrabajadas the semanasTrabajadas to set
	 */
	public void setSemanasTrabajadas(int semanasTrabajadas) {
		this.semanasTrabajadas = semanasTrabajadas;
	}

	/**
	 * @return the cantidadArticulosVendidos
	 */
	public int getCantidadArticulosVendidos() {
		return cantidadArticulosVendidos;
	}

	/**
	 * @param cantidadArticulosVendidos the cantidadArticulosVendidos to set
	 */
	public void setCantidadArticulosVendidos(int cantidadArticulosVendidos) {
		this.cantidadArticulosVendidos = cantidadArticulosVendidos;
	}

	/**
	 * @return the valorArticulosVendidos
	 */
	public int getValorArticulosVendidos() {
		return valorArticulosVendidos;
	}

	/**
	 * @param valorArticulosVendidos the valorArticulosVendidos to set
	 */
	public void setValorArticulosVendidos(int valorArticulosVendidos) {
		this.valorArticulosVendidos = valorArticulosVendidos;
	}
	
	/**
	 * @return comision segun articulos vendidos y semanas trabajadas
	 */
	public double calcularComision()
	{
		return ((this.getSemanasTrabajadas()*200)+(this.getCantidadArticulosVendidos()*this.getValorArticulosVendidos())*0.09);
	}
	
}
