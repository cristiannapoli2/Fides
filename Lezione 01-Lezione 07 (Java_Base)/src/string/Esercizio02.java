package string;

import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) {
		/*Esercizio 2. Scrivere un programma Lunghezza che chiede all’utente di insere una stringa e ne stampa
		la lunghezza (numero di caratteri).*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UN MESSAGGIO: ");
		String messaggio = input.nextLine();
		int lunghezza = messaggio.length();
		System.out.println("LA LUNGHEZZA DI " + messaggio + " E': " + lunghezza);
	}

}
