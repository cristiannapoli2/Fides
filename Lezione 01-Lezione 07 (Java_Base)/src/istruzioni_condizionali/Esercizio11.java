package istruzioni_condizionali;

import java.util.Scanner;

public class Esercizio11 {

	public static void main(String[] args) {
		/*
		 * Esercizio 11. Modificare il programma Giudizio dell’esecizio precedente
		 * usando il comando switch al posto delle variabili booleane e degli if-else
		 * per determinare la categoria in cui ricade il valore inserito dall’utente.
		 * (Suggerimento: serviranno 31 case e un default.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UN NUMERO: ");
		int voto = input.nextInt();
		int scelta = 0;
		int numero;
		switch (scelta) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			System.err.println("ESAME NON SUPERATO");
			break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
			System.out.println("GIUDIZIO SUFFICIENTE");
			System.out.println("VUOI REGISTRARE IL VOTO? 0=NO 1=SI ");
			numero = input.nextInt();
			if (numero != 0) {
				System.out.println("VOTO ACCETTATO!");
			} else {
				System.err.println("VOTO RIFIUTATO!");
			}
			break;
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		case 30:
			System.out.println("GIUDIZIO BUONO!");
			System.out.println("VUOI REGISTRARE IL VOTO? 0=NO 1=SI ");
			numero = input.nextInt();
			if (numero != 0) {
				System.out.println("VOTO ACCETTATO!");
			} else {
				System.err.println("VOTO RIFIUTATO!");
			}
			break;
		default:
			System.err.println("NUMERO ERRATO!");
		}

	}

}
