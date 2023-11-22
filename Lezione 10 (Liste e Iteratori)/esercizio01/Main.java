package esercizio01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <Dipendente> tab=new ArrayList <>();
		
		
		tab.add(new Dipendente ("benedetto",1800));
		tab.add(new Dipendente ("sebastiano", 1900));
		tab.add(new Dipendente ("cristian", 1600));
		tab.add(new Dipendente("vincenzo", 1400));
		tab.add(new Dipendente("salvatore",500));
		tab.add(new Dipendente("emanuele", 2300));
		
		for(Dipendente d:tab) {
			System.out.println(d.Stampa());
		}
		
	}
}