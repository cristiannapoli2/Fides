package esercizio02;

public class Null_Length {

	public static void main(String[] args) {
		
		/*Esercizio 2.
		Gestire l'eccezione generata dal codice
		String s=null;
		int l = s.length();*/
		
		try {
			String s=null;
			int l = s.length();
		} catch (NullPointerException n) {
			System.err.println("ERRORE: " + n);
		}
		
	}

}
