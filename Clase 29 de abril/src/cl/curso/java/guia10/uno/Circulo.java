/**
 * 
 */
package cl.curso.java.guia10.uno;

/**
 * @author Gabriel Zagal
 *
 */
public class Circulo extends FiguraGeometrica {
	private double radio;
	
	public Circulo() {
	}
	
	
	/**
	 * @param color
	 * @param cantidadLados
	 */
	public Circulo(String color, int cantidadLados, double radio) {
		super(color, cantidadLados);
		this.radio = radio;
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}


	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}


	@Override
	public void dibujar() {
		System.out.println("O "+this.getColor());
	}

	@Override
	public double calcularArea() {
		return 3.1415*this.getRadio()*this.getRadio();
	}

}
