package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;

/**
 * Gestiona la visualización y entrada de opciones del menú principal
 * de la aplicación.
 * @author Alejandro Vázquez Arnaiz
 */
public class VistaMenú {
	
	/**
	 * Muestra por consola las opciones disponibles del menú principal.
	 */
	public static void mostrarOpciones() {
		System.out.println("1) Mostrar la Tabla");
		System.out.println("2) Exportar la tabla");
		System.out.println("3) Cambiar la tabla");
		System.out.println("0) Salir");
	}
	
	/**
	 * Solicita al ususario que introduzca una opción del menú.
	 * @return la opción elegida por el ususario como un número entero.
	 */
	public static int pedirOpción() {		
		return VistaGeneral.pedirNúmero("Elija opción") ;
		
	}
	

}
