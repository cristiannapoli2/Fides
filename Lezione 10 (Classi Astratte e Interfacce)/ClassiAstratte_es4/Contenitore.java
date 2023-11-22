package ClassiAstratte_es4;

public class Contenitore implements CMP{
	int codice;
	String nomeL;
	int qta;
	
	
	public Contenitore(int codice, String nomeL, int qta) {
		super();
		this.codice = codice;
		this.nomeL = nomeL;
		this.qta = qta;
	}

	public void confronta(Contenitore a, Contenitore b) {
		if(a instanceof Lattina && b instanceof Bidone) {
			System.out.println("il primo contenitore è più leggero del secondo ");
		}else if(b instanceof Lattina && a instanceof Bidone) {
			System.out.println("il primo contenitore è più pesante del secondo");
		}else {
			if(a.qta>b.qta) {
				System.out.println("il primo contenitore è più pesante del secondo");
			}else if (a.qta<b.qta) {
				System.out.println("il primo contenitore è più leggero del secondo ");
			}else {
				System.out.println("i due contenitori hanno lo stesso peso");
			}
		}
	}

	public void stampa() {
		System.out.println("Contenitore [codice=" + codice + ", nomeL=" + nomeL + ", qta=" + qta + "]");
	}

	public String toString() {
		return "Contenitore [codice=" + codice + ", nomeL=" + nomeL + ", qta=" + qta + "]";
	}
	
	
	
	
	
	
}
