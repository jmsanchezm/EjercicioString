package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		String palabra; //Se guardará la primera palabra
		char arrayPalabra1[];//Se guardarán los caracteres de la primera palabra
		String palabra2; //Se guardará la segunda palabra
		char arrayPalabra2 [];//Se guardarán los caracteres de la segunda palabra
		
		boolean igual = false; //Verificará que los caracteres son iguales 
		
		//Creamos el Scanner 
		Scanner read= new Scanner (System.in);
		
		//Pedimos las palabras
		System.out.println("Introduzca dos palabras para saber si son anagramas una de otra: ");
		
		//Leemos las palabras y las convertimos en minúsculas
		palabra=read.next().toLowerCase();
		palabra2= read.next().toLowerCase();
		
		//Si las longitudes de las palabras es la misma
		if (palabra.length()==palabra2.length()) {
			//Pasamos las palabras a arrays
			arrayPalabra1=palabra.toCharArray();
			arrayPalabra2 = palabra2.toCharArray();
		
			//Ordenamos los arrays
			Arrays.sort(arrayPalabra1);
			Arrays.sort(arrayPalabra2);
			
			//Recorremos uno de los dos arrays
			for (int i =0;i<arrayPalabra1.length;i++) {
				igual=true; //Inicializamos la variable a true
				//Si el contenido de la posición i es distinto en los dos arrays
				if (arrayPalabra1[i]!=arrayPalabra2[i]) {
					//Igual se tornará a false y saldrá del bucle
					igual=false;
					break;
				}
			}
			//Si igual es distinto , es decir false, mostrará que no son anagramas
			if (!igual) {
				System.out.println("Las palabras  NO son anagramas");
				
			//En caso contrario, mostrará que son anagramas
			}else {
				System.out.println("Las palabras son anagramas");
			}
		//En el caso de que la longitud de las palabras sea distinto, se mostrará un mensaje
		}else {
			System.out.println("La longitud de las palabras es distinta.");
		}
		
		//Cerramos el Scanner 
		read.close();
		
		

	}

}
