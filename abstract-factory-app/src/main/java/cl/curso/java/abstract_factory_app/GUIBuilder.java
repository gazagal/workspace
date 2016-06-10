/**
 * 
 */
package cl.curso.java.abstract_factory_app;

/**
 * @author Gabriel Zagal
 *
 */
public class GUIBuilder {
	public Window buildWindow(AbstractWidgetFactory factory){
		return factory.createWindow();
	}
}
