package ClassiAstratte_es4;

public class Utils {
	Contenitore C;

	public Utils() {}
	


//	public Contenitore[] filtra(Contenitore[] t, Contenitore c) {
//		int j=0;
//		for(Contenitore l: t) {
//			if(l.nomeL.equals(c.nomeL)) {
//				j++;
//			}
//			
//		}
//		
//		Contenitore[] p=new Contenitore[t.length-j];
//		
//		for (int i=0; i<t.length-1;i++) {
//			if(t[i].nomeL.equals(c.nomeL)) {
//				p[i]=t[i];
//			}
//		}
//		
//		return p;
//	}
	public Contenitore[] filtra(Contenitore[] t, Contenitore c) {

        int j = 0;

        for (int i=0; i<t.length;i++) {
            if (t[i].nomeL.equals(c.nomeL)) {
                j++;
            }
        }
       
        Contenitore[] p = new Contenitore[t.length - j];
        int index=0;
        for (int i = 0; i < t.length; i++) {
        	
            if (!t[i].nomeL.equals(c.nomeL)) {
                p[index]= t[i];
                index++;
            }
        }
        return p;
    }
}