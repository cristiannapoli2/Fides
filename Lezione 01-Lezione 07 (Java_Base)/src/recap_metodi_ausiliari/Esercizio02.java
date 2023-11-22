package recap_metodi_ausiliari;

import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) {
		/*Esercizio 2: Scrivere un programma "TuttiUguali" che chiede all’utente di inserire tre numeri e
		stampa "Tutti uguali!" se i tre numeri sono tutti uguali, e altrimenti stampa "Almeno uno e’ diverso".
		Il controllo che i tre numeri siano uguali dovr`a essere fatto da un metodo ausiliario, mentre il messaggio
		dovr`a essere stampato dal metodo main. Il nome del metodo ausiliario pu`o essere scelto a piacere.*/
	
	
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI 3 NUMERI: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		
		stampa(n1,n2,n3);
	
	
	
	
	}

	
	
	
	
	public static void stampa(int num1, int num2, int num3) {
	
		if(num1 == num2 && num2 == num3){
			System.out.println("SONO TUTTI UGUALI!");
		}else if(num1==num2 && num2!=num3) {
			System.out.println("ALMENO UNO E' DIVERSO!");
		}else if(num1!=num2 && num2==num3) {
		System.out.println("ALMENO UNO E' DIVERSO!");
		}else if(num1==num3 && num2!=num3) {
		System.out.println("ALMENO UNO E' DIVERSO!");
		}else {
			System.err.println("SONO TUTTI DIVERSI!");
		}
	}
}
