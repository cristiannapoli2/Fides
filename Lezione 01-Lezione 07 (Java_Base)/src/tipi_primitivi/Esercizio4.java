package tipi_primitivi;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {

		/*Esercizio 4. Scrivere un programma OreInMinuti che chiede all’utente di inserire un numero frazionario
		che rappresenta un tempo espresso in ore (ad esempio 3.5 per 3 ore e mezzo) e stampa il corrispondente
		tempo espresso in minuti (ad esempio 210). Il risultato stampato deve essere un numero intero (ossia,
		NON deve essere 210.0)
		*/
		
		Scanner input = new Scanner ( System . in );
	
		double ore;
		System.out.println("INSERISCI ORE: ");
		ore = input.nextDouble();
		int minuti = (int) (ore * 60);
		System.out.println("MINUTI: " + minuti);
		
		
	}

}
