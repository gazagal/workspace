/**
 * 
 */
package cl.curso.java.ejemplos.division;

/**
 * @author Gabriel Zagal
 *
 */
public class Division {
	private int dividendo;
	private int divisor;
	
	public Division(){
		
	}

	/**
	 * @param dividendo
	 * @param divisor
	 */
	public Division(int dividendo, int divisor) {
		this.dividendo = dividendo;
		this.divisor = divisor;
	}

	/**
	 * @return the dividendo
	 */
	public int getDividendo() {
		return dividendo;
	}

	/**
	 * @param dividendo the dividendo to set
	 */
	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	/**
	 * @return the divisor
	 */
	public int getDivisor() {
		return divisor;
	}

	/**
	 * @param divisor the divisor to set
	 */
	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}
	
	public double hacerDivision(){
		return this.getDividendo()/this.getDivisor();
	}
	
	
	
}
