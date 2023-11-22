package programmi_iterativi;

import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) {
		
		/*Esercizio 2. Scrivere il programma TantiPariQuantiDispari che chiede all’utente di inserire 10 numeri
		e stampa il messaggio Tanti pari quanti dispari" se i numeri pari inseriti sono tanti quanti i numeri
		dispari. In caso contrario il programma stampa I numeri pari sono in numero supriore oppure
		In numeri dispari sono in numero superiore se l’utente ha inserito pi`u numeri pari o pi`u numeri
		dispari, rispettivamente.*/
		
		
		Scanner input = new Scanner(System.in);
		int[] numeri = new int[10];
		
		
		
		
	}
	
	public void tantiPariQuantiDispari(int[] numeri) {
		Scanner input = new Scanner(System.in);
		int p = 0, d=0;
		System.out.println("INSERISCI 10 NUNERI INTERI: ");
		for (int x=0; x<numeri.length; x++) {
			numeri[x] = input.nextInt();
			if(numeri[x]%2==0) {
				p++;
			}
			if(numeri[x]%2!=0) {
				d++;
			}
		}
		if (p==d) {
			System.out.println("CI SONO TANTI PARI QUANTI DISPARI!");
		}else if(p>d) {
			System.out.println("I NUMERI PARI INSERITI SONO IN QUANTITA MAGGIORE!");
		}else {
			System.out.println("I NUMERI DISPARI INSERITI SONO IN QUANTITA MAGGIORE!");
		}
	}
	
}
