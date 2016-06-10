package cl.curso.java.gui;

//import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;

import cl.curso.java.gui.reloj.ApagarReloj;
import cl.curso.java.gui.reloj.Reloj;
import cl.curso.java.gui.reloj.Timer;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		
//		JFrame ventana = new JFrame();
//		
//		JLabel label = new JLabel("Hola Mundo");
//
//		ventana.setSize(400, 400);
//		ventana.getContentPane().add(label);
//		ventana.setVisible(true);

//		Ventana ventana = new Ventana();
		
//		Hilo hilo = new Hilo();
//		hilo.start();
//		hilo.join();
//		System.out.println("Fin Programa");
		
//		Contador contador = new Contador(0);
//		AumentaThread thread = new AumentaThread(contador);
//		AumentaThread thread2 = new AumentaThread(contador);
//		thread.start();
//		thread2.start();
		
		
		Reloj reloj = new Reloj(0, 59, 58, true);
		Timer timer = new Timer(reloj);
		ApagarReloj apagar = new ApagarReloj(reloj, 10000);
		
		timer.start();
		apagar.apagarReloj();
		
		
	}

}
