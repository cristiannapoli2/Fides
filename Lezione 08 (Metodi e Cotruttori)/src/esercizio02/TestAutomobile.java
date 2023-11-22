package esercizio02;

public class TestAutomobile {

	public static void main(String[] args) {

		/*Esercizio 2.
		Progettare una classe che rappresenta una automobile. 
		Ogni automobile è caratterizzata da un: consumo di carburante (litri/chilometro), 
		quantità di carburante presente nel serbatoio. Il consumo è indicato specificatamente nel costruttore. 
		Inizialmente il serbatoio è vuoto. I metodi della classe sono: metodo drive per simulare il percorso di un’automobile 
		per una certa distanza, riducendo di conseguenza il livello di carburante nel suo serbatoio; metodo dammiCarburante che ritorna 
		il livello del carburante; metodo faiRifornimento, per fare rifornimento. 
		Il metodo drive non può essere invocato per una distanza maggiore di quella percorribile con il carburante disponibile.*/
				
		Automobile a = new Automobile(15);
		a.rifornimento();
		a.dammiCarburante();
		a.drive();
		
		
		
		
	}

}
