package blocchi_e_cicli;

import java.util.Scanner;

public class Esercizio04 {

	public static void main(String[] args) {

		/*Esercizio 4. Scrivere un programma ContaNumeriCrescenti che chiede all’utente di inserire una sequenza di numeri interi crescenti (man mano sempre più grandi) e ne stampa la lunghezza (il numero
		di valori inseriti dall’utente). Il programma termina non appena l’utente inserisce un valore minore o
		uguale al precedente).*/

		Scanner input = new Scanner(System.in);
		int conta=1;
		System.out.print("INSERISCI UN NUMERO: ");
		int n = input.nextInt();
			for(int y=0; y<n;) {
				y=n;
				System.out.print("INSERISCI UN NUMERO MAGGIORE: ");
				n = input.nextInt();
				conta++;
			}
			System.out.println("HAI INSERITO: " + conta + " NUMERI");
		
		
	}

}


