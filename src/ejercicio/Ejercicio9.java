package ejercicio;

import java.util.Scanner;

public class Ejercicio9 {

	/**
	 * Método para intercambiar los caracteres
	 * @param conjunto1
	 * @param conjunto2
	 * @param c
	 * @return Devuelve el cacrater codificado
	 */
	static char codifica(char conjunto1[],char conjunto2[], char c) {
		char result=c;//Se guardará el carácter
		
		//Recorremos el conjunto1
		for (int i =0; i<conjunto1.length;i++) {
			//Si el contenido de la posición i es igual a result
			if (conjunto1[i]==result) {
				//Se cambiará por el de la misma posición del conjunto2
				result	=conjunto2[i];
				
				break;
			}
		}
		//Devolvemos el resultado
		return result;
	}

	public static void main(String[] args) {
		
		//Declaramos y damos valores a los arrays
		char [] conjunto1= {'e','i','k','m','p','q','r','s','t','u','v'};
		char [] conjunto2= {'p','v','i','u','m','t','e','r','k','q','s'};
		
		//Palabra a codificar
		String palabra;
		
		//Caracter codificado
		char codificado;
	
		//Creamos Scanner 
		Scanner read= new Scanner (System.in);
	
		//Solicitamos la palabra
		System.out.println("Introduzca una palabra para codificarla:");
		//Leemos la palabra
		palabra = read.next();
		//Convertimos la palabra a minúsculas
		palabra=palabra.toLowerCase();
	
		//Recorremos la palabra
		for (int i =0; i<palabra.length();i++) {
			//Se guardará el resultado de la función
			codificado=Ejercicio9.codifica (conjunto1,conjunto2,palabra.charAt(i));
			//Mostraremos caracter a caracter
			System.out.print(codificado);
		}
	
		//Cerramos el Scanner 
		read.close();
	}

}
