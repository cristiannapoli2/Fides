package esercizio03;

public class T {

	// ATTRIBUTI
	public double latoA, latoB, latoC, perimetro;

	// METODI SETTERS E & GETTERS
	public double getLatoA() {
		return latoA;
	}

	public void setLatoA(double latoA) {
		this.latoA = latoA;
	}

	public double getLatoB() {
		return latoB;
	}

	public void setLatoB(double latoB) {
		this.latoB = latoB;
	}

	public double getLatoC() {
		return latoC;
	}

	public void setLatoC(double latoC) {
		this.latoC = latoC;
	}
	
	public T (double a, double b, double c) {
		this.latoA = a;
		this.latoB = b;
		this.latoC = c;
	}

	public boolean isT() {
		if (latoA+latoB>latoC && latoA+latoC>latoB && latoB+latoC>latoA)
		return true;
		else {
			return false;
		}
	}
	
	public double perimetroT() {
		perimetro = latoA + latoB + latoC;
		return perimetro;
	}
	
	
}
