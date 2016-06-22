/**
 * 
 */
package cl.curso.java.ayudantia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Gabriel Zagal
 *
 */
public class Configuracion {
	private static Configuracion _config;
	private Connection config;
	
	private Configuracion() {
	}
	
	/**
	 * @return the config
	 */
	public Connection getConfig() {
		return config;
	}

	/**
	 * @param config the config to set
	 */
	public void setConfig(Connection config) {
		this.config = config;
	}


	public static Configuracion getInstance(){
		if (null == _config){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso", "alumnos", "java123");
				Configuracion config = new Configuracion();
				config.setConfig(conexion);
				_config = config;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return _config;
		
	}
}
