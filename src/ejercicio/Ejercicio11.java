package ejercicio;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		String frase; //Se guardará la frase
		String palabras[]; //Separación en partes de la frase
		String palabraLarga=" "; //Se guardará la palabra más larga
		
		//Abrimos Scanner
		Scanner read=new Scanner (System.in);
		
		//Solicitamos frase
		System.out.println("Introduzca una frase:");
		//Leemos frase
		frase=read.nextLine();
		
		//Separamos la frase en partes
		palabras= frase.split(" ");
		
		//Recorremos el array
		for (int i=0; i< palabras.length;i++) {
			//Si la longitud da la palabra es mayor a la que está guardada en palabraLarga
			if(palabras[i].length()>palabraLarga.length()){
				//La palabra se actualizará 
				palabraLarga= palabras[i];
			}
		}

		//Mostramos la palabra más larga y el número de caracteres que tiene
		System.out.println("La palabra más larga es: "+ palabraLarga);
		System.out.println("La palabra tiene " + palabraLarga.length() + " caracteres");
		
		//Cerramos el Scanner
		read.close();
	}

}
