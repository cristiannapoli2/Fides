package esercizio02;

public class Parallelepipedo extends Rettangolo{

	// ATTRIBUTO
	int p; 

	// METODI SETTERS & GETTERS
	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}


	// COSTRUTTORE PARAMETRIZZATO
	public Parallelepipedo(int b, int h, int p) {
		super(b, h);
		this.p = p;
		int volume = b*h*p;
		System.out.println("VOLUME: " + volume + "m³");
	}

	
}
