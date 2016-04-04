package esonero3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MyArray
{
	private int a[];
	private ArrayList<Integer> lista = new ArrayList<>();
	
	public MyArray(int...interi)
	{
		a = interi;
		riordina();
	}
	
	
	
	public void riordina()
	{	
		for(int i=0; i<a.length; i++)
		{
			lista.add(a[i]);
		}
		
		Collections.sort(lista);
		
		int b[] = new int[lista.size()];
		
		for(int j=0; j<lista.size(); j++)
			b[j] = lista.get(j);
	
		a = b;
	}
	
	public static void main(String[] args)
	{
		MyArray array = new MyArray(new int[] {1,55,4,3,66,72});
		System.out.println(Arrays.toString(array.a));
	}
	
}
