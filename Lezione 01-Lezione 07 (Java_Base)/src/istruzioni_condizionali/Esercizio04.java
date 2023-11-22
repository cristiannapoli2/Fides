package istruzioni_condizionali;

import java.util.Scanner;

public class Esercizio04 {

	public static void main(String[] args) {

		/*Esercizio 4. Scrivere un programma Ordina3Valori che chiede all’utente di inserire tre numeri interi
		e stampa su un’unica riga in ordine crescente.
		*/
		
		Scanner input = new Scanner (System.in);
		int n1, n2, n3;
		
		System.out.println("INSERISCI NUMERO UNO: ");
		n1 = input.nextInt();
		System.out.println("INSERISCI NUMERO DUE: ");
		n2 = input.nextInt();
		System.out.println("INSERISCI NUMERO TRE: ");
		n3 = input.nextInt();
		
		if(n1>n2 && n1>n3) {
			if(n2>n3) {
				System.out.println(n1 + " " + n2 + " " + n3);
			}else {
				System.out.println(n1 + " " + n3 + " " + n2);
			}
		}else if(n2>n3 && n2>n1) {
			if(n3>n1) {
				System.out.println(n2 + " " + n3 + " " + n1);
			}else {
				System.out.println(n2 + " " + n1 + " " + n3);
			}
		}else if(n3>n2 && n3>n1) {
			if(n2>n3) {
				System.out.println(n3 + " " + n2 + " " + n1);
			}else {
				System.out.println(n3 + " " + n1 + " " + n2);
			}
		}
		
		
		
	}

}
