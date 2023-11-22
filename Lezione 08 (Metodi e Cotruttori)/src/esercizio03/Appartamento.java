package esercizio03;

import java.util.Scanner;

public class Appartamento {
 
	private String nomeProprietario;
	private int superficie, piano, numeroInquilini;
	
	
	
	public Appartamento(String nomeProprietario, int superficie, int piano, int numeroInquilini) {
		this.nomeProprietario = nomeProprietario;
		this.superficie = superficie;
		this.piano = piano; 
		this.numeroInquilini = numeroInquilini;
	}
	

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getPiano() {
		return piano;
	}

	public void setPiano(int piano) {
		this.piano = piano;
	}

	public int getNumeroInquilini() {
		return numeroInquilini;
	}

	public void setNumeroInquilini(int numeroInquilini) {
		this.numeroInquilini = numeroInquilini;
	};
	
	
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
	public void visualizza() {
		System.out.println("NOME PROPRIETARIO: " + getNomeProprietario());
		System.out.println("SUPERFICIE MQ: " + getSuperficie());
		System.out.println("PIANO: " + getPiano());
		System.out.println("NUMERO INQUILINI: " + getNumeroInquilini());
	}
	
	public void maschera() {
		System.out.println(leggiStringa(nomeProprietario));
		
	}
	
	
}

