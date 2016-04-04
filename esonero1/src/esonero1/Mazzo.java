package esonero1;

public class Mazzo 
{
	private Carta[] mazzo = new Carta[52];
	
	public Mazzo()
	{
		int c = 0;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=13; j++)
			{
				mazzo[c] = new Carta(i, j);
				c++;
			}
		}
	}
	/**
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		
			for (int j=0; j < 13; j++) 
			{
				for (int i = 0; i < 4; i++) 
				{
					sb.append(mazzo[j + 13 * i].toString() + "\t\t");
				}
				sb.append("\n");
		}
			
		return sb.toString();
		}
	*/
	
	public String toString()
	{
		String str = "";
		for (int j = 0; j < 13; j++)  
		{
			for  (int i=0; i < 4; i++)
			{
				str += (mazzo[j].toString() + "  \t");
			}
			str += "\t\t\n";
			
		}
		
		return str;
	}
	
		public static void main(String[] args)
		{
			Mazzo m = new Mazzo();
			System.out.println(m.toString());
		}
		
}

