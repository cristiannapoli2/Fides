package metodi_ausiliari;

import java.util.Scanner;

public class Esercizio04 {

	public static void main(String[] args) {

		/*Esercizio 4. Scrivere il programma MinimoTraDieci che chiede all’utente di inserire 10 numeri interi,
		calcola il minimo tra essi e lo stampa come risultato. Il programma deve utilizzare un metodo ausiliario
		minimo(x,y) che restituisce il minimo tra x e y.*/
		
		int min = 0, b;
	
		Scanner input = new Scanner ( System . in );
		System.out.println("INSERISCI UN NUMERO: ");
		int a = input.nextInt();
		for(int n=0; n<9; n++ ) {
			System.out.println("INSERISCI UN NUMERO: ");
			b = input.nextInt();
			min=minimo(a,b);
		}
		System.out.println("IL MINIMO E': " + min);
		
		
		
	}
	
	public static int minimo(int x, int y) {
		
		if(x<y) {
			return x;
		}else {
			return y;
		}
	}

}
