package ClassiAstratte_es3;

public class Aritmetica implements Operazione {
	double n1;
	double n2;
	
	
	public Aritmetica(int n1, int n2) {
		this.n1=n1;
		this.n2=n2;
	}
	
	public double addizione() {
		return (n1+n2);
	}
	
	public double sottrazione() {
		return (n1-n2);
	}
	
	public double moltiplicazione() {
		return (n1*n2);
	}
	
	@Override
	public double divisione() {
		if(n2!=0) {
			return (n1/n2);
		}else {System.err.println("ERRORE: DIVISIONE PER 0");
			return 0;}
	}
	
}
