package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;

/**
 * Clase que sirve para que el ususario interaccione con la consola.
 * Permite mostrar textos, títulos, avisos y pedir datos al usuario.
 * @author Alejandro Vázquez
 */
public class VistaGeneral {
	 
	/**
	 * Formato para el mensaje estándar.
	 */
	private final String FORMATO_PRINTF_MOSTRARTEXTO = "%s%n";
	
	/**
	 * Formato para mensaje de aviso o error.
	 */
	private final String FORMATO_PRINTF_MOSTRARAVISO = "¡¡ AVISO: %s !!%n";
		
	/**
	 * Scanner utilizado para que el ususario meta datos o elige opciones.
	 */
	private  Scanner scEntrada = new Scanner(System.in);

	/**
	 * Muestra un texto simple en la consola usando el formato estándar.
	 * @param texto El mensaje a mostrar.
	 */
	public void mostrarTexto(String texto) {
		
		System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO, texto);
	}
	
	/**
	 * Muestra un mensaje resaltado para aviso y errores.
	 * @param texto el mensaje de aviso a mostrar.
	 */
	public void mostrarAviso(String texto) {
		
		System.out.printf(FORMATO_PRINTF_MOSTRARAVISO, texto);
		
	}
	
	/**
	 * Imprime el título principal de la aplicación.
	 * @param texto Título a mostrar.
	 */
	public void mostrarTítulo(String texto) {
		
		System.out.println("\n" + texto.toUpperCase());
		System.out.println("---------------------------");
		
	}
	
	/**
	 * Imprime un subtítulo o título de seccion.
	 * @param texto Título de sección.
	 */
	public void Título2(String texto) {
		
		System.out.println("\n" + texto);
		System.out.println("===============");
		
	}
	
	/**
	 * Solicita un número al ususario y valida que la entrada sea correcta.
	 * @param texto El mensaje de solicitud.
	 * @return El número entero introducido o -1 si hay un erro de formato.
	 */
	public int pedirNúmero(String texto) {
		
		System.out.println(texto + ": ");
		try {
			return Integer.parseInt(scEntrada.nextLine());
		}catch (NumberFormatException e) {
			mostrarAviso("Error: Debe ingresar un número entero.");
			return -1;
		}
		
		
	}
	
	/**
	 * Detiene la ejecucuón hasta que el usuario puelse la tecla Enter.
	 * @param texto Mensaje que indica cómo continuar.
	 */
	public void pausa(String texto) {
		
		System.out.println("\n" + texto);
		scEntrada.nextLine();
	
		
	}
	
	/**
	 * Pide una confirmación de tipo Sí/No al usuario.
	 * @param texto La pregunta a realizar
	 * @return tue si el usuario introduce 'S', false en caso contrario.
	 */
	public boolean pedirConfirmación(String texto) {
		
		System.out.println(texto + " (S/N): ");
		String respuesta = scEntrada.nextLine();
		return respuesta.equalsIgnoreCase("S");
		
	}
	
	/**
	 * Muestra una lista de elementos (opciones de menú) línea por línea.
	 * @param lista Lista de Strings con las opciones.
	 */
	public void mostrarLista(List<String> lista) {
		
		for(String elemento : lista) {
			System.out.println(elemento);
		}
	}
	
	/**
	 * Obtiene el objeto Scanner utilizando para lectura de datos.
	 * @return  La instancia de Scanner configurada.
	 */
	public Scanner getScEntrada() {
		return this.scEntrada;
	}

}
