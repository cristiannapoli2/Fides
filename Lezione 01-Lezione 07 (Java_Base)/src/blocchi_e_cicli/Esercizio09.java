package blocchi_e_cicli;

import java.util.Scanner;

public class Esercizio09 {

	public static void main(String[] args) {

		/*Esercizio 9.Scrivere un programma JAVA Potenze che chiede in ingresso all’utente un numero intero 
		da memorizzare nella variabile n e visualizza in uscita le prime dieci potenze che hanno per base il numero stesso.*/ 
		
		Scanner input = new Scanner(System.in);
		int pow = 1;
		System.out.println("SCEGLI UN NUMERO: ");
		int n = input.nextInt();
		for(int x=0; x<=10; x++) {
			System.out.println("LA POTENZA: " + x + " DI " + n + " E': " + pow);
			pow *= n;
		}
		
	}

}
