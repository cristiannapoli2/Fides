package istruzioni_condizionali;

import java.util.Scanner;

public class Esercizio09 {

	public static void main(String[] args) {

		/*
		 * Esercizio 9. Scrivere un programma Festivita che chiede all’utente di
		 * inserire una data espressa come due numeri interi: uno che rappresenta un
		 * giorno del mese (1-31) e uno che rappresenta un mese dell’anno (1-12). Il
		 * programma innanzitutto controlla che i numeri inseriti siano validi (compresi
		 * negli intervalli previsti) e poi verifica se la data inserita corrisponda a
		 * una delle seguenti festivit`a: • Capodanno (1/1) • Epifania (6/1) •
		 * Ferragosto (15/8) • Natale (25/12) Se la data inserita corrisponde a una
		 * festivit`a il programma deve visualizzare il nome della festivit`a.
		 * Altrimenti deve visualizzare il messaggio "Non e’ una festivita’"
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UN GIORNO E UN MESE");
		int giorno = input.nextInt();
		int mese = input.nextInt();
		if (giorno >= 1 && giorno <= 31 && mese >= 1 && mese <= 12) {
			if (mese == 2 || mese == 4 || mese == 6 || mese == 9 || mese == 11) {
				if (mese == 2 && giorno > 28) {
					System.err.println("DATA NON VALIDA!");
				} else if ((mese == 4 || mese == 6 || mese == 9 || mese == 11) && giorno > 30) {
					System.err.println("DATA NON VALIDA!");
				}
			}
			if (giorno == 1 && mese == 1) {
				System.out.println("BUON CAPODANNO!");
			} else if (giorno == 6 && mese == 1) {
				System.out.println("BUON EPIFANIA!");
			} else if (giorno == 15 && mese == 8) {
				System.out.println("BUON FERRAGOSTO!");
			} else if (giorno == 25 && mese == 12) {
				System.out.println("BUON NATALE!");
			} else {
				System.err.print("LA DATA NON E' UNA FESTIVITA'!");
			}
		} else {
			System.err.println("DATA NON VALIDA!");
		}
	}

}
