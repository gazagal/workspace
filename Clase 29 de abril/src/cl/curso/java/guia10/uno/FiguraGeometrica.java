/**
 * 
 */
package cl.curso.java.guia10.uno;

/**
 * @author Gabriel Zagal
 *
 */
public abstract class FiguraGeometrica {
	private String color;
	private int cantidadLados;
	
	public FiguraGeometrica(){
		
	}

	/**
	 * @param color
	 * @param cantidadLados
	 */
	public FiguraGeometrica(String color, int cantidadLados) {
		this.color = color;
		this.cantidadLados = cantidadLados;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the cantidadLados
	 */
	public int getCantidadLados() {
		return cantidadLados;
	}

	/**
	 * @param cantidadLados the cantidadLados to set
	 */
	public void setCantidadLados(int cantidadLados) {
		this.cantidadLados = cantidadLados;
	}
	
	public abstract void dibujar();
	
	public abstract double calcularArea();
	
	
	
}
