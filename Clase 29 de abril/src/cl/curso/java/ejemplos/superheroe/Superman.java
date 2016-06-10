/**
 * 
 */
package cl.curso.java.ejemplos.superheroe;

/**
 * @author Gabriel Zagal
 *
 */
public class Superman extends SuperHeroe {

	@Override
	public void recibirAtaque(Arma arma) {
		if (arma instanceof Kryptonita){
			System.out.println("GG Superman");
		}else{
			System.out.println("OP");
		}
	}

}
