/**
 * 
 */
package cl.curso.java.ejemplos.playlist;

import java.util.ArrayList;

/**
 * @author Gabriel Zagal
 *
 */
public class PlayList {
	private String nombre;
	private ArrayList<Cancion> canciones;
	private ArrayList<Usuario> seguidores;
	
	public PlayList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param canciones
	 * @param seguidores
	 */
	public PlayList(String nombre, ArrayList<Cancion> canciones, ArrayList<Usuario> seguidores) {
		super();
		this.nombre = nombre;
		this.canciones = canciones;
		this.seguidores = seguidores;
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
	 * @return the canciones
	 */
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	/**
	 * @param canciones the canciones to set
	 */
	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	/**
	 * @return the seguidores
	 */
	public ArrayList<Usuario> getSeguidores() {
		return seguidores;
	}

	/**
	 * @param seguidores the seguidores to set
	 */
	public void setSeguidores(ArrayList<Usuario> seguidores) {
		this.seguidores = seguidores;
	}
	
	public void agregarCancion (Cancion cancion){
		this.getCanciones().add(cancion);
		System.out.println(cancion.getNombre()+" agregada a la playlist: "+this.getNombre());
	}
	
	public void eliminarCancion (Cancion cancion){
		this.getCanciones().remove(cancion);
		if(this.getCanciones().remove(cancion)){
			System.out.println(cancion.getNombre()+" eliminada de la playlist: "+this.getNombre());
		}else{
			System.out.println(cancion.getNombre()+" no encontrada en la playlist: "+this.getNombre());
		}
		
	}
	
	public int DuracionMin(){
		int duracionMin = 0;
		for(Cancion cancion: canciones){
			duracionMin = duracionMin + cancion.getDuracionMin();
		}
		return duracionMin;
	}
	
	@Override
	public String toString() {
		return this.getNombre()+"\n"+this.getCanciones()+"\n"+this.getSeguidores();
	}
	
	public void ordenarDuracion(){
		Cancion duracionAnterior= this.getCanciones().get(0);
		for( int i =1; i<canciones.size();i++){
			if(this.getCanciones().get(i).getDuracionMin()<this.getCanciones().get(i-1).getDuracionMin()){
				duracionAnterior = this.getCanciones().get(i);
				this.getCanciones().remove(i);
				this.getCanciones().add(i-1, duracionAnterior);
				i = 0;
			}
		}
	}
	
	
}
