package istruzioni_condizionali;

import java.util.Scanner;

public class Esercizio06 {

	public static void main(String[] args) {

		/*Esercizio 6.Scrivere un programma che, richiesti in input tre numeri interi, visualizzi a seconda dei casi una delle seguenti risposte:
			-Tutti uguali
			-Due uguali e uno diverso (indicando i numeri uguali)
			-Tutti diversi*/

		Scanner input = new Scanner(System.in);
		System.out.println("NUMERO 1: ");
		int n1 = input.nextInt();
		System.out.println("NUMERO 2: ");
		int n2 = input.nextInt();
		System.out.println("NUMERO 3: ");
		int n3 = input.nextInt();
		
		if(n1 == n2 && n2 == n3) {
			System.out.println("I NUMERI SONO TUTTI UGUALI!");
		}else if(n1 == n2 && n2 != n3) {
			System.out.println("DUE NUMERI SONO UGUALI E UN NUMERO E DIVERSO!");
		}else{
			System.out.println("I NUMERI SONO TUTTI DIVERSI!");
		}
	}

}
