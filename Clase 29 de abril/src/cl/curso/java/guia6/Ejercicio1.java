package cl.curso.java.guia6;

public class Ejercicio1
{

	public static void main(String[] args) 
	{
		
		int pagoMensual = 5;
		int pagoTotal = 0;
				
		for (int cont = 1; cont <= 20; ++cont)
		{
			pagoMensual = pagoMensual * 2;
			pagoTotal = pagoTotal + pagoMensual;
			System.out.println("El " + cont + "° mes debe pagar $" + pagoMensual);
		}
		
		System.out.println("El total a pagar es $" + pagoTotal);

	}

}
