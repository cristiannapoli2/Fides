package esercizio05;

import java.util.Scanner;

public class Reale {

	public static void main(String[] args) {

		/*Esercizio 5.
		Realizza un programma che sia in grado di accettare da tastiera, indifferentemente, 
		un numero reale o un numero immmaginario, usando il costrutto try-catch. 
		Bisogna ricordare che un numero immaginario è un numero reale preceduto dalla lettera 'j'.*/

		Scanner input = new Scanner(System.in);
		int r=0, i=0;
		String st = "";
		
		
		System.out.print("INSERISCI UN NUMERO REALE O IMMAGINARIO: ");
		try{
			st=input.nextLine();	    
			r = Integer.parseInt(st);
		}catch(NumberFormatException e){
			try {
				if(st.charAt(0)=='j'){
					i=Integer.parseInt(st.substring(1, st.length()));          
				}else {
					r=Integer.parseInt(st.substring(0, st.length()));
					System.out.println("NUM");}
			} catch (NumberFormatException e1) {
			System.err.println("FORMATO NON VALIDO! ");
			}
		}
		if(r!=0)System.out.println("NUMERO REALE: "+Integer.parseInt(st));
		if(i!=0)System.out.println("NUMERO IMMAGINARIO: "+i);
		
	}
}

