package string;

import java.util.Scanner;

public class Esercizio03 {

	public static void main(String[] args) {

		/*Esercizio 3. Scrivere un programma TestaCroce che genera un numero casuale 0 oppure 1 e stampa
		Testa se ha generato 0, o Croce se ha generato 1. (Suggerimento: per generare 0 o 1 si pu`o arrotondare
		(usando l’apposito metodo di Math) il numero ottenuto da Math.random().*/
		
		
		double n = Math.random();
		int num = (int) Math.round(n);
		if(num == 0) {
			System.out.println("TESTA!");
		}else{
			System.out.println("CROCE!");
		}
		
	}

}
