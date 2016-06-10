/**
 * 
 */
package cl.curso.java.guia10.uno;

/**
 * @author Gabriel Zagal
 *
 */
public class Cuadrado extends FiguraGeometrica {
	private int lado;
	
	public Cuadrado(){
		
	}
	

	/**
	 * @param color
	 * @param cantidadLados
	 */
	public Cuadrado(String color, int cantidadLados, int lado) {
		super(color, cantidadLados);
		this.lado = lado;
	}

	/**
	 * @return the lado
	 */
	public int getLado() {
		return lado;
	}


	/**
	 * @param lado the lado to set
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}


	@Override
	public void dibujar() {
		System.out.println("[] "+this.getColor());
	}

	@Override
	public double calcularArea() {
		return this.getLado()^2;
	}

}
