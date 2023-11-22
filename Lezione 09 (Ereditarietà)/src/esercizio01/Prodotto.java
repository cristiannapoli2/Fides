package esercizio01;

import java.util.Scanner;

public class Prodotto {

	// VARIABILI 
	protected String descrizione;
	protected int quantitaDisp;
	protected double prezzo;
	
	// COSTRUTTORE
	public Prodotto(String descrizione, int quantitaDisp, double prezzo) {
		this.descrizione = descrizione;
		this.quantitaDisp = quantitaDisp;
		this.prezzo = prezzo;
	}
	
	// COSTRUTTORE CHE INIZIALIZZA IL PREZZO A €0
	public Prodotto(String descrizione, int quantitaDisp) {
		this.descrizione = descrizione;
		this.quantitaDisp = quantitaDisp;
		this.prezzo = 0;
	}
	
	//SETTERS & GETTERS
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getQuantita() {
		return quantitaDisp;
	}
	public void setQuantita(int quantitaDisp) {
		this.quantitaDisp = quantitaDisp;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	
	// METODO CHE RIFORNISCE
	public void rifornisci(int quantita) {	
		this.quantitaDisp += quantita;
	}
	
	// METODO CHE VENDE
	public boolean vendi(int quantita) {
		this.quantitaDisp -= quantita;
		if(this.quantitaDisp>quantita) {
			System.out.println("DESCRIZIONE: " +  descrizione + "\n" + "QUANTITA: " + quantitaDisp + "\n" + "PREZZO: " + prezzo);
		return true; 
		}else {
		return false;
		}
	}
	

	}
	
	
	

