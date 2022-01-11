package co.com.sofkachallenge;
import java.util.Random;

public class Preguntas {
	private int dificultad; //Variable para almacenar la dificultad 
	private int ronda; //Variable para almacenar la ronda
	private int pregunta; //Variable para almacenar la pregunta escojida aleatoriamente
	private int respuesta; //Variable para almacenar la respuesta ingresada por el usuario
	Random random = new Random(); //Clase para generar un numero aleatorio 
	
	//Matriz que contiene 25 preguntas, la dificultad aumenta al aumentar las filas 
	String[][] matrizPreguntas = {
			{"36+97", "94+35", "97+96", "87+72", "12+67"},
			{"97-42", "65-53", "93-72", "64-32", "76-52"},
			{"97-42", "65-53", "93-72", "64-32", "76-52"},
			{"97-42", "65-53", "93-72", "64-32", "76-52"},
			{"97-42", "65-53", "93-72", "64-32", "76-52"}
	};
	//Getters y Setters
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	public int getRonda() {
		return ronda;
	}
	public void setRonda(int ronda) {
		this.ronda = ronda;
	}
	public int getPregunta() {
		return pregunta;
	}
	public void setPregunta(int pregunta) {
		this.pregunta = pregunta;
	}
	public int getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}
	
	//Metodo para escojer un numero aleatoria entre 0 y 4
	public void numeroAleatorio() {
		this.pregunta = random.nextInt(5);
	}
}
