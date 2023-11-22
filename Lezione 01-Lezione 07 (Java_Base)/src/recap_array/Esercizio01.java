package recap_array;

public class Esercizio01 {

	public static void main(String[] args) {

		/*Esercizio 1: Scrivere un programma StampaZigZag che prevede un array di 10 numeri interi contenente valori a piacere (senza bisogno di chiederli all’utente) e ne stampa gli elementi secondo il seguente
		ordine: il primo, l’ultimo, il secondo, il penultimo, il terzo, il terz’ultimo, ecc... Il nome dell’array pu`o
		essere scelto a piacere. (Il programma deve essere scritto facendo finta di non sapere quali siano i valori
		inseriti nell’array)*/
		
		
		int [] numeri = {3, 5, 7, 9, 11, 121, 81, 49, 25, 9};
			for(int i=0; i<numeri.length/2; i++) {
				System.out.print(numeri[i] + "\n" + numeri[numeri.length-1-i]+"\n");
		}
		
		
		
		
		
	}
	
}
