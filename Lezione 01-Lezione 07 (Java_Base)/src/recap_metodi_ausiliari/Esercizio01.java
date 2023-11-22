package recap_metodi_ausiliari;

import java.util.Scanner;

public class Esercizio01 {

	public static void main(String[] args) {
		/*Esercizio 1: Scrivere un programma Ripeti che chiede all’utente di inserire una stringa e un numero
		intero positivo. Entrambe le cose dovranno essere passate a un metodo ausiliario che stamper`a tante
		copie della stringa quante indicate nel numero inserito dall’utente. Se il numero inserito dall’utente `e
		negativo il metodo ausiliario stamper`a "ERRORE: numero negativo". Il nome del metodo ausiliario pu`o
		essere scelto a piacere.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UNA STRINGA: ");
		String s = input.next();
		System.out.println("INSERISCI UN NUMERO: ");
		int n = input.nextInt();
		
		stampa(s, n);
		

	}
	
	public static void stampa(String message, int num) {
		for(int i=0; i<num; i++) {
			System.out.println(message);
		}
		if(num<0) {
			System.err.println("ERRORE!");
		}
	}
	
	

}
