package array;

import java.util.Scanner;

public class Esercizio09 {

	public static void main(String[] args) {
		
		/*Esercizio 9. Modificare l’esercizio precedente in modo che se l’utente indovina una parola il programma
		stampi l’elenco delle altre parole misteriose, mentre se l’utente sbaglia stampi tutte e 5 le parole misteriose*/
	
		Scanner input = new Scanner(System.in);
		boolean find=false;
		String [] parole = {"Sole", "Cuore", "Amore", "Spiaggia", "Estate"};
			for(int i=0; i<3; i++) {
				System.out.println("INSERISCI UNA PAROLA: ");
				String parola = input.next();
				if(parola.equals(parole[i])) {
					System.out.println("PAROLA IDOVINATA!");
					System.out.println("LE PAROLE ERANO: ");
					for(int x=0; x<parole.length; x++) {
						System.out.println(parole[x]);
					}
					find=true;
					break;
				} else {
					i=3;
					System.err.println("SBAGLIATO!");
					System.out.println("LE PAROLE ERANO: ");
					for(int x=0; x<parole.length; x++) {
						System.out.println(parole[x]);
				}
			}
		
				
			
			}
	
	
	
	
	}

}
