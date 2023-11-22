package Esercizio02;

import java.util.Scanner;

public class ProvaVeicolo {

	/*Esercizio 2. Scrivere una classe Veicolo che prevede una targa, una marca e un modello. La classe
	prevede anche una variabile booleana che descrive se il veicolo `e guasto. Aggiungere un costruttore opportuno e vari metodi get e set opportuni. Scrivere la classi Vettura e Motociclo che estendono la classe
	Veicolo. La classe Vettura prevede una stringa che ne descrive la tipologia ("utilitaria","station wagon",
	"SUV",....) mentre la classe Motociclo prevede un numero che ne descrive la cilindrata (50, 125, ....).
	Per testare le classi, scrivere un programma UsaVeicoli che crea un array inizializzato con veicoli
	delle varie tipologie. Alcuni dei veicoli inseriti nell’array dovranno diventare guasti. Il programma deve
	stampare la lista delle targhe dei veicoli guasti.*/
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Repository r = new Repository();
		Veicolo v = new Veicolo();
		
		
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


