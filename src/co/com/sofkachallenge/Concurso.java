package co.com.sofkachallenge;
import java.util.Scanner;
public class Concurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jugadorInput = new Scanner(System.in); //Clase para obtener la entrada del usuario
		//Crear un nuevo jugador
		Jugador jugador = new Jugador();
		//El jugador puede ingresar su nombre por medio de la consola 
		System.out.print("Nombre:");
		jugador.setNombre(jugadorInput.nextLine()); 
		
		System.out.println(jugador.getNombre());
		
		
		
	}

}
