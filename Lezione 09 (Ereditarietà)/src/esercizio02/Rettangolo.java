package esercizio02;

public class Rettangolo {

	// ATTRIBUTI
	private int b, h;
	
	// METODI SETTERS & GETTERS
	public void setB(int b) {
		this.b = b;
	}
	
	public int getB() {
		return b;
	}

	public void setH(int h) {
		this.h = h;
	}
	public int getH() {
		return h;
	}
	
	public Rettangolo() {
		
	}
	public Rettangolo(int b, int h) {
		int area = b*h;
		System.out.println("AREA: " + area + "m²");
	}
	
}
