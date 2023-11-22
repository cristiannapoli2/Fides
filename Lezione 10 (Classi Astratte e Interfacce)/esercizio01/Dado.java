package ClassiAstratte_es1;

public class Dado extends lancio {
	private int n;
	
	public Dado() {
		n = 1;
	}

	public void lancio() {
		n = (1 + (int) (Math.random() * 6));
	}

	public int print() {
		return n;
	}
}