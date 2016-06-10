/**
 * 
 */
package cl.curso.java.ejemplos.smartphone;

import java.util.ArrayList;

/**
 * @author Gabriel Zagal
 *
 */
public class SmartPhone {
	private String marca;
	private String modelo;
	private int memoriaMB;
	private ArrayList<App> app;
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param marca
	 * @param modelo
	 * @param memoriaMB
	 * @param app
	 */
	public SmartPhone(String marca, String modelo, int memoriaMB, ArrayList<App> app) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.memoriaMB = memoriaMB;
		this.app = app;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the memoriaMB
	 */
	public int getMemoriaMB() {
		return memoriaMB;
	}

	/**
	 * @param memoriaMB the memoriaMB to set
	 */
	public void setMemoriaMB(int memoriaMB) {
		this.memoriaMB = memoriaMB;
	}

	/**
	 * @return the app
	 */
	public ArrayList<App> getApp() {
		return app;
	}

	/**
	 * @param app the app to set
	 */
	public void setApp(ArrayList<App> app) {
		this.app = app;
	}
	
	public void instalarApp(App app){
		if(this.getMemoriaMB()>=app.getPesoMB()){
			this.getApp().add(app);
			this.setMemoriaMB(this.getMemoriaMB()-app.getPesoMB());
			System.out.println(app.getNombre()+ " instalado correctamente");
		}else{
			System.out.println("Memoria insuficiente, "+app.getNombre()+ "no se pudo instalar");
		}
	}
	
	public void eliminarApp(App app){
		this.getApp().remove(app);
		this.setMemoriaMB(this.getMemoriaMB()+app.getPesoMB());
		System.out.println(app.getNombre()+" eliminada del dispositivo");
	}
	
	@Override
	public String toString() {
		return this.getMarca()+", "+this.getModelo()+", "+this.getMemoriaMB()+"MB, "+this.getApp();
	}
}
