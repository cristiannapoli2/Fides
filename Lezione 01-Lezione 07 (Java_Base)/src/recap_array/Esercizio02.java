package recap_array;

public class Esercizio02 {

	public static void main(String[] args) {
		/*Esercizio 2: Scrivere un programma SommaPariDispari che prevede un array di 10 numeri interi
		contenente valori a piacere (senza bisogno di chiederli all’utente) e stampa: "Pari e dispari uguali" se
		la somma dei numeri in posizioni pari dell’array `e uguale alla somma dei numeri in posizioni dispari,
		altrimenti il programma stampa: "Pari e dispari diversi". (Il programma deve essere scritto facendo
		finta di non sapere quali siano i valori inseriti nell’array)*/
		
		
		int [] numeri = {10, 50, 21, 40, 30, 30, 40, 20, 50, 10};
		int sommaP = 0;
		int sommaD = 0;
	
		for(int x=0; x<numeri.length; x=x+2) {
			sommaP +=numeri[x];
		}
		for (int y=1; y<numeri.length; y=y+2) {
			sommaD += numeri[y];
		}
		if(sommaD==sommaP) {
			System.out.println("PARI & DISPARI UGUALI!");
		}else if(sommaD!=sommaP) {
			System.out.println("PARI & DISPARI DIVERSI!");
		}
		

	}

}
