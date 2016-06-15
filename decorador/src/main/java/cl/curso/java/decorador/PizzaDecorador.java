/**
 * 
 */
package cl.curso.java.decorador;

/**
 * @author Gabriel Zagal
 *
 */
public class PizzaDecorador extends Pizza{
	private Pizza pizza;
	
	

	/**
	 * @return the pizza
	 */
	public Pizza getPizza() {
		return pizza;
	}


	/**
	 * @param pizza the pizza to set
	 */
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}


	@Override
	public void cocinarPizza() {
		System.out.println("Cocinar pizza.");
	}

}

