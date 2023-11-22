package recap_metodi_ausiliari;

import java.util.Scanner;

public class Esercizio04 {

	public static void main(String[] args) {

		/*Esercizio 4: Scrivere un programma Concatena che chiede all’utente di inserire tre singole parole e
		le ristampa interponendovi un asterisco. Per esempio, se l’utente inserisce "gatto", "cane" e "topo" il
		programma stamper`a gatto*cane*topo. La concatenazione delle tre parole dovr`a essere fatta utilizzando
		un metodo ausiliario che prende due stringhe e restituisce la stringa ottenuta concatenando la prima
		parola ricevuta, un asterisco e la seconda parola ricevuta.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI 3 PAROLE: ");
		String s1 = input.next();
		String s2 = input.next();
		String s3 = input.next();
		
		concatena(s1, s2, s3);
		
		
	}
	
	public static void concatena(String s1, String s2, String s3) {
		
		System.out.println(s1 + "*" + s2 + "*" + s3);
		
	}
	

}
