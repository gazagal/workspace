/**
 * 
 */
package cl.curso.java.ejemplos.playlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Cancion> canciones1 = new ArrayList<>();
		ArrayList<Cancion> canciones2 = new ArrayList<>();
		ArrayList<PlayList> playlist1 = new ArrayList<>();
		ArrayList<PlayList> playlist2 = new ArrayList<>();
		ArrayList<Usuario> seguidores1 = new ArrayList<>();
		ArrayList<Usuario> seguidores2 = new ArrayList<>();
		
		
		Cancion cancion1 = new Cancion("A Fifo lo entierran hoy", "Fifo", 10);
		Cancion cancion2 = new Cancion("Yo quiero ser el mejor", "Pokemon", 2);
		Cancion cancion3 = new Cancion("Joder Irene", "No me acuerdo", 4);
		Cancion cancion4 = new Cancion("I'm Murlock", "E.T.C", 1);
		Cancion cancion5 = new Cancion("Adventure of a Lifetime", "Coldplay", 5);
		
		Usuario usuario1 = new Usuario("Fifo", playlist1);
		Usuario usuario2 = new Usuario("Gabo", playlist2);
		
		PlayList playlistFifo = new PlayList("para niñas", canciones1, seguidores1);
		PlayList playlistGabo = new PlayList("Mientras juegas", canciones2, seguidores2);
		
		seguidores1.add(usuario1);
		seguidores2.add(usuario2);
		seguidores2.add(usuario1);
		
		playlistFifo.agregarCancion(cancion1);
		playlistFifo.agregarCancion(cancion3);
		
		playlistGabo.agregarCancion(cancion2);
		playlistGabo.agregarCancion(cancion4);
		playlistGabo.agregarCancion(cancion5);
		
//		System.out.println(playlistFifo.DuracionMin());
//		System.out.println(playlistGabo.DuracionMin());
//		
//		playlistGabo.eliminarCancion(cancion1);
//		
//		System.out.println(playlistGabo.DuracionMin());
		
		System.out.println("");
		System.out.println(playlistGabo);
		System.out.println("");
		
//		playlistGabo.ordenarDuracion();
		Collections.sort(playlistGabo.getCanciones(),new Comparator<Cancion>() {

			@Override
			public int compare(Cancion o1, Cancion o2) {
				return new Integer(o1.getDuracionMin()).compareTo(new Integer(o2.getDuracionMin()));
			}
		});
		
		System.out.println(playlistGabo);
		
		
		
		
	}

}
