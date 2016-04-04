package it.uniroma1.navigli;

public class Segmento
{
	private Punto punto1;
	private Punto punto2;
	
	public Segmento(Punto p1, Punto p2)
	{
		punto1 = p1;
		punto2 = p2;
	}
	
	public static void main(String[] args)
	{
		Punto p1 = new Punto(1, 3, 8);
		Punto p2 = new Punto(4, 4, 7);
		Segmento s = new Segmento(p1, p2);
	}
}
