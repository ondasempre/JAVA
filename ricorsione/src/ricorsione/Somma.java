package ricorsione;

public class Somma
{
	public int somma(int i, int j)
	{
		if(j == 0)
			return i;
		else
		    return somma(i, --j) + 2;
	}
	
	
	
	
	public static void main(String[] args)
	{
		System.out.println(new Somma().somma(0, 5));
	}
	
}
