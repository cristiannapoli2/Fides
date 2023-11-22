package array;

public class Esercizio07 {

	public static void main(String[] args) {

		/*12 valori a piacere che rappresentano temperature atmosferiche (usando il comando di inizializzazione
		che prevede la lista dei valori tra parentesi graffe). Il programma calcola la media di tali temperature e,
		per ogni valore di temperatura nell’array, stampa un messaggio che dice se essa `e maggiore (o uguale)
		oppure inferiore alla media.*/
		
		double [] numeri = {37.0, 24.7, 59.2, 120.9, 36.2, 79.4, 3.0, 5.0, 256.3, 512.8};
		double media, tot = 0, count=0;
		
		for(double i: numeri) {
			count++;
			tot += i;
		}
		media = tot/count;
		System.out.println(tot);
		System.out.println(media);
		for(int x=0; x<numeri.length; x++) {
			if(numeri[x]>=media) {
				System.out.println("LA TEMPERATURA: " + numeri[x] + " E' MAGGIORE O UGUALE ALLA TEMPERATURA MEDIA: " + media);
			}else {
				System.out.println("LA TEMPERATURA: " + numeri[x] + " E' MINORE ALLA TEMPERATURA MEDIA: " + media);
			}
		}
		
		
		
	}

}
