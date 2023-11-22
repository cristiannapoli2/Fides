package array;

import java.util.Scanner;

public class Esercizio10 {

	public static void main(String[] args) {
		/*
		 * Esercizio 10. Scrivere un programma modulare Memo che, utilizzando un array,
		 * legge 10 stringhe e poi mette a disposizione un menu con le seguente opzioni: 
		 * [S] Stampa stringhe dalla posizione ... alla ... 
		 * [M] Modifica stringa in posizione ... 
		 * [T] Trova posizione della stringa ... 
		 * [E] Esci 
		 * Il menu viene proposto ripetutamente all’utente, fino a quando viene selezionata l’uscita
		 * dal programma (opzione E). Il significato delle operazioni `e il seguente: •
		 * se l’utente sceglie S, il programma legge due posizioni n e m e stampa tutti
		 * gli elementi dell’array il cui indice `e compreso tra n e m; • se l’utente
		 * sceglie M, il programma legge una posizione n e una stringa s che assegna
		 * alla cella n dell’array; • se l’utente sceglie T, il programma legga una
		 * stringa s e stampa la prima posizione dell’array che la contiene, o un
		 * messaggio di errore se nessuna cella la contiene; • se l’utente sceglie E, il
		 * programma stampa il contenuto dell’array e termina. Ognuna delle operazioni
		 * (tranne [E]) deve essere realizzata da un metodo diverso che realizza quanto
		 * indicato.
		 */

		Scanner input = new Scanner(System.in);
		String scelta;
		String[] memo = { "Cristian", "Sebastiano", "Salvatore", "Benedetto", "Emanuele", "Vincenzo", };
		boolean flag = true;

		while(flag) {
			menu();
			scelta = input.nextLine().toUpperCase();
			switch (scelta) {
			case "S": {
				stampa(memo);
				break;
			}
			case "M": {
				modifica(memo);
				break;
			}
			case "T":{
				trova(memo);
				break;
			}
			case "E":
				flag = false;
				break;
			}
		}
		
	
	
	
	
	} 


	public static void menu() {
		System.out.println("MENU: ");
		System.out.println("S) STAMPA ");
		System.out.println("M) MODIFICA");
		System.out.println("T) TROVA");
		System.out.println("E) ESCI");
	}

	public static void stampa(String[] memo) {
		Scanner input = new Scanner(System.in);
		System.out.println("STAMPARE DA INDICE: ");
		int n = input.nextInt();
		System.out.println("A INDICE: ");
		int m = input.nextInt();
		for (int i = n; i <= m; i++) {
			System.out.println(memo[i]);
		}
	}
	
	public static void modifica(String[] memo) {
	Scanner input = new Scanner(System.in);
	System.out.println("INDICE DA MODIFICARE: ");
	int n = input.nextInt();
	input.nextLine();				
	System.out.println("NUOVA STRINGA: ");
	String s = input.nextLine();
	memo[n] = s;
		for(String i: memo) {
		System.out.println(i);
		}
	}
	
	public static void trova(String[] memo) {
		int x, indice=0;
		Scanner input = new Scanner(System.in);
		System.out.println("TROVA STRINGA: ");
		String s1 = input.nextLine();
		boolean finded=false;
		for (x = 0; x < memo.length; x++) {
			if (memo[x].equalsIgnoreCase(s1)) {
				indice=x+1;
				finded = true;
			} 
		}
		if(finded) {
			System.out.println("LA STRINGA Eì NELLA POSIZIONE: " + (indice));
		}else {
			System.err.println("NESSUNA CORRISPONDENZA TROVATA!");
		}
	}
	
	
}
