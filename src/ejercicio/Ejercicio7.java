package ejercicio;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Declaramos variables
		String frase; //Se guardará la frase
		String inv=""; //Se guardará la frase inversa
		
		//Creamos el Scanner
		Scanner read= new Scanner (System.in);
		
		//Pedimos dato
		System.out.println("Introduzca una frase:");
		//Leemos dato
		frase=read.nextLine();	
		frase=frase.replaceAll(" ", "");

		//Recorremos al contrario la frase
		for (int i= frase.length()-1;i>=0;i--) {
			//Si el contenido de la posición i es distinto de un espacio
			if (frase.charAt(i) != ' ') {
				//Lo sumamos a inv
				inv+=frase.charAt(i);
			}
		}
		
		//Si la frase es igual a la inversa
		if (frase.equals(inv)) {
			//Se le mostrará como que es palíndroma
			System.out.println("La frase es palíndroma");
		//Por el contrario
		}else {
			//Se le mostrará que no es palíndroma
			System.out.println("La frase no es palíndroma");
		}
		//Cerramos Scanner
		read.close();
	}

}
