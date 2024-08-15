package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " 
				+ getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " 
				+ golesRecibidos;
	}
	
	@Override
	public int compareTo(Object o) {
		return Math.abs(this.golesRecibidos - ((Portero) o).golesRecibidos);
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	
}
