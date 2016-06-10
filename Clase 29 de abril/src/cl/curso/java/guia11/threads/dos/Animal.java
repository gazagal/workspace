/**
 * 
 */
package cl.curso.java.guia11.threads.dos;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * @author Gabriel Zagal
 *
 */
public class Animal implements Runnable {
	private String nombre;
	private int velocidad;
	private long descanso;
	private int posicion;
	private static boolean carreraFinalizada;
	private JButton button;
	private int y;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param velocidad
	 * @param descanso
	 * @param posicion
	 */
	public Animal(String nombre, int velocidad, long descanso, int posicion, JButton button, int y) {
		super();
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.descanso = descanso;
		this.posicion = posicion;
		this.button = button;
		this.y = y;
		
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the button
	 */
	public JButton getButton() {
		return button;
	}

	/**
	 * @param button the button to set
	 */
	public void setButton(JButton button) {
		this.button = button;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the carreraFinalizada
	 */
	public boolean isCarreraFinalizada() {
		return carreraFinalizada;
	}

	/**
	 * @param carreraFinalizada the carreraFinalizada to set
	 */
	public static void setCarreraFinalizada(boolean carreraFinalizada) {
		Animal.carreraFinalizada = carreraFinalizada;
	}

	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * @return the descanso
	 */
	public long getDescanso() {
		return descanso;
	}

	/**
	 * @param descanso the descanso to set
	 */
	public void setDescanso(long descanso) {
		this.descanso = descanso;
	}

	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public void desplazamiento() throws InterruptedException{
		if(this.getPosicion()>=500){
			Animal.setCarreraFinalizada(true);
			System.out.println("El ganador es "+this.getNombre());
			JOptionPane.showMessageDialog(null, "El ganador es "+this.getNombre()+"!!!", "Fin de la Carrera", JOptionPane.INFORMATION_MESSAGE);
		}else{
			this.setPosicion(getPosicion()+this.getVelocidad());
			this.getButton().setBounds(getPosicion(),y, 89, 23);
			Thread.sleep((long)(0 + (Math.random() * this.getDescanso())));
		}
		
	}
	
	@Override
	public void run() {
		while(!isCarreraFinalizada()){
			try {
				this.desplazamiento();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
