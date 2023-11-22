package esercizio04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		HashMap <String,Double> piatti=new HashMap<>();
		piatti.put("spaghetti con le vongole", 18.00); 
		piatti.put("zeppoline e bruschette",  8.00);
		piatti.put("pasta al pomodoro", 11.50);
		piatti.put("carbonara", 15.00);
		piatti.put("pasta con tonno", 13.00);
		piatti.put("pasta al pesto", 13.00);
		piatti.put("cotoletta e patatine", 8.00);
		piatti.put("pasta alla pizzaiola", 15.00);
		piatti.put("pizza margherita", 8.00);
		piatti.put("pizza provola salsicce e funghi", 10.00);
		
		
		HashMap <String,Double> bevande=new HashMap<>();
		bevande.put("acqua",2.00);
		bevande.put("cocacola",3.00);
		bevande.put("vino bianco",8.00);
		bevande.put("vino rosso",10.00);
		bevande.put("sprite",3.00);
		bevande.put("Fi.Gà",5.00);
		
		

		Tavolo t1 = new Tavolo(4);
		Tavolo t2 = new Tavolo(8);
		Tavolo t3 = new Tavolo(6);
		Tavolo t4 = new Tavolo(8);
		Tavolo t5 = new Tavolo(2);
		Tavolo t6 = new Tavolo(2);
		Tavolo t7 = new Tavolo(16);
		Tavolo t8 = new Tavolo(4);
		
		
		t1.ordina(piatti, bevande);

	}

}
