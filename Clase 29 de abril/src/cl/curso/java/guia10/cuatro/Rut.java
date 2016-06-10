/**
 * 
 */
package cl.curso.java.guia10.cuatro;

/**
 * @author Gabriel Zagal
 *
 */
public class Rut implements Validable {
	private int numero;
	private String digitoVerificador;
	
	public Rut() {
	}
	
	/**
	 * @param numero
	 * @param digitoVerificador
	 */
	public Rut(int numero, String digitoVerificador) {
		super();
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
		if (this.getDigitoVerificador()==null){
			return false;
		}
		if (this.getDigitoVerificador().length() !=1){
			return false;
		}
		int contador = 2;
		int multiplicacion = 0;
		int sumaMulti = 0;
		int resto = 0;
		int verificador = 0;
		
		for(int i = 8;i >=1;i--){
			multiplicacion = (this.getNumero()%10)*contador;
			this.setNumero(this.getNumero()/10);
			sumaMulti =sumaMulti + multiplicacion;
			contador++;
			if(contador == 8){
				contador = 2;
			}
		}
		
		resto = sumaMulti % 11;
		verificador = 11-resto;
		if(this.getDigitoVerificador()=="k"||this.getDigitoVerificador()=="K"){
			this.setDigitoVerificador("10");
		}
		
		int digitoVerificador=Integer.parseInt(getDigitoVerificador());
		
		
		if(verificador>=11){
			verificador = 0;
		}
		
		return (verificador == digitoVerificador);
	}
	

}
