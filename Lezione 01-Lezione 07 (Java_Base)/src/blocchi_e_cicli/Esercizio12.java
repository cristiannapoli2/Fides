package blocchi_e_cicli;

import java.util.Scanner;

public class Esercizio12 {

	public static void main(String[] args) {
		/*Esercizio 15: Scrivere un programma Ripetizioni che chiede all’utente di inserire una sequenza di
		caratteri (chiedendo prima quanti caratteri voglia inserire) e li ristampa man mano che vengono inseriti.
		L’intero procedimento (chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli)
		dovrà essere ripetuto 5 volte. Risolvere questo esercizio senza usare array.*/

		
		Scanner input = new Scanner(System.in);
		int cicle = 0;
		int count;
			do {
				cicle++;
				System.out.println("QUANTI CARATTERI VUOI INSERIRE? ");
				count = input.nextInt();
				for (int i = 0; i < count; i++) {
					System.out.println("INSERISCI UN CARATTERE: ");
					String c = input.next();
					System.out.println(c);
				} 
			} while (cicle<5);
		
		
		}
	}


