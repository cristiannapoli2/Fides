package istruzioni_condizionali;

import java.util.Scanner;

public class Esercizio08 {

	public static void main(String[] args) {

		/*Esercizio 8. Scrivere un programma Calcolatrice che chiede all’utente di inserire due numeri interi
		x e y, poi chiede di inserire un numero compreso tra 1 e 4, che servir`a per determinare che operazione
		calcolare su x e y secondo la seguente mappatura
		• 1 ⇒ somma
		• 2 ⇒ sottrazione
		• 3 ⇒ moltiplicazione
		• 4 ⇒ divisione (intera)
		Il programma dovr`a visualizzare il risultato dell’operazione scelta su x e y. Nel caso della divisione
		dovranno essere visualizzati sia il quoziente che il resto. Se l’utente inserice un valore diverso da 1,...,4 il
		programma dovr`a visualizzare il messaggio "Operazione errata". (Nota: utilizzare il comando switch
		per scegliere tra le quattro operazioni).
		*/
		
		Scanner input = new Scanner(System.in);
		int risultato;
		
		System.out.println("INSERISCI 2 NUMERI: ");
		int x = input.nextInt();
		int y = input.nextInt();
		int scelta = input.nextInt();
		
		System.out.println("SCEGLI UN'OPERAZIONE: ");
		System.out.println("1)ADDIZIONE ");
		System.out.println("2)SOTTRAZIONE ");
		System.out.println("3)MOLTIPLICAZIONE ");
		if(scelta==1) {
			risultato = x+y;
			System.out.println("RISULTATO: " + risultato);
		}else if(scelta==2) {
			risultato = x-y;
			System.out.println("RISULTATO: " + risultato);
		}else if(scelta==3) {
			risultato = x*y;
			System.out.println("RISULTATO: " + risultato);
		}else if(scelta==4) {
			risultato = x/y;
			System.out.println("RISULTATO: " + risultato);
		}else {
			System.err.println("INSERIRE UN NUMERO COMPRESO TRA 1 E 4");
		}
		
		
		
		
	}

}
