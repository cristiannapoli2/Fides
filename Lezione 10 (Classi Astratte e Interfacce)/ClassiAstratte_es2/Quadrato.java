package ClassiAstratte_es2;

public class Quadrato implements Calcolo{
int n;
	
	public Quadrato(int n){
		this.n=n;
	};
	
	public int risultato() {
		return (n*n);
	}
}
