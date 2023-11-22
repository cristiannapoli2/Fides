package esercizio03;

import java.util.Scanner;

public class TestAppartamento {

	public static void main(String[] args) {

		/*Esercizio 3. Scrivere una classe Appartamento i cui oggetti rappresentano appartamenti di un condominio. 
		Le caratteristiche di un appartamento sono: nome del proprietario, superficie, piano e numero
		inquilini. Queste informazioni devono essere rese disponibili alle altre classi tramite opportuni metodi.
		Solo il nome del proprietario e il numero degli inquilini potranno essere modificati successivamente alla
		creazione di un oggetto di questa classe (tramite opportuni metodi). Aggiungere un metodo visualizza
		(utilizzabile dalle altre classi) che stampa sullo schermo tutte le caratteristiche dell’appartamento.
		Per testare la classe, scrivere un programma TestAppartamento che crea tre appartamenti (oggetti
		della classe Appartamento), modifica il nome del proprietario del secondo e il numero di inquilini del
		terzo, e infine stampa le caratteristiche aggiornate di tutti e tre gli appartamenti.*/
		
		
		Appartamento a1 = new Appartamento("Vincenzo De Pascale", 120, 10, 5);
		Appartamento a2 = new Appartamento("Benedetto De Stefano", 160, 25, 3);
		Appartamento a3 = new Appartamento("Sebastiano Allocca", 250, 150, 2);
		
		a2.setNomeProprietario(a2.leggiStringa("CAMBIA NOME PROPRIETARIO: "));
		a3.setNumeroInquilini(Integer.parseInt(a3.leggiIntero("CAMBIA NUMERO INQUILINI: ")));
		
		a1.visualizza();
		a2.visualizza();
		a3.visualizza();
		
	}

}
