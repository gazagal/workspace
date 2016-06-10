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
public class BuilderAutoTesla extends BuilderAuto {

	/* (non-Javadoc)
	 * @see cl.curso.java.builder.BuilderAuto#construir()
	 */
	@Override
	public Auto construir() {
		Auto auto = new Auto();
		Motor motor = new Motor();
		motor.setCaballosDeFuerza(1500);
		
		Ruedas rueda = new Ruedas();
		rueda.setDiametro(25);
		List<Ruedas> ruedas = new ArrayList<Ruedas>();
		ruedas.add(rueda);
		ruedas.add(rueda);
		ruedas.add(rueda);
		ruedas.add(rueda);
		
		GPS gps = new GPS();
		gps.setOs("MacOx");
		gps.setVersion("1.0.55");
		
		auto.setMarca("Tesla");
		auto.setModelo("XXXXX");
		auto.setMotor(motor);
		auto.setRuedas(ruedas);
		auto.setGps(gps);
		
		return auto;
	}

}
