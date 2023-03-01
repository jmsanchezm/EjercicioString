package ejercicio;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String frase=""; //Se guardará la suma de cada palabra
		String palabra; //Se guardará la palabra 

		//Creamos Scanner
		Scanner read= new Scanner(System.in);
		
		//Pedimos palabra
		System.out.println("Introduzca una frase palabara a palabra:");
		//Leemos dato
		palabra=read.next();
		
		//Mientras que la palabra sea distinto de fin
		while(!palabra.equals("fin")) {
			//Se irá sumando a frase + un espacio
			frase+=palabra + " ";
			//Leemos de nuevo otra palabra
			palabra=read.next();
			
		}
		//Le mostrará la frase 
		System.out.println(frase);
		
		//Cerramos Scanner 
		read.close();
	}

}
