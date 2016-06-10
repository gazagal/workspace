/**
 * 
 */
package cl.curso.java.guia12.dos;

import java.util.Date;

/**
 * @author Gabriel Zagal
 *
 */
public class Like {
	private int identificador;
	private Usuario owner;
	private Date fecha;
	
	public Like() {
	}

	/**
	 * @param identificador
	 * @param owner
	 * @param fecha
	 */
	public Like(int identificador, Usuario owner, Date fecha) {
		super();
		this.identificador = identificador;
		this.owner = owner;
		this.fecha = fecha;
	}

	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the owner
	 */
	public Usuario getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Usuario owner) {
		this.owner = owner;
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
		if(obj instanceof Like){
			Like like = (Like)obj;
			return (this.getIdentificador())==(like.getIdentificador());
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.getIdentificador()+" - "+this.getOwner()+" - "+this.getFecha();
	}
}
