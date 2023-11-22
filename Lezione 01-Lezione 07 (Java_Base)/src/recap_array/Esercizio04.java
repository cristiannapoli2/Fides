package recap_array;

public class Esercizio04 {

	public static void main(String[] args) {
		/*Esercizio 4: Scrivere un programma TreConsecutivi che prevede un array di 10 numeri interi contenente valori a piacere (senza bisogno di chiederli all’utente) e stampa "Tre valori consecuitivi uguali"
		se l’array contiene tre valori uguali in tre posizioni consecutive, oppure stampa "NO" altrimenti. (Il programma deve essere scritto facendo finta di non sapere quali siano i valori inseriti nell’array)*/

		
		int [] numeri = {3, 5, 7, 7, 7, 121, 81, 49, 25, 9};
		boolean flag=false;
		for(int i=0; i<numeri.length-3; i++) {
			if(numeri[i]==numeri[i+1]&&numeri[i]==numeri[i+2]) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("TRE VALORI CONSECUTIVI UGUALI");
		}else {
			System.out.println("NO!");
		}
		
		
		
	}

}
