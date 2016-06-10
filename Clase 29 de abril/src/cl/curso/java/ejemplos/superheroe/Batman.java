/**
 * 
 */
package cl.curso.java.ejemplos.superheroe;

/**
 * @author Gabriel Zagal
 *
 */
public class Batman extends SuperHeroe {

	@Override
	public void recibirAtaque(Arma arma) {
		if (arma instanceof Granada){
			System.out.println("GG Batman");
		}else{
			System.out.println("Cry cry...");
		}
		
	}

}
