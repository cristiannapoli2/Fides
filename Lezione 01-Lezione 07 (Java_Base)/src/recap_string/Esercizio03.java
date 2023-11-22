package recap_string;

import java.util.Scanner;

public class Esercizio03 {

	public static void main(String[] args) {
		/*Esercizio 3: Scrivere un programma Lunghezze che chiede all’utente di inserire una sequenza di
		stringhe e conclusa dalla stringa vuota, e poi stampa la somma delle lunghezze delle stringhe che iniziano
		con una lettera maiuscola. Per esempio, se si immettono le stringhe "Albero", "foglia", "Radici",
		"Ramo", "fiore" (e poi "" per finire), il programma stampa 16.*/
		
		
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		String parola="";
		int contaC=0;
		do {
			System.out.println("INSERISCI UNA PAROLA: ");
			parola = input.nextLine();
			if(parola.equals("")) {
				flag=false;
				break;
			}
			if(Character.isUpperCase(parola.charAt(0))) {
				contaC+=parola.length();
			}
		} while (flag);
		System.out.println(contaC);
		
		
	}

}
