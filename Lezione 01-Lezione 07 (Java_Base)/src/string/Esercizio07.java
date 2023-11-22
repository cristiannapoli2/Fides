package string;

import java.util.Scanner;

public class Esercizio07 {

	public static void main(String[] args) {
		/*Esercizio 7. Scrivere un programma DomandaRisposta che chiede all’utente di inserire una stringa,
		ricava l’ultimo carattere di tale stringa e
		• se tale carattere `e un punto interrogativo stampa: Non saprei...
		• se tale carattere `e un punto esclamativo stampa: Hai proprio ragione!
		• altrimenti stampa Mmmm, non mi convince...*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UNA MESSAGGIO: ");
		String messaggio = input.nextLine();
		if(messaggio.charAt(messaggio.length()-1)=='?'){
			System.out.println("NON SAPREI! ");
		}else if(messaggio.charAt(messaggio.length()-1)=='!') {
			System.out.println("HAI RAGIONE! ");
		}else {
			System.out.println("MMM NON MI CONVINCE!");
		}

	}

}
