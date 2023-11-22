package ClassiAstratte_es1;

public class main {

	public static void main(String[] args) {
		Dado d = new Dado();
		Moneta m = new Moneta();
		d.lancio();
		m.lancio();
		System.out.println("il dado caccia numero :" + d.print());

		String risMoneta = "";
		if (m.print() == 1) {
			risMoneta = "testa";
		} else if (m.print() == 0) {
			risMoneta = "croce";
		}

		System.out.println("la moneta dice " + risMoneta);
	}
}
