package cl.curso.java.guia1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int numeroIngresado;
		
		System.out.println("Ingrese numero a consultar");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		numeroIngresado = sc.nextInt();
		
		if (numeroIngresado < 0)
		{
			System.out.println("Numero negativo");
		}
		else
		{
			System.out.println("Numero positivo");
		}

	}

}
