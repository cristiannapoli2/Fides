package string;

import java.util.Scanner;

public class Esercizio05 {

	public static void main(String[] args) {
		/*Esercizio 5. Scrivere un programma Pappagallo che chiede continuamente all’utente di inserire una
		stringa e la ripete (stampandola) immediatamente. L’inserimento delle stringhe deve terminare quando
		l’utente inserisce la stringa vuota.*/
		
		Scanner input = new Scanner(System.in);
		String parola;
		do {
			System.out.println("INSERISCI UNA PAROLA: ");
			parola = input.nextLine();
			System.out.println(parola);
		} while (parola != "");
		
		
	}

}
