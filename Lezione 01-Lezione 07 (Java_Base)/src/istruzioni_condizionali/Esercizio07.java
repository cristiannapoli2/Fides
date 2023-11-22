package istruzioni_condizionali;

import java.util.Scanner;

public class Esercizio07 {

	public static void main(String[] args) {

		/*Esercizio 7.
		Scrivere un programma che legge tre numeri e dice se possono essere le lunghezze dei lati di un triangolo 
		(perché un triangolo possa essere tale la somma di ogni coppia lati deve essere maggiore dell’altro)
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("INSERIRE 3 NUMERI: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a+b>c && a+c>b && b+c>a) {
			System.out.println("E UN TRIANGOLO!");
		}else {
			System.out.println("NON E' UN TRIANGOLO!");
		}
		
	
		
	}

}
