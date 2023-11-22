package esercizio03;

public class I extends T {
	
	
	public I(double a, double b, double c) {
		super(a, b, c);
	}
	
	public void isI() {
		if(!isT()) {
			System.err.println("IL TRIANGOLO NON ESISTE!");
		}
		else {
			if(latoA==latoB && latoB!=latoC) {
				System.out.println("IL TRIANGOLO E' UN TRIANGOLO ISOSCELE!");
				System.out.println("IL PERIMETRO E': " + perimetro);
			}
			else if(latoA==latoC && latoB!=latoC) {
				System.out.println("IL TRIANGOLO E' UN TRIANGOLO ISOSCELE!");
				System.out.println("IL PERIMETRO E': " + perimetro);
			}
			else if(latoB==latoC && latoB!=latoA) {
				System.out.println("IL TRIANGOLO E' UN TRIANGOLO ISOSCELE!");
				System.out.println("IL PERIMETRO E': " + perimetro);
			}
		}
	}
	
	

}
