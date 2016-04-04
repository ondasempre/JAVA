package esonero1;

public class ContaParola
{
		
	public int conta(String s, String w )
	{
		int count = 0;
		String[] tokens = s.split(" ");
		
		for (int i=0; i< tokens.length; i++)
		{
			if (tokens[i].equals(w)) count++;
		}
		System.out.print("Parole trovate = ");
		return count;
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ContaParola nuova = new ContaParola();
		int ris = nuova.conta("flavio flavio flavio flavio", "flavio");
		
		System.out.print(ris);
		
		

	}

}
