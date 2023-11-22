package istruzioni_condizionali;

import java.util.Scanner;

public class Esercizio01 {

	public static void main(String[] args) {

		/*Esercizio 1. Scrivere un programma Uguali che chiede all’utente di inserire due numeri interi e stampa
		il messaggio "sono uguali!" se i due numeri sono uguali e "non sono uguali!" se i due numeri non
		lo sono.
		*/
		
		Scanner input = new Scanner (System.in);
		int n1, n2;
		
		System.out.println("INSERISCI NUMERO UNO: ");
		n1 = input.nextInt();
		System.out.println("INSERISCI NUMERO DUE: ");
		n2 = input.nextInt();
		
		if(n1==n2) {
			System.out.println("I NUMERI SONO UGUALI!");
		} else {
			System.out.println("I NUMERI SONO DIVERSI!");
		}
		
		

		
	}

}
