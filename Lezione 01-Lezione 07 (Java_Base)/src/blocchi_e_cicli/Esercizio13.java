package blocchi_e_cicli;

import java.util.Scanner;

public class Esercizio13 {

	public static void main(String[] args) {
		/*Esercizio 16:Scrivere un programma che permette all utente di inserire i numeri fino a quando non inserisce 0 
		alla fine visualizzare il conteggio di positivi, negativi.*/
		
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
