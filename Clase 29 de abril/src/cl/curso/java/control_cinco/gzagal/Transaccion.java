/**
 * 
 */
package cl.curso.java.control_cinco.gzagal;

import java.util.Date;

/**
 * @author Gabriel Zagal
 *crea y define una Transaccion
 */
public class Transaccion {
	private String id;
	private String tipo;
	private Date fecha;
	private int monto;
	
	public Transaccion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param tipo
	 * @param fecha
	 * @param monto
	 */
	public Transaccion(String id, String tipo, Date fecha, int monto) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.fecha = fecha;
		this.monto = monto;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the monto
	 */
	public int getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof Transaccion){
			return this.getId().equals(((Transaccion) arg0).getId());
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaccion [id=" + id + ", tipo=" + tipo + ", fecha=" + fecha + ", monto=" + monto + "]";
	}
	
}
