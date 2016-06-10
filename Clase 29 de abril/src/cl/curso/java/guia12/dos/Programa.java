/**
 * 
 */
package cl.curso.java.guia12.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
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
		List<Comentario> comentarios = new ArrayList<>();
		List<Like> likes = new LinkedList<>();
		
		Usuario usuario1 = new Usuario("Gabo", "12345", "g.aaaabo@gmail.com");
		Usuario usuario2 = new Usuario("Fifo", "696969", "MGSTPC@gmail.com");
		
		Publicacion publicacion = new Publicacion(123456789, "123", usuario2, likes, comentarios);
		
		@SuppressWarnings("deprecation")
		Date fecha = new Date(2016, 06, 02);
		Comentario comentario = new Comentario(234, usuario1, "que mierda estas publicando??", fecha);
		Comentario comentario2 = new Comentario(236, usuario2, "Que wea??!!", fecha);
		Like like= new Like(1212, usuario1, fecha);
		
		publicacion.agregarLike(like);
		publicacion.agregarComentario(comentario);
		publicacion.agregarComentario(comentario2);
		
		System.out.println(publicacion );
		publicacion.ordenarComentariosPorUsuario();
		System.out.println(publicacion );
		publicacion.ordenarLikesPorUsuario();
		System.out.println(publicacion );
		publicacion.eliminarComentario(comentario);
		System.out.println(publicacion );
		
	}

}
