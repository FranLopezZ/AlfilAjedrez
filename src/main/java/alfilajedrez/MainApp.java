package alfilajedrez;
import javax.naming.OperationNotSupportedException;

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
	
	private static void crearAlfilDefecto() {
		alfil = new Alfil();
		System.out.println("\nSe ha creado un nuevo alfil por defecto\n " + alfil);
	}
	
	private static void crearAlfilColor() {
		alfil = new Alfil(elegirColor());
		System.out.println("\nSe ha creado un nuevo alfil con el color elegido\n " + alfil);
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
	
	private static void crearAlfilColorColumna() {
		alfil = new Alfil(elegirColor(), elegirColumnaInicial());
		System.out.println("\nSe ha creado un nuevo alfil con el color y columna elegida\n " + alfil);
	}
	
	private static char elegirColumnaInicial() {
		char columna = 0;
		
		System.out.println("\nElige la columna inicial para el alfil ('c' o 'f': ");
		System.out.println("Escoge una opción: ");
		columna = Entrada.caracter();
		
		while (columna != 'c' && columna != 'f') {
			System.out.println("Columna incorrecta. Vuelve a intentarlo.");
			System.out.println("\nElige la columna inicial para el alfil ('c' o 'f': ");
			System.out.println("Escoge una opción: ");
			columna = Entrada.caracter();
		}
		return columna;
	}
	
	private static void mover() {
		try {
			Direccion direccion = elegirDireccion();
			System.out.println("Indica cuantos pasos quieres dar en esa dirección: ");
			int pasos = Entrada.entero();
			alfil.mover(direccion, pasos);
			System.out.println("El alfil se ha movido " + alfil);
			mostrarMenu();
		}catch (OperationNotSupportedException e) {
			System.out.println("ERROR: Movimiento no válido");
		}
	}
	
	private static void mostrarMenuDirecciones() {
		System.out.println("Los movimientos del alfil son los siguientes: ");
		System.out.println("1. ARRIBA_DERECHA");
		System.out.println("2. ABAJO_DERECHA");
		System.out.println("3. ABAJO_IZQUIERDA");
		System.out.println("4. ARRIBA_IZQUIERDA");
	}
	
	private static Direccion elegirDireccion() {
		Direccion movimiento = null;
		int mover;
		
		do {
			System.out.println("Escoge el movimiento de tu alfil: ");
			mover = Entrada.entero();
		} while (mover < 1 || mover > 4);
		
		if (mover==1) {
			movimiento = Direccion.ARRIBA_DERECHA;
		} else if (mover==2) {
			movimiento = Direccion.ABAJO_DERECHA;
		} else if (mover==3) {
			movimiento = Direccion.ABAJO_IZQUIERDA;
		} else {
			movimiento = Direccion.ARRIBA_IZQUIERDA;
		}
		return movimiento;
	}
}