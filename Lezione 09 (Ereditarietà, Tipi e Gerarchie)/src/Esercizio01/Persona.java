package Esercizio01;

public class Persona {

	public String nome, cognome, indirizzo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Persona(String nome, String cognome, String indirizzo) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
	}

	public Persona() {
	}
	
	// visualizza i dati della persona
	public void visualizza () {
	System . out . println ("NOME : " + nome );
	System . out . println ("COGNOME : " + nome );
	System . out . println ("INDIRIZZO : " + indirizzo );
	System . out . println ();
	}
	
	
}
