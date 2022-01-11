package co.com.sofkachallenge;
import java.util.Scanner;
public class Concurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jugadorInput = new Scanner(System.in); //Clase para obtener la entrada del usuario
		//Crear un nuevo jugador
		Jugador jugador = new Jugador();
		Preguntas preguntas = new Preguntas();
		
		//Bienvenida del programa
		System.out.print("Bienvenid@ al concurso\n");
		//El jugador puede ingresar su nombre por medio de la consola 
		System.out.print("Por favor ingrese su nombre de jugador \nNombre:");
		jugador.setNombre(jugadorInput.nextLine()); 
		//Mensaje de inicio 
		System.out.println("Muy bien " + jugador.getNombre() + " el concurso comienza ahora");
		
			while(true) {
				System.out.println(preguntas.preguntaSeleccionada());
				preguntas.mostrarRespuestas();
				System.out.print("Ingrese su respuesta:");
				preguntas.setRespuesta(Integer.parseInt(jugadorInput.nextLine()));
				if (preguntas.validarRespuesta() == true) {
					System.out.println("Respuesta correcta, avanza a la siguiente ronda");
					preguntas.setRonda(preguntas.getRonda() + 1);
					preguntas.setDificultad(preguntas.getDificultad() + 1);
				}
				else {
					System.out.println("Respuesta incorrecta juego terminado");
					break;
				}

			}
		
	}

}
