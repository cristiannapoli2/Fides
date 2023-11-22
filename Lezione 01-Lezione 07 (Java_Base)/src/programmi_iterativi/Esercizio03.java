package programmi_iterativi;

import java.util.Scanner;

public class Esercizio03 {

	public static void main(String[] args) {
		
	
	/*Esercizio 3. Scrivere il programma CercaSomma che chiede all’utente di inserire 5 numeri e stampa il
	messaggio Ci sono due numeri con somma pari a 100 se ci sono, tra i numeri inseriti dall’utente, due
	numeri la cui somma `e pari a 100. In caso contrario il programma stampa il messaggio Non ci sono due
	numeri con somma pari a 100.*/
	
		verificaSomma();
		
	
	}
	
	public static void verificaSomma() {
		Scanner input = new Scanner(System.in);
		int x, n = 0;
		System.out.println("INSERISCI 5 NUNERI INTERI: ");
		for (x=0; x<5; x++) {
			n = input.nextInt();
		if(n+n==100) {
			System.out.println("CI SONO 2 NUMERI CHE SOMMATI FANNO 100");
		}else{
			System.err.println("NON CI SONO NUMERI CHE SOMMATI FANNO 100");
		}
		}
		
		
		
		
	}
	
	
}
