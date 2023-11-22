package recap_condizioni_e_cicli;

import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) {
		/*Esercizio 2: Scrivere un programma ContinuaFino che chiede all’utente di inserire una sequenza di
		interi. Il programma continua a chiedere all’utente di inserire valori fintanto che i valori inseriti soddisfano
		almeno una delle seguenti condizioni:
		• `e negativo e divisibile per 2
		• `e positivo e divisibile per 3
		Al termine il programma stampa la somma di tutti i valori inseriti escluso quello ha violato le condizioni.
		Risolvere questo esercizio senza usare array.*/
		
		Scanner input = new Scanner(System.in);
		int countP=0; 
		int countN=0;
		int n;
		 do {
			 System.out.print("INSERISCI UN NUMERO: ");
				n = input.nextInt();
				if(n>0) {
					countP++;
				}else if(n<0) {
					countN++;
				}	
		 }while(n!=0);
		 System.out.println("HAI INSERITO: " + countP + " NUMERI POSITIVI");
		 System.out.println("HAI INSERITO: " + countN + " NUMERI NEGATIVI");
			 
			
			
		
	}

}
