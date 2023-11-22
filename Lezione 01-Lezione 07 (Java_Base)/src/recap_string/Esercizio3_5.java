package recap_string;

import java.util.Scanner;

public class Esercizio3_5 {

	public static void main(String[] args) {
		/*Esercizio 3.5: Scrivere un programma SpaziVocali che chiede all’utente di inserire una stringa e
		stampa il numero complessivo di spazi che sono immediatamente seguiti da una vocale. Per esempio, se
		si immette "A ogni uomo, ogni giorno, I suoi diritti", il programma stampa 4*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UNA STRINGA: ");
		int conta=0;
		String s1 = input.nextLine();
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)==' ') {
				if(s1.charAt(i+1)=='a'||s1.charAt(i+1)=='A') {
					conta++;
				}
				else if(s1.charAt(i+1)=='e'|| s1.charAt(i+1)=='E') {
					conta++;
				}
				else if(s1.charAt(i+1)=='i'||s1.charAt(i+1)=='I') {
					conta++;
				}
				else if(s1.charAt(i+1)=='o'||s1.charAt(i+1)=='O') {
					conta++;
				}
				else if(s1.charAt(i+1)=='u'||s1.charAt(i+1)=='U') {
					conta++;
				}
			}
			
			
		}
		System.out.print(conta);
		
	}

}
