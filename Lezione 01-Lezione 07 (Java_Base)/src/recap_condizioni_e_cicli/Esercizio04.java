package recap_condizioni_e_cicli;

import java.util.Scanner;

public class Esercizio04 {

	public static void main(String[] args) {
		
	/*Esercizio 4: Scrivere un programma MediaMultipliDiTre che chiede all’utente di inserire una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi stampa la media di tutti i numeri
	inseriti che siano divisibili per tre. Per esempio, se si immettono i valori 5, 8, 9, 12, 7, 6 ,1 il
	risultato stampato dovr`a essere 9. Risolvere questo esercizio senza usare array.*/
	
	
		Scanner input = new Scanner(System.in);
		int tot=0;
		int media=0;
		int count=0;
		System.out.println("QUANTI NUMERI VUOI INSERIRE");
		int ins= input.nextInt();
		for(int i=0; i<ins; i++) {
			System.out.println("INSERISCI UN NUMERO: ");
			int n = input.nextInt();
			if(n%3==0) {
				 tot+=n;
				 count++;
				}
		}
		
		
		
	

	}
	
}
