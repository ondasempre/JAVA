package esonero1;

import java.util.Arrays;

public class SequenzaCompressa {

	private int somma;
	private int[] interi = {1,4,0,3,3};
	private int[] altriInt = {1, 4, 2, 0, 3, 3};
	
	
	public int sommaMinimale(int k, int s)
	{
		int somma=0;
		
		for(int i=k; i<interi.length; i++)
		{
			somma += interi[i];
			if (somma > s)
			{
				return i;
			}
			
		}
		return -1;
	}
	
	
	public void comprimi(int k, int s)
	{
		int parziale = 0;
		int indice = sommaMinimale(k, s);
		int length = altriInt.length;
		int prova = length+k-indice;
		int[] arrayNuovo = new int[prova];
		int j = 0;
		
		//int prova = length+k-indice;
		
		System.out.println(prova);
		
		System.out.println(Arrays.toString(arrayNuovo));
		
		
		for (int i=k; i<=indice;i++)
		{
			parziale += altriInt[i];
		}
	
		int[] arrayUno = Arrays.copyOf(arrayNuovo, k);
		int[] arrayDue = Arrays.copyOfRange(altriInt, indice, arrayNuovo.length);
		
		
		for (int i=0; i<length; i++)
		{
			if(i==k)
			{
				arrayNuovo[i] = parziale;
			}
			if(i < k)
			{
				arrayNuovo[i] = arrayUno[i];
			}
			else
			{
				arrayNuovo[i] = arrayDue[j];
				j++;
			}	
			
		}

		
		
		return;
		
	}
	
	public void stampa(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
	    }
	}
	
	
	public static void main(String[] args) {
		SequenzaCompressa prova = new SequenzaCompressa();
		SequenzaCompressa prova1 = new SequenzaCompressa();
		
		int ris = prova.sommaMinimale(1, 8);
		//System.out.println(ris);
		
		
	}

	
	
}
