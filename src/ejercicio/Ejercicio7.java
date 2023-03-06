package ejercicio;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Declaramos variables
		String frase; //Se guardará la frase
		String inv; //Se guardará la frase inversa
		
		int cont=0;
		
		//Creamos el Scanner
		Scanner read= new Scanner (System.in);
		
		//Pedimos dato
		System.out.println("Introduzca una frase:");
		//Leemos dato
		frase=read.nextLine();	
		frase=frase.replaceAll(" ", "");
		inv=frase;
		
		

		for (int i= inv.length();i>=0;i--) {
			if
		
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
