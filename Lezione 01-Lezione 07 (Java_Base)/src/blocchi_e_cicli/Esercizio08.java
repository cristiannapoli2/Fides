package blocchi_e_cicli;

import java.util.Scanner;

public class Esercizio08 {

	public static void main(String[] args) {

		/*Esercizio 8.Scrivere un programma TabellineAritmetiche che chiede in ingresso all’utente 
		un numero intero da memorizzare nella variabile n e visualizza in uscita la tabellina aritmetica del numero stesso.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("SCEGLI UN NUMERO: ");
		int n = input.nextInt();
		for(int x=0; x<=10; x++) {
			System.out.println(n + " X " + x + " = " + n*x);
		}
		
	
		
	}

}
