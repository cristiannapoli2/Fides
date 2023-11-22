package esercizio01;

import java.util.Objects;

public class Dipendente {
	int stipendio;
	String nome;
	
	
	public Dipendente( String nome, int stipendio) {
		this.nome = nome;
		this.stipendio = stipendio;
	}



	public String Stampa() {
		return "Dipendente [stipendio=" + stipendio + ", nome=" + nome + "]";
	}


	
	

}

