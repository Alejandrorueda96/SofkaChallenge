package co.com.sofkachallenge;
import java.util.Scanner;
/**
 * Programa desarrollado para modelar un concurso de preguntas y respuestas de matematicas para Sofka
 * El concurso cuenta con 25 preguntas (5 para cada nivel de dificultad (0 a 4) 
 * Las dificultades consisten en 0 -> sumas , 1 -> restas, 2 -> multiplicaciones, 3 -> divisiones y 4 -> operaciones combinadas
 * El concurso termina cuando el jugador completa las 5 rondas obteniendo los puntos maximos de 1500
 * Si el jugador responde erroneamente, el juego termina y no obtiene puntos
 * El jugador puede terminar el juego escribiendo "terminar" en la consola, obteniendo los puntos acumulados hasta el momento.
 * @author Alejandro Rueda
 *
 */

public class Concurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jugadorInput = new Scanner(System.in); //Clase para obtener la entrada del usuario
		int[] premios = {100, 200, 300, 400, 500}; // Premios para cada ronda del concurso
		//Crear un nuevo jugador
		Jugador jugador = new Jugador();
		Preguntas preguntas = new Preguntas();
		
		//Bienvenida del programa
		System.out.print("Bienvenid@ al concurso de matemáticas\n");
		//El jugador debe ingresar su nombre por medio de la consola 
		System.out.print("Por favor ingrese su nombre de jugador \nNombre:");
		jugador.setNombre(jugadorInput.nextLine()); 
		//Mensaje de inicio 
		System.out.println("Muy bien " + jugador.getNombre() + " el concurso comienza ahora");
		
			while(true) {
				
				System.out.println(preguntas.preguntaSeleccionada());
				preguntas.mostrarRespuestas();
				System.out.print("Ingrese su respuesta a, b, c o d:");
				preguntas.setRespuesta(jugadorInput.nextLine());
				
				//Si el jugador responde correctamente, continua en la siguiente ronda con preguntas de mayor dificultad
				if (preguntas.validarRespuesta().equals("correcto")) {
					
					if(preguntas.getRonda()<=4) {
						System.out.println("Respuesta correcta, avanza a la siguiente ronda\n");
						jugador.setPremioAcumulado(jugador.getPremioAcumulado()+premios[preguntas.getDificultad()]);
						preguntas.setRonda(preguntas.getRonda() + 1);
						preguntas.setDificultad(preguntas.getDificultad() + 1);
						
					}
					//Responder correctamente todas las preguntas otorga la victoria del jugador, y obtiene el maximo premio acumulado de 1500
					else if(preguntas.getRonda() == 5) {
						jugador.setPremioAcumulado(jugador.getPremioAcumulado()+premios[preguntas.getDificultad()]);
						System.out.println("Felicitaciones" + jugador.getNombre() + " completó todas las rondas, su premio acumulado es de "  + jugador.getPremioAcumulado() + " puntos");
						break;
					}
				}
				
				//Si el jugador responde erroneamente alguna pregunta, el juego termina y no puede reclamar el premio acumulado 
				else if(preguntas.validarRespuesta().equals("falso")) {
					System.out.println("Respuesta incorrecta! juego terminado");
					jugador.setPremioAcumulado(0);
					break;
				}
				
				//El jugador puede terminar el concurso sin contestar todas las preguntas y sin perder el premio acumulado escribiendo "terminar" en la consola
				else if(preguntas.validarRespuesta().equals("terminar")) {
					System.out.println("Decidió terminar el juego antes de completar todas las rondas, su premio acumulado hasta el momento es de " + jugador.getPremioAcumulado() + " puntos." );
					break;
				}

			}
				
	}
	
}
