package blocchi_e_cicli;

import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) {

		/*
		 * Esercizio 2. Scrivere un programma ScrivoScrivoScrivo che chiede all’utente
		 * di inserire un numero maggiore o uguale a zero e stampa il messaggio sto
		 * ciclando un numero di volte pari al numero inserito dall’utente. Se il valore
		 * inserito dall’utente `e negativo il programma stampa un messaggio di errore.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UN NUMERO MAGGIORE O UGUALE A 0");
		int n = input.nextInt();
		String m = "STO CICLANDO!";
		if (n >= 0) {
			for (int x = 0; x<n; x++) {
				System.out.println(m);
			}
		} else {
			System.err.println("ERRORE!");
		}
	}

}
