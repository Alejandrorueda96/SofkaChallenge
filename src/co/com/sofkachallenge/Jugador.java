package co.com.sofkachallenge;

public class Jugador {

	//Variables
	private String nombre;
	private int premioAcumulado = 0;
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPremioAcumulado() {
		return premioAcumulado;
	}
	public void setPremioAcumulado(int premioAcumulado) {
		this.premioAcumulado = premioAcumulado;
	}
	
	
}
