package esonero1;

import java.util.Arrays;

public class Filtro
{

	public int[] passaBasso(int[] array, int k)
	{
		int len = array.length;
		int[] nuovoArray = new int[len];
		int j = 0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i] <= k)
			{
				nuovoArray[j] = array[i];
				j++;
			}
		}
		
		nuovoArray = Arrays.copyOf(nuovoArray, j);
		
		return nuovoArray;	
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] array = {2,5,7,3,9,34,21,5,6};
		
		System.out.println(Arrays.toString(new Filtro().passaBasso(array, 6)));
	
		double k = (char) 1.0;
		System.out.println(k);
	
	}

}
