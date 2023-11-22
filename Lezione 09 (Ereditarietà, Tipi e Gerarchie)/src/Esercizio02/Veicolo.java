package Esercizio02;

import java.util.Scanner;

public class Veicolo {
	String targa, marca, modello;
	boolean rotto=false;
	
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public boolean isRotto() {
		return rotto;
	}
	public void setRotto(boolean rotto) {
		this.rotto = rotto;
		
	}
	public Veicolo() {
		super();
	}
	
	
	public void stampaGuasto() {
		if(rotto) {
			System.out.println(targa);
		}
	}
	
	

}
