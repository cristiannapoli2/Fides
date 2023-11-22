package Esercizio01;

public class UsaDipendente {

	public static void main(String[] args) {

		Dipendente d1 = new Dipendente("Sebastiano", "Allocca", "Via della Distruzione 24", 2023, 1500);
		Dipendente d2 = new Dipendente("Benedetto", "De Stefano", "Viale Mani Dalnaso", 2023, 1900);
		Dipendente d3 = new Dipendente("Salvatore", "Riccio", "Via D'Annamaria", 2023, 3800);
		
		
			if(d1.guadagnaPiuDi(d2) && d2.guadagnaPiuDi(d3)){
				System.out.println("1° ");
				d1.mascheraStampa();
				System.out.println("2° ");
				d2.mascheraStampa();
				System.out.println("3° ");
				d3.mascheraStampa();
			}else if(d1.guadagnaPiuDi(d2) && d3.guadagnaPiuDi(d3)){
				System.out.println("1° ");
				d1.mascheraStampa();
				System.out.println("2° ");
				d3.mascheraStampa();
				System.out.println("3° ");
				d2.mascheraStampa();
			}
			else if(d2.guadagnaPiuDi(d1) && d1.guadagnaPiuDi(d3)) {
				System.out.println("1° ");
				d2.mascheraStampa();
				System.out.println("2° ");
				d1.mascheraStampa();
				System.out.println("3° ");
				d3.mascheraStampa();
			}
			else if(d2.guadagnaPiuDi(d3) && d3.guadagnaPiuDi(d1)) {
				System.out.println("1° ");
				d2.mascheraStampa();
				System.out.println("2° ");
				d3.mascheraStampa();
				System.out.println("3° ");
				d1.mascheraStampa();
			}
			else if(d3.guadagnaPiuDi(d2) && d1.guadagnaPiuDi(d2)) {
				System.out.println("1° ");
				d3.mascheraStampa();
				System.out.println("2° ");
				d1.mascheraStampa();
				System.out.println("3° ");
				d2.mascheraStampa();
			}
			else if(d3.guadagnaPiuDi(d2) && d2.guadagnaPiuDi(d1)) {
				System.out.println("1° ");
				d3.mascheraStampa();
				System.out.println("2° ");
				d2.mascheraStampa();
				System.out.println("3° ");
				d1.mascheraStampa();
			}
			
		}
		
		
		
	}


