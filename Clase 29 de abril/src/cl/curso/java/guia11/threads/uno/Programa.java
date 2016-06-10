/**
 * 
 */
package cl.curso.java.guia11.threads.uno;

/**
 * @author Gabriel Zagal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CuentaBancaria cuenta1=new CuentaBancaria(150000, "1234567890");
		RetirarDineroThread retirar1 = new RetirarDineroThread(cuenta1, 100000);
		RetirarDineroThread retirar2 = new RetirarDineroThread(cuenta1, 50000);
		RetirarDineroThread retirar3 = new RetirarDineroThread(cuenta1, 100000);
		DepositarDineroThread depositar1 = new DepositarDineroThread(cuenta1, 15000);
		DepositarDineroThread depositar2 = new DepositarDineroThread(cuenta1, 15000);
		DepositarDineroThread depositar3 = new DepositarDineroThread(cuenta1, 15000);
		
		retirar1.start();
		retirar2.start();
		retirar3.start();
		depositar1.start();
		depositar2.start();
		depositar3.start();
		
		try {
			Thread.sleep(500);
			System.out.println(cuenta1.getSaldo());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
