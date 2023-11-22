package ClassiAstratte_es2;

public class Cubo implements Calcolo {
	int n;
	
	public Cubo(int n){
		this.n=n;
	};
	
	public int risultato() {
		return (n*n*n);
	}
}
