/**
 * 
 */
package cl.curso.java.guia9.uno;

/**
 * @author {Gabriel Zagal}
 *
 */
public class Equipo {
	private String nombre;
	private int cantidadPartidosGanados;
	private int cantidadPartidosPerdidos;
	private int cantidadPartidosEmpatados;
	private int partidosJugados;
	private int puntosTotales;
	
	public Equipo(){
		
	}

	/**
	 * @param nombre
	 * @param cantidadPartidosGanados
	 * @param cantidadPartidosPerdidos
	 * @param cantidadPartidosEmpatados
	 * @param partidosJugados
	 * @param puntosTotales
	 */
	public Equipo(String nombre, int cantidadPartidosGanados, int cantidadPartidosPerdidos,
			int cantidadPartidosEmpatados, int partidosJugados, int puntosTotales) {
		this.nombre = nombre;
		this.cantidadPartidosGanados = cantidadPartidosGanados;
		this.cantidadPartidosPerdidos = cantidadPartidosPerdidos;
		this.cantidadPartidosEmpatados = cantidadPartidosEmpatados;
		this.partidosJugados = partidosJugados;
		this.puntosTotales = puntosTotales;
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
	 * @return the cantidadPartidosGanados
	 */
	public int getCantidadPartidosGanados() {
		return cantidadPartidosGanados;
	}

	/**
	 * @param cantidadPartidosGanados the cantidadPartidosGanados to set
	 */
	public void setCantidadPartidosGanados(int cantidadPartidosGanados) {
		this.cantidadPartidosGanados = cantidadPartidosGanados;
	}

	/**
	 * @return the cantidadPartidosPerdidos
	 */
	public int getCantidadPartidosPerdidos() {
		return cantidadPartidosPerdidos;
	}

	/**
	 * @param cantidadPartidosPerdidos the cantidadPartidosPerdidos to set
	 */
	public void setCantidadPartidosPerdidos(int cantidadPartidosPerdidos) {
		this.cantidadPartidosPerdidos = cantidadPartidosPerdidos;
	}

	/**
	 * @return the cantidadPartidosEmpatados
	 */
	public int getCantidadPartidosEmpatados() {
		return cantidadPartidosEmpatados;
	}

	/**
	 * @param cantidadPartidosEmpatados the cantidadPartidosEmpatados to set
	 */
	public void setCantidadPartidosEmpatados(int cantidadPartidosEmpatados) {
		this.cantidadPartidosEmpatados = cantidadPartidosEmpatados;
	}

	/**
	 * @return the partidosJugados
	 */
	public int getPartidosJugados() {
		return partidosJugados;
	}

	/**
	 * @param partidosJugados the partidosJugados to set
	 */
	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	/**
	 * @return the puntosTotales
	 */
	public int getPuntosTotales() {
		return puntosTotales;
	}

	/**
	 * @param puntosTotales the puntosTotales to set
	 */
	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}
	
	/**
	 * suma 3 a puntos totales y aumenta la cantidad de juegos ganados y jugados
	 */
	public void ganar(){
		this.setPuntosTotales(this.getPuntosTotales()+3);
		this.setCantidadPartidosGanados(this.getCantidadPartidosGanados()+1);
		this.setPartidosJugados(this.getPartidosJugados()+1);
	}
	
	/**
	 * aumenta la cantidad de juegos perdidos y jugados
	 */
	public void perder(){
		this.setPartidosJugados(this.getPartidosJugados()+1);
		this.setCantidadPartidosPerdidos(this.getCantidadPartidosPerdidos()+1);
	}
	
	/**
	 * suma 1 a puntos totales y aumenta la cantidad de juegos empatados y jugados
	 */
	public void empatar(){
		this.setPartidosJugados(this.getPartidosJugados()+1);
		this.setCantidadPartidosEmpatados(this.getCantidadPartidosEmpatados()+1);
		this.setPuntosTotales(this.getPuntosTotales()+1);
	}
	
}
