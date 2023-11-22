package recap_array;

public class Esercizio05 {

	public static void main(String[] args) {

		/*Esercizio 5: Scrivere un programma DoppioUnoDellaltro che he prevede un array di 10 numeri interi
		contenente valori a piacere (senza bisogno di chiederli all’utente) e stampa "Doppio uno dell’altro"
		se nell’array sono presenti due valori che sono l’uno il doppio dell’altro, oppure stampa "NO" altrimenti.
		(Il programma deve essere scritto facendo finta di non sapere quali siano i valori inseriti nell’array)*/
		
		int [] numeri = {3, 5, 7, 7, 333, 121, 81, 49, 25, 9};
		boolean flag=false;
		for(int i=0; i<numeri.length; i++) {
			for(int j=0; j<numeri.length; j++) {
				if(numeri[i]==numeri[j]*2) {
					flag=true;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("UNO IL DOPPIO DELL'ALTRO!");
		}else {
			System.out.println("NO!");
		}
		
		
		
		
		
	}

}
