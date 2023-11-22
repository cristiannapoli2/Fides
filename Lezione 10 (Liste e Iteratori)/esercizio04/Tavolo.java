package esercizio04;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class Tavolo {
	Scanner input = new Scanner(System.in);
	static int id;
	int coperti;
	int codice;
	public Tavolo(int coperti) {
		id++;
		this.codice=id;
		this.coperti = coperti;
	}

	public void ordina(HashMap<String,Double> piatti, HashMap<String,Double> bevande) {
		double prezzoBevande=0;
		double prezzoPiatti=0;
		do {
		System.out.println("cosa ordini?");
		String ordine=input.nextLine();
		if(!ordine.equals("esci")) {
			if(bevande.containsKey(ordine)) {
				prezzoBevande+=bevande.get(ordine);
			}else if(piatti.containsKey(ordine)) {
				prezzoPiatti+=piatti.get(ordine);
				}
			}else {break;}
		}while(true);
		double prezzoTot=prezzoBevande+prezzoPiatti;
		System.out.println("TAVOLO "+ codice + " : "+ "\nprezzo totale: "+ prezzoTot);
	}

}
