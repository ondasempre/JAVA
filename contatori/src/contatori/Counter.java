package contatori;

public class Counter
{
	
	static private int contatore;
	
	public Counter()
	{
		contatore++;
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new Counter();
		new Counter();
		//System.out.println("Numero di istanze create fin ora: " + contatore);
		
		int intero = 51;
		char c = (char)intero;
		System.out.println(c);
		
		char a = '3';
		if(Character.isDigit(c))
			System.out.println("E' un numero...");
		
	}

}
