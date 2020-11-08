package alfilajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	private static Alfil alfil = null;

	private static void mostrarAlfil() {
		System.out.println(alfil);
	}
	private static void mostrarMenu() {
		System.out.println("\nEscoje una de las siguiente opciones: ");
		System.out.println("1. Crear un alfil por defecto.");
		System.out.println("2. Crear un alfil de un color. ");
		System.out.println("3. Crear un alfil de un color en una columna inicial dada ('c' o 'f')");
		System.out.println("4. Mover el alfil.");
		System.out.println("5. Salir.");
	}
	private static int elegirOpcion() {
		int opcion;
		System.out.println("Escoge una opción: ");
		opcion = Entrada.entero();
		while (opcion < 1 || opcion > 5) {
			System.out.println("Opción incorrecta.");
			System.out.println("\nEscoje una de las siguiente opciones: ");
			System.out.println("1. Crear un alfil por defecto.");
			System.out.println("2. Crear un alfil de un color. ");
			System.out.println("3. Crear un alfil de un color en una columna inicial dada ('c' o 'f')");
			System.out.println("4. Mover el alfil.");
			System.out.println("5. Salir.");
			System.out.println("Escoge una opción: ");
			opcion = Entrada.entero();
		}
		return opcion;
	}
	
	private static Color elegirColor() {
		System.out.println("\nEscoge un color para el alfil: ");
		System.out.println("1. Color Blanco.");
		System.out.println("2. Color Negro");
		System.out.println("Escoge una opción: ");
		
		int opcionColor = Entrada.entero();
		
		while (opcionColor < 1 || opcionColor > 2) {
			System.out.println("Color incorrecto. Vuelve a intentarlo.");
			System.out.println("\nEscoge un color para el alfil: ");
			System.out.println("1. Color Blanco.");
			System.out.println("2. Color Negro");
			System.out.println("Escoge una opción: ");
			opcionColor = Entrada.entero();
		}
		
		Color color = null;
		
		if(opcionColor==1) {
			color = color.BLANCO;
		} else if(opcionColor==2) {
			color = color.NEGRO;
		}
		return color;
	}
}
