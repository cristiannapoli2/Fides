package array;

import java.util.Scanner;

public class Esercizio08 {

	public static void main(String[] args) {
		
	/*Esercizio 8. Scrivere un programma ParoleMisteriose che crea e inizializza un array di stringhe
	contenete 5 parole a piacere (usando il comando di inizializzazione che prevede la lista dei valori tra
	parentesi graffe) e chiede all’utente di indovinare una tra le 5 parole entro 3 tentativi.*/

	Scanner input = new Scanner(System.in);
	boolean find=false;
	String [] parole = {"Sole", "Cuore", "Amore", "Spiaggia", "Estate"};
		for(int i=0; i<3; i++) {
			System.out.println("INSERISCI UNA PAROLA: ");
			String parola = input.next();
			if(parola.equals(parole[i])) {
				System.out.println("PAROLA IDOVINATA");
				find=true;
				break;
			} 
		}
		if(!find) {
			System.err.println("TENTATIVI ESAURITI!");
		}
	
	
	
	
	}
}
