/**
 * 
 */
package cl.curso.java.decorador;

/**
 * @author Gabriel Zagal
 *
 */
public class PizzaEspañola extends PizzaDecorador {

	public void cocinarPizza() {
		this.getPizza().cocinarPizza();
		System.out.println("Agregar Ingredientes pizza española.");
	}

	
}
