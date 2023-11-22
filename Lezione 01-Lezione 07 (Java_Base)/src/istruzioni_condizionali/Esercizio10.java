package istruzioni_condizionali;

import java.util.Scanner;

public class Esercizio10 {

	public static void main(String[] args) {
		/*Esercizio 10. Scrivere un programma Giudizio che chiede all’utente di inserire un numero intero che
		rappresenta il voto ricevuto ad un esame universitario (in trentesimi, senza la lode) e si comporta come
		segue:
		• Se il numero `e minore di 0 o maggiore di 30 visualizza il messaggio "Numero errato"
		• Se il numero `e minore `e compreso tra 0 e 17 visualizza il messaggio "Esame non superato"
		• Se il numero `e minore `e compreso tra 18 e 24 visualizza il messaggio "Giudizio: sufficiente"
		• Se il numero `e minore `e compreso tra 25 e 30 visualizza il messaggio "Giudizio: buono"
		Successivamente, se il giudizio `e sufficiente oppure buono il programma chiede all’utente se voglia registrare il voto. L’utente pu`o rispondere inserendo 0 per non registrare, oppure con 1 per registrare. Nel
		primo caso il programma visualizza il messagio Voto rifiutato, nel secondo caso invece visualizza il
		messaggio Voto accettato.
		(Nota: utilizzare variabili booleane errato, nonSuperato, sufficiente e buono che avranno valori
		true o false a seconda che il voto ricada o meno nelle rispettive categorie elencate sopra, e usare
		tali variabili nelle guardie dei comandi if-else. Suggerimento: rivedere l’esempio Salute presentato a
		lezione.*/

		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UN NUMERO: ");
		int voto = input.nextInt();
		int numero;
		boolean errato = voto < 0 || voto > 30;
		boolean non_superato = voto >= 0 && voto <= 17; 
		boolean sufficiente = voto >= 18 && voto <= 24;
		boolean buono = voto >= 25 && voto <= 30;

		if (! errato) {
			if(non_superato) {
				System.err.println("ESAME NON SUPERATO!");
			}else if(sufficiente) {
				System.out.println("GIUDIZIO SUFFICIENTE!");
				System.out.println("VUOI REGISTRARE IL VOTO? 0=NO 1=SI ");
				numero=input.nextInt();
				if(numero != 0) {
					System.out.println("VOTO ACCETTATO!");
				}else {
					System.err.println("VOTO RIFIUTATO!");
				}
			}else if (buono) {
				System.out.println("GIUDIZIO BUONO!");
				System.out.println("VUOI REGISTRARE IL VOTO? 0=NO 1=SI ");
				numero=input.nextInt();
				if(numero != 0) {
					System.out.println("VOTO ACCETTATO!");
				}else {
					System.err.println("VOTO RIFIUTATO!");
				}
			}
		} else {
			System.err.println("NUMERO ERRATO");
		}
	}

}
