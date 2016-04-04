package eccezioni;

public class TavoloDiGioco
{

	public enum Seme
	{
		DENARI,
		COPPE,
		BASTONI,
		SPADE;
	}
	
    public static void main(String[] args)
	{
		try
		{
			Integer num = Integer.parseInt("2");
			Seme denari = Seme.valueOf("DENARE");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Valore non esistente...");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Seme non esistente...");
		}
		
	}
	
	
	
}
