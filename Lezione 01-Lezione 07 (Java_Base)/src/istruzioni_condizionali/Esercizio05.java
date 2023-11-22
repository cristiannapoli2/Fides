package istruzioni_condizionali;

import java.util.Scanner;

public class Esercizio05 {

	public static void main(String[] args) {

		/*Esercizio 5. Scrivere un programma PariPiccolo che chiede all’utente di inserire un numero intero
		e visualizza il messaggio "Pari e Piccolo" se il numero `e pari ed `e compreso tra 0 e 100, altrimenti
		stampa il messaggio "Non e’ pari e piccolo". (Nota: questo programma si pu`o realizzare usando
		if-else annidati o espressioni booleane. Provate entrambe le versioni.)*/

		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI NUMERO: ");
		int n = input.nextInt();

		if(n%2==0) {
			if(n>=0 && n<=100) {
				System.out.println("IL NUMERO E' PARI E PICCOLO!");
			}else{
				System.out.println("IL NUMERO E' PARI E GRANDE!");
			}
		}else if(n%2!=0) {
			if(n>=0 && n<=100) {
				System.out.println("IL NUMERO E' DISPARI E PICCOLO!");
			}else{
				System.out.println("IL NUMERO E' DISPARI E GRANDE!");
			}
		}
	}

}


