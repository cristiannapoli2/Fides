package string;

import java.util.Scanner;

public class Esercizio01 {

	public static void main(String[] args) {
	
		/*Esercizio 1. Scrivere un programma RadiceQuadrata che chiede all’utente di insere un numero intero
		e ne stampa la radice quadrata (numero frazionario).*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UN NUMERO: ");
		int n = input.nextInt();
		double radice = Math.sqrt(n);
		System.out.println("LA RADICE QUADRATA DI " + n + " E: " + radice);
		

	}

}
