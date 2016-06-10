/**
 * 
 */
package cl.curso.java.builder;

/**
 * @author Gabriel Zagal
 *
 */
public class Director {
	private BuilderAuto builder;

	/**
	 * @return the builder
	 */
	public BuilderAuto getBuilder() {
		return builder;
	}

	/**
	 * @param builder the builder to set
	 */
	public void setBuilder(BuilderAuto builder) {
		this.builder = builder;
	}
	
	public Auto construirAuto(){
		return this.getBuilder().construir();
	}
}
