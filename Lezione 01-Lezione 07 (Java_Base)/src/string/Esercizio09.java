package string;

import java.util.Scanner;

public class Esercizio09 {

	public static void main(String[] args) {
		/*Esercizio 10. Scrivere un programma ParoleQuasiUguali che chiede all’utente di inserire due singole
		parole e stampa Sono uguali! se le due parole sono uguali, Sono quasi uguali! se le due parole differiscono solo per l’uso di maiuscolo e minuscole, Non sono uguali! altrimenti. Per svolgere questo
		esercizio `e necessario usare un metodo della classe String non visto nelle slide, potete usare Google oppure la documentazione online*/
	
		Scanner input = new Scanner(System.in);
		System.out.println("INSERISCI DUE PAROLE: ");
		String parola1 = input.nextLine();
		String parola2 = input.nextLine();
		if(parola1.equals(parola2)) {
			System.out.println("LE PAROLE SONO UGUALI! ");
		}else if(parola1.equalsIgnoreCase(parola2)){
			System.out.println("LE PAROLE SONO QUASI UGUALI! ");
		}else {
			System.out.println("LE PAROLE SONO DIVERSE! ");
		}
		
		
		
	}

}
