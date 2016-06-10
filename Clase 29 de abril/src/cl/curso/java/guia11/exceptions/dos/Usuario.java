/**
 * 
 */
package cl.curso.java.guia11.exceptions.dos;

/**
 * @author Gabriel Zagal
 *
 */
public class Usuario {
	private String nombreUsuario;
	private String password;
	private int intentosFallidos;

	public Usuario() {
	}

	/**
	 * @param nombreUsuario
	 * @param password
	 * @param intentosFallidos
	 */
	public Usuario(String nombreUsuario, String password, int intentosFallidos) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.intentosFallidos = intentosFallidos;
	}

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario
	 *            the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the intentosFallidos
	 */
	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	/**
	 * @param intentosFallidos
	 *            the intentosFallidos to set
	 */
	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	public void login(String usuario, String contraseña) throws AutenticacionException, CuentaBloqueadaException {
		if (this.getIntentosFallidos() >= 3) {
			throw new CuentaBloqueadaException("Cuenta bloqueada, ha realizado mas de 3 intentos");
		}
		if (((this.getNombreUsuario().equals(usuario)) && (this.getPassword().equals(contraseña)))) {
			System.out.println("Conectado");
		} else {
			this.setIntentosFallidos(this.getIntentosFallidos() + 1);
			throw new AutenticacionException("Nombre de usuario o contraseña no validos");
		}
	}
}
