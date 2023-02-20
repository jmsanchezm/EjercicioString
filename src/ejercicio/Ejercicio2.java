package ejercicio;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String contraseña;
		String adivina;
		int longi;
		Scanner read= new Scanner (System.in);
		System.out.println("Jugador 1. Introduzca una contraseña");
		contraseña = read.next();
		
		do {
			System.out.println("Jugador 2. Introduzca la contraseña del jugador 2");
			adivina=read.next();
			longi=contraseña.compareTo(adivina);
			if(longi>0) {
				System.out.println("La palabra es mayor alfabéticamente");
			}else if (longi<0){
				System.out.println("La palabara es menor alfabéticamente");
			}else {
				break;
			}
		}while(!contraseña.equals(adivina));

		System.out.println("¡¡Has adivinado la contraseña!!");
		
		read.close();
	}

}
