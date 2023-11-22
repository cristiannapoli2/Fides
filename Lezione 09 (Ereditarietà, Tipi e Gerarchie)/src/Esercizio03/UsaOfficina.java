package Esercizio03;

import java.util.Scanner;

import Esercizio03.Motociclo;
import Esercizio03.Repository;
import Esercizio03.Veicolo;
import Esercizio03.Vettura;

public class UsaOfficina {

	/*Esercizio 3. Scrivere una classe Officina che prevede solo un metodo ripara() che utilizza veicoli
	(come definiti nell’esercizio precedente). Tale metodo prende un veicolo come parametro, ne cambia (se
	necessario) il valore della variabile booleana che descrive lo stato di guasto e restituisce come risultato
	il prezzo dell’intervento. Il prezzo deve variare a seconda che il veicolo fosse guasto o meno, e a seconda
	della tipologia di veicolo.
	Per testare le classi, scrivere un programma UsaOfficina che crea un po’ di veicoli e un oggetto di
	tipo Officina, e usa il metodo ripara() varie volte su oggetti diversi (guasti o meno) stampando i
	prezzi ottenuti.*/
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Repository r = new Repository();
		Veicolo v = new Veicolo();
		Officina o = new Officina();
		
		for(int i=0; i<r.veicoli.length; i++) {
			r.menu();
		int scelta = input.nextInt();
		switch(scelta){
		case 1: {
			v = new Veicolo();
			r.inserimento(v);
		}
			break;
		case 2: {
			v = new Motociclo();
			r.inserimento(v);
		}
			break;
		case 3:{
			v = new Vettura();
			r.inserimento(v);
		}
		case 4: {
			o.ripara(v);
		}
			break;
		}
		r.veicoli[i]=v;
		}
		
		for(int x=0; x<r.veicoli.length; x++) {
			if(r.veicoli[x].rotto) {
				System.out.println("TARGA VEICOLO/I ROTTO/I: " + r.veicoli[x].targa);
			}
		}
			
		}
		
		
	}


