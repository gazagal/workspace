/**
 * 
 */
package cl.curso.java.abstract_factory_app;

/**
 * @author Gabriel Zagal
 *
 */
public class MacOSXWidgetFactory implements AbstractWidgetFactory {

	/* (non-Javadoc)
	 * @see cl.curso.java.abstract_factory_app.AbstractWidgetFactory#createWindow()
	 */
	public Window createWindow() {
		return new MacOSXWindow();
	}

}