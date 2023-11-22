package esercizio04;

public class IndexOutOfBound {

	public static void main(String[] args) {

		/*Esercizio 4.
		Scrivi un programma che istanziato un array di interi di 5 posizioni
		chieda all'utilizzatore di inserire un numero in una posizione specificata;
		gestire l'eventualità che vengano violati i limiti dell'array .*/

		try {
			int[] numeri = new int[5];
			numeri[6]=7;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("SUPERATO L'INDICE LIMITE");
		} 
		
	}

}
