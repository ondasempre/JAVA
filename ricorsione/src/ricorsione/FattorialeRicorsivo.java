package ricorsione;

public class FattorialeRicorsivo
{

	public double fattoriale(double n)
	{
		if(n==0) return 1;
		return n*fattoriale(n-1);
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(new FattorialeRicorsivo().fattoriale(64));
	}
	
	
}
