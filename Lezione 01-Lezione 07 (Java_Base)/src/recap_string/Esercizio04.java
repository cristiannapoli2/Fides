package recap_string;

import java.util.Scanner;

public class Esercizio04 {

	public static void main(String[] args) {

		/*Esercizio 4: Scrivere un programma Punteggiatura che chiede all’utente di inserire una sequenza
		di stringhe conclusa dalla stringa vuota e poi stampa il numero di caratteri di punteggiatura (.,;:!?)
		in esse contenuti. Per esempio, se si immettono le stringhe "Albero.", "foglia, radice, fiore",
		"tronco: cavo", "ramo!", "Frutto" (e poi "" per finire), il programma stampa 5
		 */
		
		
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		String parola="";
		int conta=0;
		do {
			System.out.println("INSERISCI UNA PAROLA: ");
			parola = input.nextLine();
			if(parola.equals("")) {
				flag=false;
				break;
			}
			for(int i=0; i<parola.length();i++) {
				if(parola.charAt(i)=='.') {
					conta++;
				}
				else if(parola.charAt(i)==',') {
					conta++;
				}
				else if(parola.charAt(i)==':') {
					conta++;
				}
				else if(parola.charAt(i)==';') {
					conta++;
				}
				else if(parola.charAt(i)=='!') {
					conta++;
				}
				else if(parola.charAt(i)=='?') {
					conta++;
				}
			}
		} while (flag);
		System.out.println(conta);
		
		
		
		
		
		
	}

}
