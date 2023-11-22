package Esercizio02;

import java.util.Scanner;

public class Repository {

	Veicolo [] veicoli = new Veicolo[3];
	Scanner input = new Scanner(System.in);
	
	public String leggiStringa(String messaggio) {
		Scanner input = new Scanner(System.in);
		System.out.println(messaggio);
		messaggio = input.next();
		return messaggio;
	}
	public String leggiIntero(String messaggio) {
		Scanner input = new Scanner(System.in);
		System.out.println(messaggio);
		messaggio = input.next();
		return messaggio;
	}

	public void menu() {
		System.out.println("MENU");
		System.out.println("1) INSERISCI VEICOLO");
		System.out.println("2) INSERISCI MOTOCICLO");
		System.out.println("3) INSERISCI VETTURA");
		System.out.println("4) RIPARA");
	}
	
	public void inserimento(Veicolo v) {
		v.setTarga(leggiStringa("TARGA: "));
		v.setMarca(leggiStringa("MARCA: "));
		v.setModello(leggiStringa("MODELLO: "));
		System.out.println("ROTTO? TRUE O FALSE?");
		v.setRotto(input.nextBoolean());
		if(v instanceof Vettura) {	
		v = new Vettura();
			((Vettura) v).setTipologia(leggiStringa("TIPOLOGIA: "));
		}else if (v instanceof Motociclo) {
			((Motociclo) v).setCC(Integer.parseInt(leggiIntero("CC: ")));
		}
		
	}
	
	
	
}
