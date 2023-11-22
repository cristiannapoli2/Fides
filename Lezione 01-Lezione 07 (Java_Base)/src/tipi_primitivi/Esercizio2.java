package tipi_primitivi;


public class Esercizio2 {

	public static void main(String[] args) {

		/*Esercizio 2. Modificare il programma AreaTriangolo2 visto a lezione assumendo le seguenti dichiarazioni
		di variabili:
		int base , altezza ;
		double area ;
		e facendo in modo che l’area venga calcolata in maniera esatta (ossia, con base=5 e altezza=7 si deve
		ottenere area=17.5*/
		
		int base, altezza;
		double area;
		
		base = 5;
		altezza = 7;
		area = (double) base * altezza / 2;
		
		
		System.out.println("AREA: " + area);
		
		
		
	}

}
