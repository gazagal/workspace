/**
 * 
 */
package cl.curso.java.guia10.dos;

/**
 * @author Gabriel Zagal
 *
 */
public class EmpleadoComision extends Empleado {
	private int cantidadVentas;
	private int sueldoBase;
	
	public EmpleadoComision() {
	}
	
	
	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public EmpleadoComision(String nombre, int horasTrabajadas,int cantidadVentas,int sueldoBase) {
		super(nombre, horasTrabajadas);
		this.cantidadVentas = cantidadVentas;
		this.sueldoBase = sueldoBase;
	}

	/**
	 * @return the cantidadVentas
	 */
	public int getCantidadVentas() {
		return cantidadVentas;
	}


	/**
	 * @param cantidadVentas the cantidadVentas to set
	 */
	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}


	/**
	 * @return the sueldoBase
	 */
	public int getSueldoBase() {
		return sueldoBase;
	}


	/**
	 * @param sueldoBase the sueldoBase to set
	 */
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}


	@Override
	public int calcularSalario() {
		return this.getSueldoBase()+(this.getCantidadVentas()*9000);
	}

}
