package recap_metodi_ausiliari;

public class Esercizio03 {

	public static void main(String[] args) {

		/*Esercizio 3: Scrivere un programma MezziCasuali che stampa un numero frazionario ottenuto
		come risultato della chiamata di un metodo ausiliario che al suo interno richiama il metodo di libreria Math.random(). Se il risultato di Math.random() `e minore di 0.5 il metodo lo restituisce cos`ı com’`e.
		Se invece il risultato di Math.random() `e maggiore o uguale a 0.5 il metodo lo restituisce diminuito di
		0.5. Il nome del metodo ausiliario pu`o essere scelto a piacere.*/
		
		double n = 0;
		random(n);
		
		
		
		
		
	}
	
	public static void random(double num) {
		
		num = Math.random();
		System.out.println("NUMERO GENERATO: " + num);
		if(num<0.5) {
			System.out.println("NUMERO INVARIATO: " + num);
		} else if(num>0.5) {
			num -= 0.5;
			System.out.println("NUMERO MODIFICATO: " + num);
		}
			
	}

}
