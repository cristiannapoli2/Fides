package tipi_primitivi;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {

		/*
		Esercizio 1. Scrivere un programma SommaApprossimata che chiede all’utente di inserire due numeri
		con la virgola, li somma e poi stampa il risultato come numero intero.
		*/
		
		Scanner input = new Scanner(System.in);
		double n1,n2,somma;
		System.out.println("INSERISCI PRIMO NUMERO: ");
		n1 = input.nextDouble();
		System.out.println("INSERISCI SECONDO NUMERO: ");
		n2 = input.nextDouble();
		somma = n1 + n2;
		int sommaA =(int) (somma);
		System.out.println("SOMMA: " + sommaA);
		
	}

}
