package esercizio01;

public class Null {

	public static void main(String[] args) {

		/*Esercizio 1.
		Gestire l'eccezione generata dal codice
		int[] T = null;
		T[0] = 7;*/
		
		
		try {
			int[] T = null;
			T[0] = 7;
		} catch (NullPointerException e) {
			System.err.println("ERRORE: " + e);
		}
		
		
	}

}
