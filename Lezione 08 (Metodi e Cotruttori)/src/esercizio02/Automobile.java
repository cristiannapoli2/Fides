package esercizio02;

import java.util.Scanner;

public class Automobile {

	private int consumo, serbatoio, litri, km;
	
	public Automobile(int consumo) {
		this.consumo=consumo;
		serbatoio=0;
	}
	
	public void drive() { // SIMULAZIONE PERCORSO
		Scanner input = new Scanner(System.in);
		System.out.println("QUANTI KM VUOI PERCORRERE?");
		km = input.nextInt();
		consumo = km/litri;
			if (consumo>serbatoio) {
				System.err.println("NON HAI ABBASTANZA CARBURANTE!");
			}else {
				serbatoio -= litri;
				System.out.println("PERCORSO DI: " + km + " KM EFFEETTUATO!");
			}
		}
	
	
	public int dammiCarburante() { // LIVELLO CARBURANTE 
		System.out.println("HAI: " + serbatoio + " LITRI DI BENZINA!");
		return serbatoio;
	}
	
	public void rifornimento() { // RIFORNIMENTO
		Scanner input = new Scanner(System.in);
		System.out.println("QUANTO LITRI DI CARBURANTE VUOI METTERE?");
		litri = input.nextInt();
		serbatoio += litri;
	}
	
	
	
}
