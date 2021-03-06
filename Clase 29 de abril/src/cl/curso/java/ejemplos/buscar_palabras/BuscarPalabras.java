/**
 * 
 */
package cl.curso.java.ejemplos.buscar_palabras;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Gabriel Zagal
 *
 */
public class BuscarPalabras {
	public static void main(String[] args) {
		String texto = "buenos dias buenos dias";
		String[] palabras = texto.split(" ");
		Map<String,Integer> contadorPalabras = new HashMap<String,Integer>();
		
		for (String palabra : palabras) {
			if(contadorPalabras.containsKey(palabra)){
				contadorPalabras.put(palabra, contadorPalabras.get(palabra)+1);
			}else{
				contadorPalabras.put(palabra, 1);
			}
			
		}
		Iterator<java.util.Map.Entry<String, Integer>> it = contadorPalabras.entrySet().iterator();
		while(it.hasNext()){
			java.util.Map.Entry<String, Integer> e = it.next();
			System.out.println(e.getKey()+": "+e.getValue());
		}
	
	
		
	}
	
}
