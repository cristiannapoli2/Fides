package esercizio01;

public class ProdottoScontabile extends Prodotto {
	
	private int sconto, quantitaScontabile;
	
	public ProdottoScontabile(String descrizione, int quantitaDisp, double prezzo, int quantitaScontabile, int sconto) {
		super(descrizione, quantitaDisp, prezzo);
		this.quantitaScontabile = quantitaScontabile;
		this.sconto = sconto;
		prezzo -= sconto;
	}

	public double calcolaSconto(int quantita, int sconto) {
		if(quantita>=quantitaScontabile) {
		double prezzoScontato = (prezzo * sconto)/100;
		System.out.println("PREZZO SCONTATO DEL: " + sconto + "% = €" + prezzoScontato);
		return prezzoScontato;
		}else {
			return prezzo;
		}
	}

	public boolean vendi(int quantita) {
		
		if(this.quantitaDisp<quantita) {
			System.err.println("QUANTITA INSUFFICIENTE!");
			return false;
		}
		if(this.quantitaDisp>quantita) {
			this.quantitaDisp -= quantita;
			System.out.println("DESCRIZIONE: " +  descrizione + "\n" + "QUANTITA: " + quantitaDisp + "\n" + "PREZZO: " + prezzo);
		return true; 
		}else {
		return false;
		}
	}
	

		
	}
	

	
	

