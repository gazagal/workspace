/**
 * 
 */
package cl.curso.java.ejemplos.superheroe;

/**
 * @author Gabriel Zagal
 *
 */
public class ProgramaSuper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Granada granada1 = new Granada();
		Kryptonita kryptonita1 = new Kryptonita();
		
		Superman superman = new Superman();
		Batman batman = new Batman();
		
		superman.recibirAtaque(granada1);
		batman.recibirAtaque(granada1);
		
		superman.recibirAtaque(kryptonita1);
		batman.recibirAtaque(kryptonita1);
	}

}
