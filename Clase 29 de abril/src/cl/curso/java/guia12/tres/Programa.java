/**
 * 
 */
package cl.curso.java.guia12.tres;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Cancion> canciones = new ArrayList<>();
		Cancion cancion1 = new Cancion("cancion 1", "asd", 1);
		Cancion cancion2 = new Cancion("cancion 2", "qw", 2);
		Cancion cancion3 = new Cancion("cancion 3", "zxc", 3);
		
		canciones.add(cancion1);
		canciones.add(cancion2);
		canciones.add(cancion3);
		
		Playlist playlist = new Playlist(canciones);
		playlist.reproducirAleatorio();
		System.out.println(playlist);
		
	}

}
