package metodi_ausiliari;

import java.util.Scanner;

public class Esercizio03 {
	
	
	public static void main(String[] args) {
		/*Esercizio 3. Scrivere un programma Bisestile che chiede all’utente di inserire un numero intero che
		rappresenta un anno, e stampa Anno bisestile se l’anno inserito `e bisestile, Anno non bisestile se
		l’anno inserito non `e bisestile, oppure Errore se il numero inserito `e negativo.
		Un anno per essere bisestile deve:
		• essere divisibile per 4 e inoltre
		• qualora sia divisibile per 100, deve anche essere divisibile per 400
		Realizzare il programma usando il metodo ausiliario bisestile(anno) che restituisce true o false a
		seconda che anno sia bisestile o meno.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI UN ANNO: ");
		int anno = input.nextInt();
		boolean controllo = annoB(anno);
		if(controllo) {
			System.out.println("L'ANNO E BISESTILE!");
		}else {
			System.err.println("L'ANNO NON E' BISESTILE!");
		}
		
	}
	
	public static boolean annoB(int anno) {
	boolean bisestile = anno%4==0;
	
	return bisestile;
	}

	


		
		}
		
	
	
	

