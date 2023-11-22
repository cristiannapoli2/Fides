package istruzioni_condizionali;

import java.util.Scanner;

public class Esercizio03 {

	public static void main(String[] args) {
		
		/*Scrivere un programma Maggiore3Valori che chiede all’utente di inserire tre numeri interi
		e stampa il più grandi di questi
		*/
		
		Scanner input = new Scanner (System.in);
		int n1, n2, n3;
		
		System.out.println("INSERISCI NUMERO UNO: ");
		n1 = input.nextInt();
		System.out.println("INSERISCI NUMERO DUE: ");
		n2 = input.nextInt();
		System.out.println("INSERISCI NUMERO TRE: ");
		n3 = input.nextInt();
		
		if(n2<n1 && n3<n1) {
			System.out.println("IL MAGGIORE E': " + n1);
		}else if(n1<n2 && n3<n2) {
			System.out.println("IL MAGGIORE E': " + n2);
		}else{
			System.out.println("IL MAGGIORE E': " + n3);
		}
		

		
		
		
	}

}
