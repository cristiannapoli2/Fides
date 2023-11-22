package Esercizio01;

import java.util.Scanner;

public class Dipendente extends Persona{
	
	private int annoAssunzione,stipendio;

	public int getAnnoAssunzione() {
		return annoAssunzione;
	}

	public void setAnnoAssunzione(int annoAssunzione) {
		this.annoAssunzione = annoAssunzione;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	public Dipendente(String nome, String cognome, String indirizzo, int annoAssunzione, int stipendio) {
		super(nome, cognome, indirizzo);
		this.annoAssunzione = annoAssunzione;
		this.stipendio = stipendio;
	}

	public Dipendente() {}

	

	@Override
	public void visualizza() {
		super.visualizza();
		System.out.println("ANNO ASSUNZIONE: " + annoAssunzione);
		System.out.println("STIPENDIO: " + stipendio);
	}
	
	public boolean guadagnaPiuDi(Dipendente d) {
		if(this.stipendio>d.stipendio) {
			return true;
		}
		return false;
	}
	
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

	public void mascheraStampa() {
		System.out.println("NOME: " + nome);
		System.out.println("COGNOME: " + cognome);
		System.out.println("INDIRIZZO: " + indirizzo);
		System.out.println("ANNO ASSUNZIONE: " + annoAssunzione);
		System.out.println("STIPENDIO: " + stipendio);
	}
}
