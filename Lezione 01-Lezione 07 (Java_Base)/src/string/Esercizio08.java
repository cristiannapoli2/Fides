package string;

import java.util.Scanner;

public class Esercizio08 {
	public static void main(String[] args) {
	/*Esercizio 8. Scrivere un programma Rimpiazza che legge una stringa e due caratteri, e poi stampa la
	stringa in cui tutte le occorrenze del primo carattere sono sostituite dal secondo. A tal fine `e conveniente
	usare un metodo della classe String non visto a lezione che si occupa della sostituzione dei caratteri
	nelle stringhe.*/

	
	Scanner input = new Scanner(System.in);
	System.out.println("INSERISCI UNA MESSAGGIO: ");
	String messaggio = input.nextLine();
	System.out.println(messaggio.replace('a', 'e'));
}
	
}

