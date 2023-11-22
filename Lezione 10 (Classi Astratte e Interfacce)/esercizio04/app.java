package ClassiAstratte_es4;

public class app {

	public static void main(String[] args) {
		
		Contenitore l1=new Lattina (1111,"acqua",10);
		Contenitore l2=new Lattina (2222,"cocacola",15);
		Contenitore b1=new Bidone(3333,"acqua", 100);
		Contenitore b2=new Bidone (4444, "pepsi",50);
		
		Contenitore[] c= {l1,l2,b1,b2};
		
		Utils u=new Utils ();
		Contenitore[] c2=u.filtra(c, l1);

		for(int i=0; i<c2.length;i++) {
			System.out.println("");
			c2[i].stampa();
		}
		
		
		l1.confronta(l1, l2);
		l2.confronta(l2, b1);
		b1.confronta(b1, l1);
		b2.confronta(b2, b2);
		
		
	}
	
}
