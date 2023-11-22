package Esercizio03;

public class Officina extends Repository{

	Veicolo v;
	Repository r = new Repository();
	
	public void ripara(Veicolo v) {
	double prezzo = 0;
	if(v.rotto) {
		if(v instanceof Motociclo) {
			prezzo+=300;
			v.setRotto(false);
			System.out.println("COSTO RIPARAZIONE €" + prezzo);
		}else if(v instanceof Vettura) {
			prezzo+=400;
			v.setRotto(false);
			System.out.println("COSTO RIPARAZIONE €" + prezzo);
		}
		
		}
		
		}
		
		
	}
	

