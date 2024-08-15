package futbol;

public abstract class Futbolista implements Comparable {
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public String toString() {
		return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
	}
	
	public boolean equals(Futbolista f) {
		if(this == f) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public abstract boolean jugarConLasManos();
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	public String getPosicion() {
		return posicion;
	}
}
