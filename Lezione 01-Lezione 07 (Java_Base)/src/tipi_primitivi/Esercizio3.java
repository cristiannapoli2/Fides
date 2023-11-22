package tipi_primitivi;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		
		/*Esercizio 3. Completare il seguente programma Scambia aggiungendo i comandi mancanti al posto dei
		puntini in modo che i due numeri inseriti dall’utente vengano stampati in ordine inverso dal programma.
		*/
		
		Scanner input = new Scanner ( System . in );
		int x ,y;
		System . out . println (" Inserisci il primo numero :");
		x = input . nextInt ();
		System . out . println (" Inserisci il secondo numero :");
		y = input . nextInt ();
		// inserire i comandi mancanti qui
		int z;
		z=x;
		x=y;
		y=z;
		System . out . println (" Ecco i numeri inseriti in ordine inverso :");
		System . out . println (x );
		System . out . println (y );
		
	}

}
