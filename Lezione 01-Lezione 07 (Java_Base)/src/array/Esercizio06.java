package array;

import java.util.Scanner;

public class Esercizio06 {

	public static void main(String[] args) {
		/*Esercizio 6. Scrivere il programma UgualiConsecutivi che chiede all’utente di inserire 10 numeri,
		li memorizza in un array e stampa valori e posizioni di tutti gli elementi che sono immediatamente
		preceduti dallo stesso elemento (Ricordare che le posizioni iniziano da 0). Se non ci sono coppie di valori
		consecutivi uguali il programma non stampa nulla.*/
		
		Scanner input = new Scanner(System.in);
		int [] numeri = new int[10];
		int i=0;
		int count=0;
		
		
		for(i=0; i<10; i++) {
			System.out.println("INSERISCI UN NUMERO: ");
			numeri[i] = input.nextInt();
		}
		
		for(int n=1; n<10; n++) {
			if(numeri[i]==numeri[i-1]){
				count=n;
				System.out.println("IL NUMERO: " + numeri[i] + "IN POSIZIONE: " + count);
			}
		}
			
		
		
		
//		if(numeri[i]==numeri[i]) {
//		for(int x: numeri) {
//				System.out.println();
//		}
//		}
		
		
		}
	
		
		
		
	}


