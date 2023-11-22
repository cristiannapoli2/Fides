package array;

import java.util.Scanner;

public class Esercizio03 {

	public static void main(String[] args) {
		
		/*Esercizio 3. Scrivere il programma MinimoDiArray che chiede all’utente 
		 * di inserire 10 numeri, li memorizza in un array e poi stampa valore e 
		 * posizione dell’elemento minimo dell’array. Se il valore minimo
		 `e presente più di una volta, stampa la posizione della prima occorrenza 
		 di tale valore nell’array.**/
		
		
		
		Scanner input = new Scanner(System.in);
		int[] nums = new int [10]; 
		int count=0;
		int i;
		for(int x=0; x<nums.length; x++) {
			System.out.println("INSERISCI UN NUMERO: ");
			nums[x] = input.nextInt();
		}
		int min=nums[0];
		for(i=0; i<nums.length; i++) {
			if(min>nums[i]) {
				count=i;
				min=nums[i];
			}
		}
		
		System.out.println("IL NUMERO MINORE E: " + min + " E IL SUO INDICE E: " + count);
		
		
		
		
		
		
		
		
		
		
			}
		
		
	
		

		
		
		
		
		
		
	}
	
	
	
	
