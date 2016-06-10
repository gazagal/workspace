/**
 * 
 */
package cl.curso.java.guia12.dos;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class Publicacion {
	private int identificador;
	private String password;
	private Usuario owner;
	private List<Like> like;
	private List<Comentario> comentario;
	
	public Publicacion() {
	}

	/**
	 * @param identificador
	 * @param password
	 * @param owner
	 * @param like
	 * @param comentario
	 */
	public Publicacion(int identificador, String password, Usuario owner, List<Like> like,
			List<Comentario> comentario) {
		super();
		this.identificador = identificador;
		this.password = password;
		this.owner = owner;
		this.like = like;
		this.comentario = comentario;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the like
	 */
	public List<Like> getLike() {
		return like;
	}

	/**
	 * @param like the like to set
	 */
	public void setLike(List<Like> like) {
		this.like = like;
	}

	/**
	 * @return the comentario
	 */
	public List<Comentario> getComentario() {
		return comentario;
	}

	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}
	
	public void agregarComentario(Comentario comentario){
		this.getComentario().add(comentario);
	}
	
	public void eliminarComentario(Comentario comentario){
		this.getComentario().remove(comentario);
	}
	
	public void ordenarComentariosPorUsuario(){
		Collections.sort(this.getComentario(), new Comparator<Comentario>() {

			@Override
			public int compare(Comentario o1, Comentario o2) {
				return o1.getOwner().getNombre().compareTo(o2.getOwner().getNombre());
			}
		});
	}
	
	public void ordenarLikesPorUsuario(){
		Collections.sort(this.getLike(), new Comparator<Like>() {

			@Override
			public int compare(Like o1, Like o2) {
				return o1.getOwner().getNombre().compareTo(o2.getOwner().getNombre());
			}
		});
	}
	
	public void agregarLike(Like like){
		this.getLike().add(like);
	}
	
	public void eliminarLike(Like like){
		this.getLike().remove(like);
	}
	
	@Override
	public String toString() {
		return this.getIdentificador()+" - "+this.getPassword()+" - "+this.getOwner()+" - "+this.getLike()+" - "+this.getComentario();
	}
}
