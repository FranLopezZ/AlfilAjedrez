package alfilajedrez;

import javax.naming.OperationNotSupportedException;

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
	
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (pasos <= 0) {
			throw new IllegalArgumentException("El número de pasos debe ser mayor que cero.");
		}
		if (direccion == null) {
			throw new IllegalArgumentException("La direccion no puede ser nula.");
		}
		switch (direccion) {
		case ARRIBA_DERECHA:
			try {
				posicion = new Posicion((posicion.getFila()+pasos),(char)(posicion.getColumna()+pasos));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no permitido: " + e.getMessage());
			}
			break;
		case ARRIBA_IZQUIERDA:
			try {
				posicion = new Posicion((posicion.getFila()+pasos),(char)(posicion.getColumna()-pasos));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no permitido: " + e.getMessage());
			}
			break;
		case ABAJO_DERECHA:
			try {
				posicion = new Posicion((posicion.getFila()-pasos),(char)(posicion.getColumna()+pasos));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no permitido: " + e.getMessage());
			}
			break;
		case ABAJO_IZQUIERDA:
			try {
				posicion = new Posicion((posicion.getFila()-pasos),(char)(posicion.getColumna()-pasos));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no permitido: " + e.getMessage());
			}
			break;
		default:
			break;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alfil other = (Alfil) obj;
		if (color != other.color)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}
	
}
