/**
 * 
 */
package cl.curso.java.ejemplos.playlist;

import java.util.ArrayList;

/**
 * @author Gabriel Zagal
 *
 */
public class Usuario {
	private String nombre;
	private ArrayList<PlayList> playlist;
	
	public Usuario() {
	}

	/**
	 * @param nombre
	 * @param playlist
	 */
	public Usuario(String nombre, ArrayList<PlayList> playlist) {
		super();
		this.nombre = nombre;
		this.playlist = playlist;
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
	 * @return the playlist
	 */
	public ArrayList<PlayList> getPlaylist() {
		return playlist;
	}

	/**
	 * @param playlist the playlist to set
	 */
	public void setPlaylist(ArrayList<PlayList> playlist) {
		this.playlist = playlist;
	}
	
	@Override
	public String toString() {
		return this.getNombre()+" "+this.getPlaylist();
	}
}
