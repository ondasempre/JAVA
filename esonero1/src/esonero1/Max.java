package esonero1;

import java.util.Arrays;

public class Max
{
	
	public int max(int[] array)
	{
		int max = 0;
		for (int i=0; i<array.length; i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
		}
		return (max != 0 ? max : -1);
	}
	
	public int somma(int[] array)
	{
		int somma = 0;
		for(int i=0; i<array.length; i++)
		{
			for(int j=i; j<array.length; j++)
			{
				if(array[i] == array[i+1])
				{
					somma += array[i];
				}
			}
		}
		return somma;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] array = {1,23,34,6,12,93,73};
		int[] array1 = Arrays.copyOf(array, array.length-3);
		
		
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array1));
		
		
	}

}
