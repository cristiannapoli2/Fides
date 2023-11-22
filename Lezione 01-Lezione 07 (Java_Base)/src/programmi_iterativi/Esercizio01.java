package programmi_iterativi;

import java.util.Scanner;

public class Esercizio01 {

	public static void main(String[] args) {

		/*
		 * Esercizio 1. Scrivere il programma AlternaNumeri che chiede all’utente di
		 * inserire 10 numeri e li ristampa, stampando prima i numeri inseriti negli
		 * inserimenti dispari (il primo, il terzo, il quinto, il settimo e il nono) e
		 * poi i numeri inseriti negli inserimenti pari (il secondo, il quarto, il
		 * sesto, l’ottavo e il decimo).
		 */

		int[] numeri = new int[10];
		stampa(numeri);

	}

	public static void stampa(int[] numeri) {
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI 10 NUNERI INTERI: ");
		for (int x=0; x<numeri.length; x++) {
			numeri[x] = input.nextInt();
		}
		for(int p=0; p<numeri.length; p++) {
			if (p % 2 == 0) {
			System.out.println("NUMERI INDICE PARI: " + numeri[p]);
			}
		}
		for (int d=0; d<numeri.length; d++) {
			if (d % 2 != 0) {
				System.out.println("NUMERI INDICE DISPARI: " + numeri[d]);
			}
		}
		
		}
		
	}

	


