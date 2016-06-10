/**
 * 
 */
package cl.curso.java.guia10.cuatro;

/**
 * @author Gabriel Zagal
 *
 */
public class ISBN implements Validable {
	private int numero;
	private String digitoVerificador;
	
	public ISBN() {
	}
	
	/**
	 * @param numero
	 * @param digitoVerificador
	 */
	public ISBN(int numero, String digitoVerificador) {
		this.numero = numero;
		this.digitoVerificador = digitoVerificador;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the digitoVerificador
	 */
	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	/**
	 * @param digitoVerificador the digitoVerificador to set
	 */
	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	@Override
	public boolean validar() {
		int resultadoMultip = 0;
		int sumaMultip = 0;
		int checksum = 0;
		
		for(int mult=2;mult==10;mult++){
			resultadoMultip = (this.getNumero()%10)*mult;
			this.setNumero(this.getNumero()/10);
			sumaMultip = sumaMultip + resultadoMultip;
		}
		
		int residuo = sumaMultip % 11;
		
		if(residuo == 0){
			checksum = 0;
		}else{
			checksum = 11 - residuo;
		}
		
		if(this.getDigitoVerificador()=="x"||this.getDigitoVerificador()=="X"){
			this.setDigitoVerificador("10");
		}
		
		return (checksum == Integer.parseInt(getDigitoVerificador()));
		
	}

}
