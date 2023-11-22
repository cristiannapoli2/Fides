package recap_string;

import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) {
		/*Esercizio 2: Scrivere un programma SoloVocali che chiede all’utente di inserire una stringa e ne
		stampa le sole vocali. Per esempio, se si immette la stringa "Viva Java", il programma stampa "iaaa".*/
	
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UNA STRINGA: ");
		String s1 = input.nextLine();
		for(int i=s1.length()-1; i>=0; i--) {
			System.out.print(s1.replaceAll("[^aeiouAEIOU^]"," ").charAt(i));
			
		}
	
	
	
	}

}
