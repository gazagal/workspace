package cl.curso.java.composite;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SubMenu menuNew = new SubMenu("New", new ArrayList<Menu>(), new ComandoNulo());
    	menuNew.getMenus().add(new ItemMenu("Java Project", "", new ComandoNulo()));
    	menuNew.getMenus().add(new ItemMenu("Project...", "", new ComandoNulo()));
    	
        SubMenu menu = new SubMenu("File",new ArrayList<Menu>(), new ComandoNulo());
        menu.getMenus().add(menuNew);
        menu.getMenus().add(new ItemMenu("Open File", "",new ComandoAbrir()));
        menu.getMenus().add(new LineaSeparadora(null, new ComandoNulo()));
        menu.getMenus().add(new ItemMenu("Close", "cmd+w",new ComandoCerrar()));
        menu.getMenus().add(new ItemMenu("Close All", "shift+cmd+w", new Command() {
			
			public void ejecutar() {
				System.out.println("Cerrar todo.");
				
			}
		}));
    	menu.pintarMenu();
    	
    	menu.onClick();
    }
}
