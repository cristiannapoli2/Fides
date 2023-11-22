package recap_array;

import java.util.Scanner;

public class Esercizio06 {

	public static void main(String[] args) {
		/*Esercizio 6: Scrivere un programma DueSequenze che chiede all’utente di inserire due sequenze di
		stringhe, ciascuna di 5 elementi, e poi stampa il messaggio "OK" se almeno una stringa della prima
		sequenza compare anche nella seconda, altrimenti stampa il messaggio "NO". Nel caso in cui le due
		sequenza abbiano almeno una stringa in comune, i confronti tra le sequenze si devono interrompere non
		appena una coppia di stringhe uguali viene trovata.*/
		
		Scanner input = new Scanner(System.in);
		String [] s1= new String [5];
		String [] s2= new String [5];
		boolean flag=false;
		
		System.out.println("INSERISCI 5 STRINGHE: ");
		for(int x=0; x<s1.length; x++) {
			s1[x] = input.nextLine();
		}
		System.out.println("INSERISCI 5 STRINGHE: ");
		for(int y=0; y<s2.length; y++) {
			s2[y] = input.nextLine();
		}

		for(String i: s1) {
			for(String j: s2) {
				if(i.equals(j)) {
				flag=true;
				break;
				}
			}
		}

		if(flag) {
			System.out.println("OK");
		}else {
			System.err.println("NO");
		}
	}

}
