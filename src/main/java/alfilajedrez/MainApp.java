package alfilajedrez;

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
	
}
