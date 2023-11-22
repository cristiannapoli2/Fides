package recap_condizioni_e_cicli;

import java.util.Scanner;

public class Esercizio03 {

	public static void main(String[] args) {
		/*Esercizio 3: Scrivere un programma PositivoNegativo che chiede all’utente di inserire una sequenza
		di interi terminata quando l’utente immette il valore 0 e poi stampa "OK" se la sequenza contiene un
		valore positivo seguito da uno negativo, altrimenti stampa il messaggio "NO". A vostra scelta, la stampa
		del messaggio "OK" pu`o interrompere o meno l’inserimento dei valori. Risolvere questo esercizio senza
		usare array.*/
		
		
		Scanner input = new Scanner(System.in);
		int n;
		boolean condizione = true;
		
		while (condizione) {
			System.out.println("INSERISCI UN NUMERO: ");
			n = input.nextInt();
			if(n==0) {
				condizione=false;
			}else if(n>0) {
				System.out.println("INSERISCI UN NUMERO: ");
				n = input.nextInt();
				if(n>0) {
					condizione=false;
				}else {
					System.out.println("OK");
					condizione=false;
				}
			}
			
			
		}
		
		
		
		
		
	}

}
