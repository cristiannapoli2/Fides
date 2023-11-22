package recap_array;

import java.util.Scanner;

public class Esercizio03 {

	public static void main(String[] args) {

		/*Esercizio 3: Scrivere un programma SecondoArray che chiede all’utente di inserire 10 numeri interi
		e li memorizza in un array. Successivamente, crea un nuovo array di dimensione pari al numero di valori
		maggiori o uguali a zero inseriti dall’utente. Copia tutti i valori maggiori o uguali a zero nel nuovo array
		e ne stampa i valori in ordine inverso.*/
		
		int [] numeri = new int [10];
		int count = 0;
		
		
		for(int i=0; i<numeri.length; i++) {
		System.out.println("INSERISCI 10 NUMERI: ");
		Scanner input = new Scanner (System.in);
		numeri[i] = input.nextInt();
		if(numeri[i]>=0) {
			count++;
		}
		}
		int indice = 0;
		int [] nums = new int [count];
		for(int x=0; x<numeri.length; x++) {
			if(numeri[x]>=0) {
			nums[indice] = numeri[x];
			indice++;
			}
		}
		
		for(int y=count-1; y>=0; y--) {
			System.out.println(nums[y]);
		}
		
		
		

		
		
		
		
	}

}
