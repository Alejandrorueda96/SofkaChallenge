package co.com.sofkachallenge;
import java.util.Random;

public class Preguntas {
	private int dificultad; //Variable para almacenar la dificultad 
	private int ronda = 1; //Variable para almacenar la ronda
	private int indice; //Variable para almacenar el indice aleatorio
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
	//Matriz que contiene las posibles respuestas y la respuesta correcta en la ultima columna de cada fila
	int[][] matrizRespuestas = {
			{143, 123, 133, 137, 133},
			{119, 129, 192, 144, 129},
			{133, 193, 319, 143, 193},
			{169, 199, 259, 159, 159},
			{79, 39, 119, 59, 79},
			
			{35, 55, 53, 33, 55},
			{22, 18, 32, 12, 12},
			{12, 21, 31, 43, 21},
			{19, 23, 32, 22, 32},
			{24, 43, 14, 9, 24},
			
			{35, 55, 53, 33, 55},
			{22, 18, 32, 12, 12},
			{12, 21, 31, 43, 21},
			{19, 23, 32, 22, 32},
			{24, 43, 14, 9, 24},
			
			{35, 55, 53, 33, 55},
			{22, 18, 32, 12, 12},
			{12, 21, 31, 43, 21},
			{19, 23, 32, 22, 32},
			{24, 43, 14, 9, 24},
			
			{35, 55, 53, 33, 55},
			{22, 18, 32, 12, 12},
			{12, 21, 31, 43, 21},
			{19, 23, 32, 22, 32},
			{24, 43, 14, 9, 24}
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
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	public int getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}
	
	//Metodo para escojer un numero aleatoria entre 0 y 4 y almacenarlo en indice
	public void numeroAleatorio() {
		this.indice = random.nextInt(5);
	}
	
	//Metodo que retorna una pregunta seleccionada aleatoriamente por el programa
	public String preguntaSeleccionada() {
		numeroAleatorio();
		String enunciado = "Pregunta de nivel "  + Integer.toString(getRonda()) + "\nCual es el resultado de la siguiente operacion " + matrizPreguntas[getDificultad()][getIndice()];
		return enunciado;
	}
	
	public void mostrarRespuestas() {
		for(int i = 0;i < 4;i++) {
			System.out.println(matrizRespuestas[indice + (getDificultad()*5)][i]);
		}
	}
	
	public boolean validarRespuesta() {
		if(getRespuesta() == matrizRespuestas[indice + (getDificultad()*5)][4]) {
			return true;
		}
		else {
			return false;
		}
	}
}
