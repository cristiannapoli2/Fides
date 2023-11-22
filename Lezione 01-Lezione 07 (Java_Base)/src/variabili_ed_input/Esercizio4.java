package variabili_ed_input;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {

		/*
		Esercizio 4. Scrivere un programma SommaDiQuattro che chiede all’utente di inserire quattro valori
		interi, e ne stampa la somma. ATTENZIONE: il programma deve utilizzare in tutto solo 2 variabili*/

		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.println("INSERISCI NUMERO: ");
		n1 = input.nextInt();
		System.out.println("INSERISCI NUMERO: ");
		n2 = input.nextInt();	
		System.out.println("INSERISCI NUMERO: ");
		n1+= input.nextInt();
		System.out.println("INSERISCI NUMERO: ");
		n2 += input.nextInt();
		System.out.println("SOMMA: " + n1+n2);
		
	}

}
