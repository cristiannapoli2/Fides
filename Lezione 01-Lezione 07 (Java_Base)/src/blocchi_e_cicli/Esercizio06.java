package blocchi_e_cicli;

import java.util.Scanner;

public class Esercizio06 {

	public static void main(String[] args) {
		
		/*Esercizio 6. Scrivere un programma Asterischi che chiede all’utente di inserire un numero intero e
		stampa un triangolo fatto di asterischi con un numero di righe pari al valore inserito dall’utente. Se
		l’utente inserisce un valore negativo il programma deve visualizzare un messaggio di errore.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UN NUMERO ");
		int n = input.nextInt();
		
		if (n>=0) {
			for (int x = 0; x < n + 1; x++) {
				System.out.println("");
				for (int y = 0; y < x; y++) {
					System.out.print("*");
				}
			} 
		}else {
			System.err.println("ERRORE!");
		}
		
		
	}

}