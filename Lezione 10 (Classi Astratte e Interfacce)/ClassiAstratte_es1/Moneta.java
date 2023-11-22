package ClassiAstratte_es1;

public class Moneta extends lancio{
	private int x;
	public Moneta(){
	x=0;
	}
	public void lancio(){
	x=(int)(Math.random()* 2);
	}
	public int print(){
	return x;
	}
}