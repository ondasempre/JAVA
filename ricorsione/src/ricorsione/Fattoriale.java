package ricorsione;

public class Fattoriale
{
	
	public int fattoriale(int i)
	{
		int fattoriale;
		if(i == 0)
			fattoriale = 1;
		else
			fattoriale = i * fattoriale(i-1);
		return fattoriale;
	}
	
	public static void main(String[] args)
	{
		Fattoriale fatt = new Fattoriale();
		System.out.println(fatt.fattoriale(10));
	}
	
	

}
