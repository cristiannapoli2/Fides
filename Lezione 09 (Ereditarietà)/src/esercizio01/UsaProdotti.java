package esercizio01;

public class UsaProdotti {

	public static void main(String[] args) {

		Prodotto p = new Prodotto("PENNA", 100);
		ProdottoScontabile ps = new ProdottoScontabile("PENNA", 100, 1.5, 10, 50);
		ps.vendi(12);
		ps.calcolaSconto(12, 50);
		
		
	}

}
