package ejercicio;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Declaramos variables
		String frase; //Se guardará la frase 
		String palabra; //Se guadrará la palabra 
		int cont=0; //Irá contando el número de palabra
		int posicion=0; //Irá partiendo de la posición
		
		//Creamos el Scanner
		Scanner read= new Scanner (System.in);
		
		//Pedimos la frase
		System.out.println("Introduzca una frase");
		//Leemos la frase
		frase=read.nextLine();
		
		//Pedimos la palabra
		System.out.println("Introduzca una palabra:");
		//Leemos la palabra
		palabra= read.next();
		
		//
		posicion =frase.indexOf(palabra);
		//Mientras que la posición sea distinta de -1
		while (posicion!=-1) {
			cont++;
			posicion =frase.indexOf(palabra, posicion+palabra.length());
		}
		//Le mostrará en pantalla el número de veces que aparece la palabra
		System.out.println("La palabra aparece " + cont + " veces");
		
		//Cerramos Scanner
		read.close();
	}

}
