/**
 * 
 */
package cl.curso.java.guia9.uno;

/**
 * @author {Gabriel Zagal}
 *
 */
public class Auto {
	private int codigo;
	private String marca;
	private String tipo;
	private int modelo;
	private String patente;
	private int kilometraje;
	private int precioDeVenta;
	private int unidadesPorVender;
	
	/**
	 * constructor por defecto
	 */
	public Auto() {
	}

	/**
	 * @param codigo
	 * @param marca
	 * @param tipo
	 * @param modelo
	 * @param patente
	 * @param kilometraje
	 * @param precioDeVenta
	 * @param unidadesPorVender
	 */
	public Auto(int codigo, String marca, String tipo, int modelo, String patente, int kilometraje, int precioDeVenta,
			int unidadesPorVender) {
		this.codigo = codigo;
		this.marca = marca;
		this.tipo = tipo;
		this.modelo = modelo;
		this.patente = patente;
		this.kilometraje = kilometraje;
		this.precioDeVenta = precioDeVenta;
		this.unidadesPorVender = unidadesPorVender;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the modelo
	 */
	public int getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the patente
	 */
	public String getPatente() {
		return patente;
	}

	/**
	 * @param patente the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}

	/**
	 * @return the kilometraje
	 */
	public int getKilometraje() {
		return kilometraje;
	}

	/**
	 * @param kilometraje the kilometraje to set
	 */
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	/**
	 * @return the precioDeVenta
	 */
	public int getPrecioDeVenta() {
		return precioDeVenta;
	}

	/**
	 * @param precioDeVenta the precioDeVenta to set
	 */
	public void setPrecioDeVenta(int precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}

	/**
	 * @return the unidadesPorVender
	 */
	public int getUnidadesPorVender() {
		return unidadesPorVender;
	}

	/**
	 * @param unidadesPorVender the unidadesPorVender to set
	 */
	public void setUnidadesPorVender(int unidadesPorVender) {
		this.unidadesPorVender = unidadesPorVender;
	}
	
	/**
	 * @param cantidadVendida
	 * confirma si hay vehiculos disponibles para vender, si hay se resta la cantidad vendida
	 * a las unidades por vender
	 */
	public void vender(int cantidadVendida){
		if (this.getUnidadesPorVender()< cantidadVendida)
		{
			System.out.println("Lo sentimos, tenemos "+this.getUnidadesPorVender()+" "+this.getTipo()+"(s) disponible(s)");
		}
		else{
			this.setUnidadesPorVender(this.getUnidadesPorVender()-cantidadVendida);
		}
	}
	
	
	
	
	
}
