package blocchi_e_cicli;

import java.util.Scanner;

public class Esercizio05 {

	public static void main(String[] args) {
	
		/*Esercizio 5. Scrivere un programma MediaNumeri che chiede all’utente di inserire una sequenza di
		numeri interi positivi. Non appena l’utente inserisce un numero negativo il programma si arresta e
		visualizza la media aritmetica dei valori positivi inseriti (senza approssimazione!).*/

		Scanner input = new Scanner(System.in);
		int x;
		int conto=0;
		System.out.print("INSERISCI UN NUMERO POSITIVO: ");
		int n = input.nextInt();
		conto+=n;
		for(x=0; n>0; x++) {
			System.out.print("INSERISCI UN NUMERO POSITIVO: ");
			n = input.nextInt();
			if(n>0) {
				conto+=n;
			}
		}
		
		double media = (double)(conto/x);
		System.out.println(media);
	
		
		
		
	}

}
