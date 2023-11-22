package blocchi_e_cicli;

public class Esercizio07 {

	public static void main(String[] args) {

		for(int x=1; x<=10; x++) {
			for(int y=1; y<11; y++) {
				if(x*y<10) {
					System.out.print(x*y + "   ");
			}else if(x*y>=10) {
					System.out.print(x*y + "  ");
				}
			}
			System.out.println("");
		}
		
	}
}


