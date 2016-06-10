/**
 * 
 */
package cl.curso.java.guia12.cinco;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CuentaCorriente cCorriente = new CuentaCorriente(1234, 15000, 20000);
		CuentaVista cVista = new CuentaVista(123455, 25000);
		List<CuentaBancaria> cuentas = new ArrayList<>();
		
		cuentas.add(cCorriente);
		cuentas.add(cVista);
		
		Persona persona= new Persona("Gabriel", 10000, cuentas);
		System.out.println(cuentas);
		persona.depositarDinero(150);
		System.out.println(cuentas);
		persona.girarDinero(100);
		System.out.println(cuentas);
		
	}

}
