/**
 * 
 */
package cl.curso.java.guia12.tres;

import java.util.Collections;
import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class Playlist {
	private List<Cancion> canciones;
	
	public Playlist() {
	}

	/**
	 * @param canciones
	 */
	public Playlist(List<Cancion> canciones) {
		this.canciones = canciones;
	}

	/**
	 * @return the canciones
	 */
	public List<Cancion> getCanciones() {
		return canciones;
	}

	/**
	 * @param canciones the canciones to set
	 */
	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	public void reproducirAleatorio(){
		Collections.shuffle(getCanciones());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Playlist [canciones=" + canciones + "]";
	}
}
