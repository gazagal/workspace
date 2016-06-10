package cl.curso.java.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotasGUI {

	private JFrame frame;
	private JTextField nota1;
	private JTextField nota2;
	private JTextField nota3;
	private JButton btnCalcularPromedio;
	private JLabel lblPromedio;
	private JTextField promedioText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasGUI window = new NotasGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NotasGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =   new JFrame();
		frame.setBounds(100, 100, 292, 296);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngresarNota = new JLabel("Ingresar Nota 1");
		lblIngresarNota.setBounds(31, 21, 102, 14);
		frame.getContentPane().add(lblIngresarNota);
		
		nota1 = new JTextField();
		nota1.setBounds(149, 18, 86, 20);
		frame.getContentPane().add(nota1);
		nota1.setColumns(10);
		
		JLabel lblIngresarNota_1 = new JLabel("Ingresar Nota 2");
		lblIngresarNota_1.setBounds(31, 65, 102, 14);
		frame.getContentPane().add(lblIngresarNota_1);
		
		nota2 = new JTextField();
		nota2.setBounds(149, 62, 86, 20);
		frame.getContentPane().add(nota2);
		nota2.setColumns(10);
		
		JLabel lblIngresarNota_2 = new JLabel("Ingresar Nota 3");
		lblIngresarNota_2.setBounds(31, 111, 102, 14);
		frame.getContentPane().add(lblIngresarNota_2);
		
		nota3 = new JTextField();
		nota3.setBounds(149, 108, 86, 20);
		frame.getContentPane().add(nota3);
		nota3.setColumns(10);
		
		btnCalcularPromedio = new JButton("Calcular Promedio");
		btnCalcularPromedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				Contador contador = new Contador(Integer.parseInt(nota1.getText()));
//				contador.aumentaCuenta();
//				System.out.println(contador.getCuenta());
				
				double promedio = (Double.parseDouble(nota1.getText())+Double.parseDouble(nota2.getText())+Double.parseDouble(nota3.getText()))/3;
				System.out.println(promedio);
				promedioText.setText(""+promedio);
			}
		});
		btnCalcularPromedio.setBounds(57, 161, 158, 23);
		frame.getContentPane().add(btnCalcularPromedio);
		
		lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(31, 205, 69, 14);
		frame.getContentPane().add(lblPromedio);
		
		promedioText = new JTextField();
		promedioText.setBounds(149, 202, 86, 20);
		frame.getContentPane().add(promedioText);
		promedioText.setColumns(10);
	}

}
