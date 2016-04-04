package ricorsione;

public class RicercaBinariaRicorsiva
{

	
	public int cerca(int[] array, int elemento)
	{
		return cerca(array, elemento, 0, array.length-1);
	}
	
	private int cerca(int[] array, int elemento, int a, int b)
	{
		if(a > b) return -1;
		int meta = (b+a)/2;
		if(array[meta]==elemento) return meta;
		if(elemento < array[meta]) 
			return cerca(array, elemento, a, meta-1);
		else
			return cerca(array, elemento, meta+1, b);
	}
	
	
	
	public static void main(String[] args)
	{
		 System.out.println("Indice elemento: " + new RicercaBinariaRicorsiva().cerca(new int[] {1,2,3,4,5,6,7}, 5 ));
	}
}
