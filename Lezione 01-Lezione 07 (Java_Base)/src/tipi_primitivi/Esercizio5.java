package tipi_primitivi;

import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
		
		/*Esercizio 5. Scrivere un programma MinutiInOre che chiede all’utente di inserire un numero intero che
		rappresenta un tempo espresso in minuti (ad esempio 210) e stampa il corrispondente tempo espresso
		in ore e minuti (ad esempio 3 ore e 30 minuti). Il risultato stampato deve essere un numero intero
		(ossia, NON deve essere 3.0 ore e 30.0 minuti).
		*/
		
		Scanner input = new Scanner ( System . in );
		int minuti;
		System.out.println("INSERISCI MIUNUTI: ");
		minuti = input.nextInt();
		System.out.println(minuti/60 + " ORE E " + minuti%60 + " MINUTI");
		
		
		
		
	}

}
