package string;

import java.util.Scanner;

public class Esercizio06 {

	public static void main(String[] args) {
		/*Esercizio 6. Scrivere un programma SpezzaMeta che chiede all’utente di inserire una stringa e stampa
		tale stringa divisa a met`a su due righe (se la lunghezza della stringa `e dispari una delle due parti sar`a
		pi`u lunga dell’altra di un carattere)*/
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UNA PAROLA: ");
		String parola = input.nextLine();
		System.out.println(parola.substring(0, parola.length()/2) + "\n" + parola.substring(parola.length()/2, parola.length()));
		
		
		
	}

}
