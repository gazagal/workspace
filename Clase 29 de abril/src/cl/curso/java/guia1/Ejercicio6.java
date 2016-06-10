package cl.curso.java.guia1;

import java.util.Scanner;

public class Ejercicio6 
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int num = 0;
		System.out.println("introduzca numero");
		Scanner numero = new Scanner(System.in);
		num = numero.nextInt();
		
		for(int contador = 1; contador == num; contador ++)
		{
			System.out.println("imprimiendo " + contador);
		}
	}
}
