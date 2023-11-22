package array;

import java.util.Scanner;

public class Esercizio04 {

	public static void main(String[] args) {

		/*Esercizio 4. Modificare l’esercizio precedente in modo che utilizzi 
		 * stringhe (singole parole) invece che
		   numeri e stampi valore e posizione della prima stringa secondo 
		   l’ordine lessicografico.
		 */
		
		Scanner input = new Scanner(System.in);
		String[] parole = new String [10]; 
		int count=0;
		int i;
		for(int x=0; x<parole.length; x++) {
			System.out.println("INSERISCI UNA PAROLA: ");
			parole[x] = input.nextLine();
		}
		String min = parole[0];
		for(i=0; i<parole.length; i++) {
			if(min.compareTo(parole[i])>0) {
				count=i;
				min = parole[i];
			}
		}
		System.out.println("LA PAROLA: " + min + " E LA MINORE LESSICOGRAFICAMENTE, INOLTRE " + count + " E' IL SUO INDICE!");
		
		

		
		
		
		
	}

}
