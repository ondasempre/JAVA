package esonero3;

import java.util.*;


public class PuntoConPercorsi
{
	private int x;
	private int y;

	public PuntoConPercorsi(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int contaPercorsi(int a, int b)
	{
		if (a < x || b < y) return 0;
		if (a == x && b == y) return 1;
		
		return contaPercorsi(a-1, b) + contaPercorsi(a, b-1);
	}
	
	public static void main(String[] args)
	{
		
		PuntoConPercorsi punto = new PuntoConPercorsi(0, 0);
		System.out.println(punto.contaPercorsi(2, 1));
		
	}
}