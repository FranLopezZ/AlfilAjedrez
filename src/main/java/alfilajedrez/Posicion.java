package alfilajedrez;

public class Posicion {
	private int fila;
	private char columna;
	
	
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	public int getFila() {
		return fila;
	}
	
	private void setFila(int fila) {
		if (fila < 1 || fila > 8) {
			throw new IllegalArgumentException("La fila es incorrecta. Las filas van desde la 1 a la 8.");
		} else {
			this.fila = fila;
		}
	}
	
	public char getColumna() {
		return columna;
	}
	
	private void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("La columna es incorrecta. Las columnas van desde la 'a' a la 'h'.");
		} else {
			this.columna = columna;
		}
	}
}



