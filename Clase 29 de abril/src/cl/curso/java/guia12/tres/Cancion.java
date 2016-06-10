/**
 * 
 */
package cl.curso.java.guia12.tres;

/**
 * @author Gabriel Zagal
 *
 */
public class Cancion implements Comparable<Cancion> {
	private String nombre;
	private String artista;
	private int duracionMin;
	
	public Cancion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param artista
	 * @param duracionMin
	 */
	public Cancion(String nombre, String artista, int duracionMin) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracionMin = duracionMin;
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
	 * @return the artista
	 */
	public String getArtista() {
		return artista;
	}

	/**
	 * @param artista the artista to set
	 */
	public void setArtista(String artista) {
		this.artista = artista;
	}

	/**
	 * @return the duracionMin
	 */
	public int getDuracionMin() {
		return duracionMin;
	}

	/**
	 * @param duracionMin the duracionMin to set
	 */
	public void setDuracionMin(int duracionMin) {
		this.duracionMin = duracionMin;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cancion){
			Cancion cancion = (Cancion)obj;
			return ((this.getNombre().equals(cancion.getNombre()))&&(this.getArtista().equals(cancion.getArtista())));
		}
		return false;
	}
	@Override
	public String toString() {
		return this.getNombre()+" - "+this.getArtista()+" - "+this.getDuracionMin()+" Minutos.";
	}

	@Override
	public int compareTo(Cancion c) {
		return new Integer(this.getDuracionMin()).compareTo(new Integer(c.getDuracionMin()));
	}
}
