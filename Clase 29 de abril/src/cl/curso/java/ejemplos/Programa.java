package cl.curso.java.ejemplos;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args)
	{
		
//		String color = JOptionPane.showInputDialog("Ingrese color");
//		String marca = JOptionPane.showInputDialog("Ingrese marca");
//		String patente = JOptionPane.showInputDialog("Ingrese patente");
//		
//		Auto autoIngresado = new Auto(color, marca, patente);
		
//		Auto autoToyota = new Auto("Azul", "Toyota", "toyo74");
//		Motor motorToyota = new Motor(2000, "bencina");
//		autoToyota.setMotor(motorToyota);
//		
//		boolean opcionSalir = false;
//		
//		do
//		{
//			String opcion = JOptionPane.showInputDialog(
//					"Opcion 1: Encender auto \n" 
//					+ "Opcion 2: Avanzar\n"
//					+ "Opcion 3: Imprimir\n"
//					+ "Opcion 4: Salir");
//			
//			switch (opcion) {
//				case "1":	
//				{
//					autoToyota.encender();
//					break;
//				}
//				case "2":	
//				{
//					String distanciaRecorrida = JOptionPane.showInputDialog("Ingrese kilometros");
//					
//					autoToyota.avanzar(Integer.parseInt(distanciaRecorrida));
//					break;
//				}
//				case "3":	
//				{
//					autoToyota.atributos();
//					break;
//				}
//				case "4":	
//				{
//					opcionSalir = !opcionSalir;
//					break;
//				}
//	
//	
//				default:
//				{
//					
//					break;
//				}
//			}
//		}
//		while(!opcionSalir);
//		
		
		
		
		String fecha = JOptionPane.showInputDialog("Ingrese una fecha");
		SimpleDateFormat sFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date date = sFormat.parse(fecha);
		}
		catch(ParseException e){
			JOptionPane.showMessageDialog(null, "Error", "La fecha no es correcta", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
//		Auto autoHorda = new Auto("blanco", "Horda", "asdf12");
//		autoIngresado.avanzar();
//		System.out.println( autoIngresado.getColor() );
//		autoIngresado.setColor("Amarillo");
//		System.out.println( autoIngresado.getMarca() );
//		autoIngresado.setMarca("Wololo");
//		System.out.println( autoIngresado.getPatente() );
//		autoIngresado.setPatente("ABAB33");
//		autoIngresado.atributos();
//		
//		autoToyota.avanzar();
//		System.out.println( autoToyota.getColor() );
//		autoToyota.setColor("Negro");
//		System.out.println( autoToyota.getMarca() );
//		autoToyota.setMarca("Wololo2");
//		System.out.println( autoToyota.getPatente() );
//		autoToyota.setPatente("BBBB65");
//		autoToyota.atributos();
		
//		autoHorda.avanzar();
//		System.out.println( autoHorda.getColor() );
//		autoHorda.setColor("Azul");
//		System.out.println( autoHorda.getMarca() );
//		autoHorda.setMarca("Wololo3");
//		System.out.println( autoHorda.getPatente() );
//		autoHorda.setPatente("CCCC65");
//		autoHorda.atributos();
		
		
		
	}

}
