/**
 * 
 */
package cl.curso.java.guia10.uno;

/**
 * @author Gabriel Zagal
 *
 */
public class Triangulo extends FiguraGeometrica {
	private int base;
	private int altura;
	
	public Triangulo() {
	}
	
	
	
	/**
	 * @param color
	 * @param cantidadLados
	 * @param base
	 * @param altura
	 */
	public Triangulo(String color, int cantidadLados, int base, int altura) {
		super(color, cantidadLados);
		this.base = base;
		this.altura = altura;
	}


	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}



	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}



	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}



	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}



	@Override
	public void dibujar() {
		System.out.println("*Triangulo* "+this.getColor());
	}

	@Override
	public double calcularArea() {
		return this.getBase()*this.getAltura()/2;
	}

}
