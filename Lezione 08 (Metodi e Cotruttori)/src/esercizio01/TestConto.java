package esercizio01;

import java.util.Scanner;

public class TestConto {

	public static void main(String[] args) {
		/*Esercizio 1.
		Scrivere una classe Java che implementi un conto corrente bancario. Il saldo del conto corrente deve essere memorizzato in una variabile di istanza di tipo int e i metodi di interesse sono:
		- deposita che aggiorna il saldo in base ad un valore intero passato come argomento,
		- preleva che aggiorna il saldo in base ad un valore intero passato come argomento e restituisca un valore booleano corrispondente alla corretta esecuzione dell'operazione
		- leggisaldo che restituisce il saldo del conto corrente.*/
		
		
		ContoCorrente cc = new ContoCorrente(10000);
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		
		do {
			cc.menu();
			int scelta = input.nextInt();
			switch(scelta){
			case 1: cc.versa(); break;
			case 2: cc.preleva(); break;
			case 3: cc.saldo(); break;
			}
		} while (flag);
		
		
		
		
			

	}

}
