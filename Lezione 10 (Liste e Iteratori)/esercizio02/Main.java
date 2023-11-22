package esercizio02;


import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <String> al1=new ArrayList <>();
		
		al1.add("benedetto");
		al1.add("sebastiano");
		al1.add("vincenzo");
		
		ArrayList <String> al2=new ArrayList <>();
		
		al2.add("benedetto");
		al2.add("emanuele");
		al2.add("cristian");
		
		ArrayList <String> al3= aggiunta (al1,al2);
		
		System.out.println(al3);
		
	}
	public static ArrayList<String> aggiunta(ArrayList<String> al1, ArrayList<String> al2) {
		ArrayList <String> al=new ArrayList <>();
		for(String l: al1) {
			if (al2.contains(l)) {
			al.add(l);
			}
		}
		return al;
		
	}
}
