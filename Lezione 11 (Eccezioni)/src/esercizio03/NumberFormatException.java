package esercizio03;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args) {

		
		/*Esercizio 3.
		Scrivi un programma che inserito un numero intero da tastiera 
		stampi a video il risultato della divisione di tale numero per un altro numero generato casualmente,
		compreso fra 0 e 3, intercettando l'eventuale eccezione della divisione per 0.*/
	
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		
		
		try {
			System.out.println("INSERISCI UN NUMERO INTERO: ");
			int n=input.nextInt();
			int nc = r.nextInt(3);
			int risultato = n/nc;
			System.out.println("RISULTATO: " + risultato);
		} catch (ArithmeticException a) {
			System.err.println("IMPOSSIBILE DIVIDERE PER 0! ");
		} catch (InputMismatchException i){
			System.err.println("INSERISCI UN FORMATO VALIDO! ");
		}
	
	
	}

}
