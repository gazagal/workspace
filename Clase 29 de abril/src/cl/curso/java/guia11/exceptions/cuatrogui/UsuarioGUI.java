package cl.curso.java.guia11.exceptions.cuatrogui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import cl.curso.java.guia11.exceptions.dos.AutenticacionException;
import cl.curso.java.guia11.exceptions.dos.CuentaBloqueadaException;
import cl.curso.java.guia11.exceptions.dos.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsuarioGUI {

	private JFrame frame;
	private JTextField usuarioTxt;
	private JTextField contraseñaTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioGUI window = new UsuarioGUI();
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
	public UsuarioGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(41, 36, 62, 14);
		frame.getContentPane().add(lblUsuario);
		
		usuarioTxt = new JTextField();
		usuarioTxt.setBounds(170, 33, 86, 20);
		frame.getContentPane().add(usuarioTxt);
		usuarioTxt.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(41, 77, 75, 14);
		frame.getContentPane().add(lblContrasea);
		
		contraseñaTxt = new JTextField();
		contraseñaTxt.setBounds(170, 74, 86, 20);
		frame.getContentPane().add(contraseñaTxt);
		contraseñaTxt.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuario usuario = new Usuario("gabriel","123" , 2);
				try {
					
					usuario.login(usuarioTxt.getText(),contraseñaTxt.getText());
				}catch ( CuentaBloqueadaException e2){
					JOptionPane.showMessageDialog(null, e2.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
					usuarioTxt.setText("");
					contraseñaTxt.setText("");
				}catch (AutenticacionException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
					usuarioTxt.setText("");
					contraseñaTxt.setText("");
				}
				
				
			}
		});
		btnLogin.setBounds(99, 120, 89, 23);
		frame.getContentPane().add(btnLogin);
	}

}
