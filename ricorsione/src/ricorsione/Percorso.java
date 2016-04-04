package ricorsione;

import java.util.ArrayList;

public class Percorso
{
	
	public ArrayList<Integer> percorso(int[] array)
	{
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(0);
		percorso(array, 0, lista);
		return lista;
	}
	
	private void percorso(int[] array, int k, ArrayList<Integer> lista) throws IndexOutOfBoundsException
	{
		if(k > array.length)
			throw new IndexOutOfBoundsException("Indice non consentito");
		
		if(array[k] == -1)
		{	
			lista.add(-1);
			return;
		}
		
		else
		{
			lista.add(array[k]);
			percorso(array, array[k], lista);
		}
	}


	public static void main(String[] args)
	{
		System.out.println(new Percorso().percorso(new int[] {3,2,-1,1,2}));
	}

}
