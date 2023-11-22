package ClassiAstratte_es3;

public class main {

	public static void main(String[] args) {
		int n1=15;
		int n2=24;
		Aritmetica A=new Aritmetica (n1,n2);
		
		System.out.println("OPERAZIONI TRA "+n1+" E "+n2);
		System.out.println("ADDIZIONE: "+A.addizione());
		System.out.println("SOTTRAZIONE :"+A.sottrazione());
		System.out.println("MOLTIPLICAZIONE :"+A.moltiplicazione());
		System.out.println("DIVISIONE :"+A.divisione());
		
	}

}
