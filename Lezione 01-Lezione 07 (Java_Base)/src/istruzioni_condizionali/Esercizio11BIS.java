package istruzioni_condizionali;

import java.util.Scanner;

public class Esercizio11BIS {

	public static void main(String[] args) {
		/*
		 * Esercizio 11bis.Scrivere un programma che richieda l’inserimento da tastiera
		 * di tre numeri interi g, m, a. Successivamente il programma deve indicare se i
		 * tre numeri formano una data valida nel formato “g/m/a”. Esempio: inserendo
		 * rispettivamente i valori 3, 5, 2017 oppure 30, 4, 2003, il messaggio da
		 * riportare è “DATA VALIDA” in quanto esistono i giorni 3/5/2017 e 30/4/2003.
		 * Viceversa, inserendo per esempio i valori 33, 7, 2015, oppure 27, 14, 2011,
		 * il messaggio da visualizzare è “DATA NON VALIDA” perché i giorni 33/7/2015 e
		 * 27/14/2011 non esistono. Nota: si ricorda che il dato a può riferirsi ad anni
		 * bisestili.
		 */

		Scanner input = new Scanner(System.in);
		String err = "DATA NON VALIDA!";
		System.out.println("INSERISCI GIORNO, MESE E ANNO: ");
		int g = input.nextInt();
		int m = input.nextInt();
		int a = input.nextInt();

		if (g >= 1 && g <= 31 && m >= 1 && m <= 12 && a >= 0) {
			if ((m == 2 || m == 4 || m == 6 || m == 9 || m == 11) && g >= 30) {
				System.err.println(g + "/" + m + "/" + a + err);
			} else if (m == 2 && g == 29 && a % 4 != 0) {
				System.err.println(g + "/" + m + "/" + a + err);
			} else {
				System.out.println(g + "/" + m + "/" + a + " DATA VALIDA!");
			}
		} else {
			System.err.println(g + "/" + m + "/" + a + err);
		}

	}

}
