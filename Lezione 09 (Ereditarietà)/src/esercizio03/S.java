package esercizio03;

public class S extends T{

	public S(double a, double b, double c) {
		super(a, b, c);
	}
	
	public boolean isS() {
		if(!isT()) {
			System.err.println("IL TRIANGOLO NON ESISTE!");
			return false;
		}
		else {
			if(latoA!=latoB && latoA!=latoC && latoB!=latoC) {
				System.out.println("IL TRIANGOLO E' UN TRIANGOLO SCALENO!");
				System.out.println("IL PERIMETRO E': " + perimetro);
			}
			return true;
		}
	}
	

}
