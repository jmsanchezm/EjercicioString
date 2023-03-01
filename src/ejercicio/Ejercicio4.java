package ejercicio;

import java.util.Scanner;

public class Ejercicio4 {
	
	/**
	 * Método que irá mostrando al revés la cadena
	 * @param cadena
	 */
	public static void inverso(String cadena) {
		//Recorremos la cadena al reves
		for (int i=cadena.length()-1;i>=0;i--) {
			//Mostramos caracter a caracter
			System.out.print(cadena.charAt(i));
		}
	}

	public static void main(String[] args) {
		
		//Declaramos la variable 
		String frase;
		
		//Creamos el Scanner 
		Scanner read= new Scanner (System.in);
		
		//Pedimos la frase
		System.out.println("Introduzca una frase");
		//Leemos la frase
		frase=read.nextLine();
		
		//Llamamos a la función inverso
		Ejercicio4.inverso(frase);
		
		//Cerramos Scanner
		read.close();
	}

}
