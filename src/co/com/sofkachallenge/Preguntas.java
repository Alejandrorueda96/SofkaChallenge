package co.com.sofkachallenge;
import java.util.Random;

public class Preguntas {
	private int dificultad; //Variable para almacenar la dificultad 
	private int ronda = 1; //Variable para almacenar la ronda
	private int indice; //Variable para almacenar el indice aleatorio
	private String respuesta; //Variable para almacenar la respuesta ingresada por el usuario
	Random random = new Random(); //Clase para generar un numero aleatorio 
	
	//Matriz que contiene 25 preguntas, la dificultad aumenta al aumentar las filas 
	String[][] matrizPreguntas = {
			{"36+97", "94+35", "97+96", "87+72", "12+67"}, //Preguntas de nivel 1 (Suma)
			{"97-42", "65-53", "93-72", "64-32", "76-52"}, //Preguntas de nivel 2 (Resta)
			{"27*42", "73*65", "28*76", "67*58", "38*57"}, //Preguntas de nivel 3 (Multiplicacion)
			{"244/4", "4026/366", "354/2", "162/3", "2610/58"}, //Preguntas de nivel 4 (Division)
			{"(-5)*7 - 9*(-4) ", "(24-89+18) - (-91+24)", "440 - [30 + 6*(19 - 12)]", "5 + [6-2-(1-8)-3 + 6] - 5", "(2 * 4 + 12) * (6 - 4)"} //Preguntas de nivel 5 (operaciones combinadas)
	};
	//Matriz que contiene las posibles respuestas y la respuesta correcta en la ultima columna de cada fila
	int[][] matrizRespuestas = {
			{143, 123, 133, 137, 133}, //Respuestas de la primera pregunta de nivel 1
			{119, 129, 192, 144, 129}, //Respuestas de la segunda pregunta de nivel 1
			{133, 193, 319, 143, 193}, //Respuestas de la tercera pregunta de nivel 1
			{169, 199, 259, 159, 159}, //Respuestas de la cuarta pregunta de nivel 1
			{79, 39, 119, 59, 79},	//Respuestas de la quinta pregunta de nivel 1
			
			{35, 55, 53, 33, 55}, //Respuestas de la primera pregunta de nivel 2
			{22, 18, 32, 12, 12},
			{12, 21, 31, 43, 21},
			{19, 23, 32, 22, 32},
			{24, 43, 14, 9, 24},
			
			{1134, 1334, 2374, 1444, 1134}, //Respuestas de la primera pregunta de nivel 3
			{7445, 3745, 4755, 4745, 4745},
			{3128, 1138, 2128, 2821, 2128},
			{3686, 3896, 3886, 4876, 3886},
			{2166, 2176, 3167, 1616, 2166},
			
			{61, 65, 51, 31, 61}, //Respuestas de la primera pregunta de nivel 4
			{23, 15, 21, 11, 11},
			{12, 177, 157, 176, 177},
			{34, 45, 51, 54, 54},
			{45, 43, 54, 42, 45},
			
			{2, 35, 1, 71, 1}, //Respuestas de la primera pregunta de nivel 5
			{20, 12, 32, 23, 20 },
			{83, 378, 368, 36, 368},
			{19, 14, 13, 41, 14},
			{14, 43, 20, 40, 40}
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
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
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
	
	//Mostrar en la consola las posibles respuestas
	public void mostrarRespuestas() {
		String [] opciones = {"a. ","b. ","c. ","d. "};
		for(int i = 0;i < 4;i++) {
			System.out.println(opciones[i] + matrizRespuestas[indice + (getDificultad()*5)][i]);
		}
	}
	
	//Metodo para validar que la respuesta ingresada por el jugador es correcta o incorrecta, tambien permite terminar el concurso
	public String validarRespuesta() {
		String validacion = "";
		if(getRespuesta().equals("a")) {
			if(matrizRespuestas[indice + (getDificultad()*5)][0] == matrizRespuestas[indice + (getDificultad()*5)][4]) {
				validacion = "correcto";
			}
			else {
				validacion = "falso";
			}
		}
			
		else if(getRespuesta().equals("b")) {
			if(matrizRespuestas[indice + (getDificultad()*5)][1] == matrizRespuestas[indice + (getDificultad()*5)][4]) {
				validacion = "correcto";
			}
			else {
				validacion = "falso";
			}
		}
		
		else if(getRespuesta().equals("c")) {
			if(matrizRespuestas[indice + (getDificultad()*5)][2] == matrizRespuestas[indice + (getDificultad()*5)][4]) {
				validacion = "correcto";
			}
			else {
				validacion = "falso";
			}
		}
		
		else if(getRespuesta().equals("d")) {
			if(matrizRespuestas[indice + (getDificultad()*5)][3] == matrizRespuestas[indice + (getDificultad()*5)][4]) {
				validacion = "correcto";
			}
			else {
				validacion = "falso";
			}
		}
		
		else if(getRespuesta().equals("terminar")) {
			validacion = "terminar";
		}
	
		
		return validacion;
	}
}
