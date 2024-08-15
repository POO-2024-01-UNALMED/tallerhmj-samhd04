package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		this(null, 0, null, (short) 289, (byte) 7);
	}
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " 
				+ getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
	}

	@Override
	public int compareTo(Object o) {
		return Math.abs(this.getEdad() - ((Futbolista) o).getEdad());
	}
	
	@Override
	public boolean jugarConLasManos() {
		return false;
	}
}
