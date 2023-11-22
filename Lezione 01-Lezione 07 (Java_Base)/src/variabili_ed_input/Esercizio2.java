package variabili_ed_input;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {

		
/*
 * Esercizio 2. Scrivere un programma SommaProdotto che chiede all’utente di inserire due valori interi e
ne calcola la somma e il prodotto.
 */
		
	Scanner input = new Scanner(System.in);
	System.out.println("Inserisci Primo Numero: ");
	int n1 =input.nextInt();
	System.out.println("Inserisci Secondo Numero: ");
	int n2 = input.nextInt();
	int somma = n1 + n2;
	int prodotto = n1 * n2;
	System.out.println("Somma: " + somma);
	System.out.println("Prodotto: " + prodotto);
	
	
		
	}

}
