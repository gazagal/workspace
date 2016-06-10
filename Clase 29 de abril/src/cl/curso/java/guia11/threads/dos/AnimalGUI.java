package cl.curso.java.guia11.threads.dos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Label;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class AnimalGUI {

	private JFrame frmCarreraDeAnimales;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI window = new AnimalGUI();
					window.frmCarreraDeAnimales.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AnimalGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarreraDeAnimales = new JFrame();
		frmCarreraDeAnimales.setIconImage(Toolkit.getDefaultToolkit().getImage(AnimalGUI.class.getResource("/com/sun/javafx/scene/web/skin/OrderedListNumbers_16x16_JFX.png")));
		frmCarreraDeAnimales.setTitle("Carrera de Animales");
		frmCarreraDeAnimales.setBounds(100, 100, 693, 299);
		frmCarreraDeAnimales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarreraDeAnimales.getContentPane().setLayout(null);
		
		JButton perroB = new JButton("Perro");
		perroB.setBounds(0, 30, 89, 23);
		frmCarreraDeAnimales.getContentPane().add(perroB);
		
		JButton gatoB = new JButton("Gato");
		gatoB.setBounds(0, 76, 89, 23);
		frmCarreraDeAnimales.getContentPane().add(gatoB);
		
		JButton fifoB = new JButton("Fifo");
		fifoB.setBounds(0, 118, 89, 23);
		frmCarreraDeAnimales.getContentPane().add(fifoB);
		
		JButton btnNewButton_3 = new JButton("Iniciar carrera");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Thread threadA1 = new Thread(new Animal("Perro", 30, 3000, 0,perroB,30));
				Thread threadA2 = new Thread(new Animal("Gato", 50, 5000, 0, gatoB, 76));
				Thread threadA3 = new Thread(new Animal("Fifo", 10, 10000, 0, fifoB, 118));
				threadA1.start();
				threadA2.start();
				threadA3.start();
			}
		});
		btnNewButton_3.setBounds(276, 199, 125, 23);
		frmCarreraDeAnimales.getContentPane().add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBackground(new Color(255, 0, 0));
		textField.setBounds(500, 10, 5, 170);
		frmCarreraDeAnimales.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
