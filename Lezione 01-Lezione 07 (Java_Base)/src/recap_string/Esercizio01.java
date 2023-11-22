package recap_string;

import java.util.Scanner;

public class Esercizio01 {

	public static void main(String[] args) {
		/*Esercizio 1: Scrivere un programma Contrario che chiede all’utente di inserire una stringa e la
		stampa al contrario. Per esempio, se si immette la stringa "Viva Java", il programma stampa "avaJ aviV"*/

		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UNA STRINGA: ");
		String s1 = input.nextLine();
		for(int i=s1.length()-1; i>=0; i--) {
			System.out.print(s1.charAt(i));
		}
		
		
		
		
	}

}
