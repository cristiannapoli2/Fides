package metodi_ausiliari;

public class Esercizio01 {

	public static void main(String[] args) {

		/*Esercizio 1. Scrivere un programma StampeInutili che consiste del main e di altri tre metodi con
		nomi a piacere. I tre metodi stampano ognuno un messaggio diverso dagli altri (a piacere). Il main
		invoca i tre metodi uno dopo l’altro con il risultato che i tre messaggi vengono visualizzati.*/

	
		stampaSaluto();
		System.out.println(stampaMex());
		stampa("MPRESSIOOON?");
		
	}

	
	
	public static void stampaSaluto() {
		System.out.println("CIAO SALVATORE");
	}
	
	public static String stampaMex() {
		String messaggio = "WEEE CHEEEE?";
		return messaggio;
	}
	
	public static void stampa(String mex) {
		System.out.println(mex);
	}
	
	
	

	
}
