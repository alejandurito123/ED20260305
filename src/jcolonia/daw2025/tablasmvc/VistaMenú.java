package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;

public class VistaMenú {
	
	public static void mostrarOpciones() {
		System.out.println("1) Mostrar la Tabla");
		System.out.println("2) Exportar la tabla");
		System.out.println("3) Cambiar la tabla");
		System.out.println("0) Salir");
	}
	
	public static int pedirOpción() {		
		return VistaGeneral.pedirNúmero("Elija opción") ;
		
	}
	

}
