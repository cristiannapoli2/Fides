package istruzioni_condizionali;

import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) {

		
		/*Esercizio 2. Modificare il programma Uguali dell’esecizio 1 in modo che usi un unico comando if privo
		del ramo else (suggerimento: notate che i due messaggi da stampare hanno una parte in comune che
		viene stampata comunque...)
		*/
		
		Scanner input = new Scanner (System.in);
		int n1, n2;
		
		System.out.println("INSERISCI NUMERO UNO: ");
		n1 = input.nextInt();
		System.out.println("INSERISCI NUMERO DUE: ");
		n2 = input.nextInt();
		
		System.out.print("I NUMERI ");
		if(n1!=n2) {
			System.out.print("NON ");
		}
		System.out.println("SONO UGUALI!");
		
		

	}

}
