/**
 * 
 */
package cl.curso.java.guia10.uno;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Circulo circulo = new Circulo("Rojo", 0, 3);
		circulo.dibujar();
		System.out.println(circulo.calcularArea());
		
		Triangulo triangulo = new Triangulo("Azul", 3, 2, 1);
		triangulo.dibujar();
		System.out.println(triangulo.calcularArea());
		
		Cuadrado cuadrado = new Cuadrado("Verde", 4, 6);
		cuadrado.dibujar();
		System.out.println(cuadrado.calcularArea());
	}

}
