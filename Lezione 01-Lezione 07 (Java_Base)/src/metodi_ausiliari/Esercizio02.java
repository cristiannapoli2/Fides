package metodi_ausiliari;

import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) {

	
		
		/*Esercizio 2. Aggiungere al seguente programma AreaPerimetroConMetodi i metodi ausiliari areaRettangolo(x,y)
		e perimetroRettangolo(x,y) che consentono di far funzionare correttamente il programma.*/
		
		Scanner input = new Scanner ( System . in );
		int base , altezza ;
		System . out . println ("INSERISCI BASE E ALTEZZA");
		base = input . nextInt ();
		altezza = input . nextInt ();
		int area = areaRettangolo ( base , altezza );
		int perimetro = perimetroRettangolo( base , altezza );
		System . out . println ("L'AREA DEL TRIANGOLO E’: " + area);
		System . out . println ("IL PERIMETRO DEL TRIANGOLO E’: " + perimetro);
	
				// ....
				// aggiungere i metodi ausiliari qui
				// ....
	}

	private static int areaRettangolo(int base, int altezza) {
		int area = base * altezza;
		return area;
	}
		
	private static int perimetroRettangolo(int base, int altezza) {
		int perimetro = ((base*2) + (altezza*2));
		return perimetro;
	}
		
}
	
	
	

