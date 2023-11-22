package recap_condizioni_e_cicli;

import java.util.Scanner;

public class Esercizio01 {

	public static void main(String[] args) {

		/*Esercizio 1: Scrivere un programma TuttiPositiviPari che chiede all’utente di inserire 
		 * una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi, al termine 
		 * dell’inserimento dell’intera sequenza, stampa "Tutti positivi e pari" se i numeri inseriti 
		 * sono tutti positivi e pari, altrimenti stampa "NO". Risolvere questo esercizio senza usare array.*/

		Scanner input = new Scanner(System.in);
		int n;
		boolean p=true;
		System.out.println("QUANTI NUMERI VUOI INSERIRE");
		int ins = input.nextInt();
		for(int i=0; i<ins; i++) {
			System.out.println("INSERISCI UN NUMERO: ");
			n = input.nextInt();
			if(n%2!=0 || n<0) {
				p=false;
			}
			
		}
		
		if(p) {
			System.out.println("I NUMERI SONO TUTTI POSITIVI E PARI");
		}else
			System.err.println("NO!");
		
		
		
	}

}
