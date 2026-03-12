package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Genera la tabla de multiplicar de un número y la almacena en una lista
 * de cadenas de texto. Permite obtener la tabla para mostrarla por pantalla
 * o para exportarla.
 * @author Alejandro Vázquez Arnaiz
 */
public class TablaMultiplicar {
	
	/**
	 * Número del que se generará la tabla de multiplicar.
	 */
	private int número;
	
	/**
	 * Lista de líneas de texto que representan la tabla generada.
	 */
	private List<String> listaTextos;
	
	
	/**
	 * Crea una nueva tabla de multiplicar para el número indicado.
	 * @param número número del que se generará la tabla de multiplicar
	 */
	public TablaMultiplicar(int número) {
		this.número = número;
		this.listaTextos = new ArrayList <String>();
		
	}
	
	
	/**
	 * Genera la tabla de multiplicar el numero asociado.
	 * Rellena la lista interna con diez líneas, desde 1 hasta 10.
	 */
	public void generarTabla() {
		listaTextos.clear();
		
		for(int i = 1; i<=10; i++) {
			String linea = String.format("%d x %d = %d", número, i, número * i);
			listaTextos.add(linea);
		}
	}
	
	
	/**
	 * Devuelve la lista de líneas generadas para su posible exportación.
	 * @return lista de cadenas con la tabla de multiplicar
	 */
	public List <String> toListaExportación(){
		return listaTextos;
	}
	
	
	/**
	 * Devuelve la lista de líneas generadas para mostrarla por pantalla.
	 * @return lista de cadenas con la tabla de multiplicar
	 */
	public List <String> toListaPantalla(){
		return listaTextos;
	}
	
	
	/**
	 * Devuelve la tabla de multiplicar como un único texto,
     * con cada línea separada por un salto de línea.
     * @return representación en texto de la tabla de multiplicar.
	 */
	@Override
	public String toString() {
		
	    StringBuilder sb = new StringBuilder();
	    for (String linea : listaTextos) {
	        sb.append(linea).append("\n");
	    }
	    return sb.toString();
		
	}

}
