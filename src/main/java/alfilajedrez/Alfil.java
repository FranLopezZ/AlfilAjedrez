package alfilajedrez;

public class Alfil {
	private Color color;
	private Posicion posicion;
	
	public Alfil() {
		this.color = Color.NEGRO;
		this.posicion = new Posicion(8, 'f');
	}
	
	public Alfil(Color color) {
		switch (color) {
		case BLANCO:
			this.posicion = new Posicion(1, 'f');
			break;
		case NEGRO:
			this.posicion = new Posicion(8, 'f');
			break;
		default:
			break;
		}
		this.color = color;
	}
	
	public Alfil(Color color, char columna) {
		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("La columna es incorrecta. Las columnas van desde la 'a' a la 'h'.");
		}
		if (columna == 'c') {
		} else {
			if (columna == 'f') {
			} else {
				throw new IllegalArgumentException("La columna del alfil es incorrecta. El alfil solo puede estar en las columnas 'c' o 'f'");
			}
		}
		switch (color) {
			case BLANCO:
				this.posicion = new Posicion(1, columna);
				break;
			case NEGRO:
				this.posicion = new Posicion(8, columna);
				break;
			default:
				break;
			}
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	private void setColor(Color color) {
		if (color == null) {
			throw new IllegalArgumentException("El color no puede ser nulo.");
		}
		this.color = color;
	}
	
	public Posicion getPosicion() {
		return posicion;
	}
	
	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new IllegalArgumentException("La posición no puede ser nula.");
		}
		this.posicion = new Posicion(posicion);
	}
}
