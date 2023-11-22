package variabili_ed_input;

import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {

		/*Esercizio 5. Scrivere un programma AreaCerchio che chiede all’utente di inserire la lunghezza del raggio
		di un cerchio e ne calcola l’area. ATTENZIONE: memorizzare il valore di pi-greco in una costante.*/
	
		Scanner input = new Scanner(System.in);
		final double p = 3.14;
		int raggio;
		double area;
		System.out.println("INSERISCI RAGGIO: ");
		raggio = input.nextInt();
		area = (raggio * raggio)*p;
		System.out.println("AREA: " + area);
	
	}

}
