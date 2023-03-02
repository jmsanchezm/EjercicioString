package ejercicio;

import java.util.Scanner;

public class Ejercicio9 {

	char codifica(char conjunto1[],char conjunto2[], char c) {
		char result=c;
		String conjunt1 = String.valueOf(conjunto1);
		String conjunt2 = String.valueOf(conjunto2);
		return result;
	}

	public static void main(String[] args) {
	char [] conjunto1= {'e','i','k','m','p','q','r','s','t','u','v'};
	char [] conjunto2= {'p','v','i','u','m','t','e','r','k','q','s'};
	String palabra;
	String codif="";
	Scanner read= new Scanner (System.in);
	
	System.out.println("Introduzca una palabra para codificarla:");
	palabra = read.next();
	palabra.toLowerCase();
	
	for (int i =0; i<palabra.length();i++) {
		for (int j = 0; j<conjunto1.length;j++) {
			if (palabra.charAt(i)==conjunto1[j]) {
				codif=palabra.replace(conjunto1[j], conjunto2[j]);
			}
		}
	}
	System.out.println(codif);
	read.close();
	}

}
