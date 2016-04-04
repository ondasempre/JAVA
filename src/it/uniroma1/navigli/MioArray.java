package it.uniroma1.navigli;

import java.util.Arrays;

public class MioArray
{
	private int[] array;
	
	public MioArray(int[] a)
	{
		array = a;
	}
	
	public boolean contiene(int posizione, int valore)
	{
		return posizione >= 0 && posizione < array.length && array[posizione] == valore;
	}
	
	public int somma2()
	{
		if (array.length == 0) return 0;
		if (array.length == 1) return array[0];
		return array[0] + array[1];
	}
	
	public void scambia(int a, int b)
	{
		if (a >= 0 && b >= 0 && a < array.length && b < array.length)
		{
			int temp = array[b];
			array[b] = array[a];
			array[a] = temp;
		}
	}
	
	public int maxTripla()
	{
		if (array.length == 0) { /* dovremmo emettere errore */ }
		return Math.max(array[0], Math.max(array[array.length/2], array[array.length-1]));
	}
	
	public int[] falloInDue()
	{
		if (array.length == 0) { /* dovremmo emettere errore */ }
		return new int[] { array[0], array[array.length-1] };
	}
	
	public static void main(String[] args)
	{
		MioArray a = new MioArray(new int[] { 1, 7, 5, 3, 0, 2, 2 });
		System.out.println(a.contiene(1, 7));
		System.out.println(a.somma2());
		a.scambia(1, 2);
		System.out.println(a.maxTripla());
		System.out.println(Arrays.toString(a.falloInDue()));
	}
}
