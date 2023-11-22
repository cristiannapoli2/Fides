package blocchi_e_cicli;

import java.util.Scanner;

public class Esercizio03 {

	public static void main(String[] args) {
		/*Esercizio 3. Scrivere un programma Conteggio che chiede all’utente di inserire un numero maggiore o
		uguale a zero e stampa uno dopo l’altro tutti i numeri da 0 al numero inserito compreso. Se il valore
		inserito dall’utente `e negativo il programma stampa un messaggio di errore.*/

		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UN NUMERO MAGGIORE O UGUALE A 0");
		int n = input.nextInt();
		
		if (n >= 0) {
			for (int x = 0; x<=n; x++) {
				System.out.println(x);
			}
		} else {
			System.err.println("ERRORE!");
		}
	}
		
	}

