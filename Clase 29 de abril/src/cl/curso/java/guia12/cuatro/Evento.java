/**
 * 
 */
package cl.curso.java.guia12.cuatro;

import java.util.Date;

/**
 * @author Gabriel Zagal
 *
 */
public class Evento {
	private String nombre;
	private Date fecha;
	
	public Evento() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param fecha
	 */
	public Evento(String nombre, Date fecha) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
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
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Evento){
			return this.getFecha().equals(((Evento)obj).getFecha());
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Evento [nombre=" + nombre + ", fecha=" + fecha + "]";
	}
}
