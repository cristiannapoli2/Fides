package string;

import java.util.Scanner;

public class Esercizio04 {

	public static void main(String[] args) {
		/*Esercizio 4. Scrivere un programma ParoleUguali che chiede all’utente di inserire due singole parole
		e stampa Sono uguali! se le due parole sono uguali, o Non sono uguali! altrimenti.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI DUE PAROLE: ");
		String parola1 = input.nextLine();
		String parola2 = input.nextLine();
		
		if(parola1.equals(parola2)) {
		System.out.println("LE PAROLE SONO UGUALI!");
		}else {
		System.out.println("LE PAROLE NON SONO UGUALI!");
	}
	}

}
