package array;

import java.util.Scanner;

public class Esercizio02 {
	public static void main(String[] args) {
	/*Esercizio 2. Modificare l’esercizio precedente aggiungendo la richiesta 
	 *all’utente di quanti numeri inserire.*/
	
	 
	Scanner input = new Scanner(System.in);
	System.out.println("QUANTI NUMERI VUOI INSERIRE?: ");
	int ins = input.nextInt();
	int [] numeri = new int [ins];
	
	for(int i=0 ; i<ins; i++) {
		System.out.println("INSERISCI UN NUMERO: ");
		int n = input.nextInt();
	}
	for(int x= numeri.length; x>0; x--) {
		System.out.println(x);
	}
	
	
	
	
		
		
	}

}