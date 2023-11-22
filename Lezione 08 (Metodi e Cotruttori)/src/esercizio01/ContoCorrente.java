package esercizio01;

import java.util.Scanner;

public class ContoCorrente {

	double saldo, somma;
	
	public ContoCorrente ( double saldoIniziale ) {
		saldo = saldoIniziale ;
		}
	
	public void versa() {
		Scanner input = new Scanner(System.in);
		System.out.println("QUANTO VUOI VERSARE? ");
		somma = input.nextDouble();
		saldo += somma;
		System . out . println ("VERSATI €" + somma);
		System.out.println("SALDO ATTUALE €" + saldo);
	}
	public void preleva() {
		Scanner input = new Scanner(System.in);
		System.out.println("QUANTO VUOI PRELEVARE? ");
		System.out.println();
		somma = input.nextDouble();
		if(saldo>somma) {
			saldo -= somma;
			System . out . println ("PRELEVATI €" + somma);
			System.out.println();
			System.out.println("SALDO ATTUALE €" + saldo);
		}else {
			System.err.println("SALDO NON SUFFICIENTE PER PRELIEVO");
		}
	}

	public void saldo() {
		System.out.println();
		if(saldo<=0) {
			System.err.println("SALDO INSUFFICIENTE! NON TI VERGOGNI?");
		}else {
			System.out.println("SALDO €" + saldo);
		}
		System.out.println();
	}
	
	public void menu() {
		System.out.println("BENVENUTO IN HOME BANKING");
		System.out.println();
		System.out.println("SCEGLI UN OPERAZIONE");
		System.out.println("1) VERSAMENTO");
		System.out.println("2) PRELIEVO");
		System.out.println("3) SALDO");
		System.out.println("4) ESCI");
		System.out.println();
		
		
		
		
	}
	
	
		
	}
	
	
	

