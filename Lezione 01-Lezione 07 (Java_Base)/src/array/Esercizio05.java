package array;

import java.util.Scanner;

public class Esercizio05 {

	public static void main(String[] args) {

		/*Esercizio 5. Scrivere il programma Cerca che crea e inizializza un array di int contenete 10 valori a
		piacere (usando il comando di inizializzazione che prevede la lista dei valori tra parentesi graffe), chiede
		all’utente di inserire un numero e stampa Presente se il numero `e presente nell’array, oppure Assente
		se il numero non `e presente. Provare a risolvere questo esercizio in due modi: tramite un for-each e
		tramite un while. Nel caso del while il ciclo deve interrompersi non appena l’elemento (se presente)
		viene trovato.*/
		
		
		int [] numeri = {56, 1, 59, 0, 36, 79, 3, 5, 256, 512};
		//modoUno(numeri);
		modoDue(numeri);
		
		
	}
	
	public static void modoUno(int [] numeri) {
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UN NUMERO: ");
		int n = input.nextInt();
		boolean controllo = false;
		for(int i: numeri) {
			if(n == i) {
				controllo=true;
				break;
			}
		}
		
		if(controllo) {
			System.out.println("IL NUMERO: " + n + " E' PRESENTE!");
		}else {
			System.out.println("IL NUMERO: " + n + " NON E' PRESENTE!");
		}
		
	}
	
	public static void modoDue(int [] numeri) {
		Scanner input = new Scanner(System.in);
		boolean unfound = true;
		int n;
		while(unfound) {
			System.out.println("INSERISCI UN NUMERO: ");
			n= input.nextInt();
			for(int i=0; i<numeri.length; i++) {
				if(n==numeri[i]) {
					unfound=false;
					break;
				}
			}
			if(!unfound) {
				System.out.println("IL NUMERO: " + n + " E' PRESENTE!");
			}else {
				System.out.println("IL NUMERO: " + n + " NON E' PRESENTE!");
			}
		}
		
		
	}
	

}
