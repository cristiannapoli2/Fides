package array;

import java.util.Scanner;

public class Esercizio01 {

	public static void main(String[] args) {

		/*Esercizio 1. Creare un programma che che stampi i numeri
		inseriti in input in ordine inverso.*/
		
		Scanner input = new Scanner(System.in);
		int[] nums = new int [10]; 
		for(int ins: nums) {
			System.out.println("INSERISCI UN NUMERO: ");
			ins = input.nextInt();
		}
		for(int i=nums.length; i>0; i--) {
			System.out.println(i);
		}
		
		
	}

}
