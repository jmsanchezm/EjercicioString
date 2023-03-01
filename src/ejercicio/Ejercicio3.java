package ejercicio;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaramos variables
		String frase; //Se guardará la frase
		int numEspacio=0; //Se guardará el número de espacios
		
		//Creamos el Scanner 
		Scanner read= new Scanner (System.in);
		
		//Pedimos una frase
		System.out.println("Introduzca una frase");
		//Leemos la frase
		frase=read.nextLine();
		
		//Recorremos la cadena
		for (int i =0; i<frase.length();i++) {
			//Si el caracter de la posición i es igual a un espacio
			if (frase.charAt(i)==' ') {
				//Se sumará al numero de espacios
				numEspacio++;
			}
		}
		
		//Le mostrará la cantidad de espacios que hay
		System.out.println("El número de espacios es de " + numEspacio);
		
		//Cerramos el Scanner
		read.close();
	}

}
