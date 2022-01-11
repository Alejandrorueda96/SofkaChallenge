package co.com.sofkachallenge;
import java.util.Scanner;
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
				System.out.print("Ingrese su respuesta:");
				preguntas.setRespuesta(jugadorInput.nextLine());				
				if (preguntas.validarRespuesta().equals("correcto")) {
					
					if(preguntas.getRonda()<=4) {
						System.out.println("Respuesta correcta, avanza a la siguiente ronda");
						jugador.setPremioAcumulado(jugador.getPremioAcumulado()+premios[preguntas.getDificultad()]);
						preguntas.setRonda(preguntas.getRonda() + 1);
						preguntas.setDificultad(preguntas.getDificultad() + 1);
						System.out.println("premio " + jugador.getPremioAcumulado());
					}
					else if(preguntas.getRonda() == 5) {
						jugador.setPremioAcumulado(jugador.getPremioAcumulado()+premios[preguntas.getDificultad()]);
						System.out.println("Felicitaciones " + jugador.getNombre() + " su premio es de "  + jugador.getPremioAcumulado());
						break;
					}
				}
				
				else if(preguntas.validarRespuesta().equals("falso")) {
					System.out.println("Respuesta incorrecta juego terminado");
					break;
				}

			}
				
	}
	
}
