package blocchi_e_cicli;

import java.util.Scanner;

public class Esercizio01 {

	public static void main(String[] args) {

		/*
		 * Esercizio 1. Scrivere un programma IndovinaZero che chiede all’utente di
		 * inserire numeri interi uno dopo l’altro fino a quando non inserisce il numero
		 * 0.
		 */

		Scanner input = new Scanner(System.in);
		int n = 1;
		while (n >= 1) {
			System.out.print("INSERISCI UN NUMERO: ");
			n = input.nextInt();
		}
		System.err.println("HAI INSERITO 0");
	}
}
