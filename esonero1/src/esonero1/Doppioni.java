package esonero1;

public class Doppioni
{
	private int[] array;
	
	public Doppioni(int[] array)
	{
		this.array = array;
	}
	
	public int prossimoDoppione(int k) 
	{
		for (int i=k; i<array.length-1; i++) 
		{
			if (array[i] == array[i+1])
			{
				return (i+1);
			}
		}
		return -1;	
	}
	
	public int[] eliminaDoppioni()
	{
		int[] nuovoArray = new int[array.length];
		
		for (int i=0; i<array.length; i++)
		{
			if(prossimoDoppione(i) != -1)
			{
				System.out.println("Ciao");
			}
		}
	
	
			return nuovoArray;
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Doppioni ogg = new Doppioni(new int[] {1,2,2,3,4});
		Doppioni ogg1 = new Doppioni(new int[] {1,2,2,3,4});
		
		int ris = ogg.prossimoDoppione(0);
		System.out.println(ris);
		
		ogg1.eliminaDoppioni();
		
		
		
		
	}

}
