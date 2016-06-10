/**
 * 
 */
package cl.curso.java.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gabriel Zagal
 *
 */
public class BuilderAutoToyota extends BuilderAuto {

	/* (non-Javadoc)
	 * @see cl.curso.java.builder.BuilderAuto#construir()
	 */
	@Override
	public Auto construir() {
		Auto auto = new Auto();
		Motor motor = new Motor();
		motor.setCaballosDeFuerza(2000);
		Ruedas rueda = new Ruedas();
		rueda.setDiametro(20);
		List<Ruedas> ruedas = new ArrayList<Ruedas>();
		ruedas.add(rueda);
		ruedas.add(rueda);
		ruedas.add(rueda);
		ruedas.add(rueda);
		GPS gps = new GPS();
		gps.setOs("Windows 7");
		gps.setVersion("1.23.2");
		
		auto.setMarca("Toyota");
		auto.setModelo("Yaris");
		auto.setMotor(motor);
		auto.setRuedas(ruedas);
		auto.setGps(gps);
		
		return auto;
	}

}
