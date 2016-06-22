/**
 * 
 */
package cl.curso.java.ayudantia.cinco_builder;

/**
 * @author Gabriel Zagal
 *
 */
public class app {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ComboComidaRapida combo1 = new ComboComidaRapida("Combo 1", 2500, new BebidaNormal(), new PapasFritasNormal(), new HamburguesaVegetariana());
		ComboComidaRapida combo2 = new ComboComidaRapida("Combo 2", 3500, new BebidaAgrandada(), new PapasFritasNormal(), new HamburguesaPollo());
		
	}

}
