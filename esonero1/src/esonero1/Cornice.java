package esonero1;

public class Cornice
{
	private String str; 
	
	public Cornice(String str)
	{
		this.str = str;
	}
	
	
	public String getStr()
	{
		return str;
	}
	
	
	public void creaStringa(int n, String s)
	{
		int pos = -1;
		for(int i=0; i<n; i++)
		{
			for(int k=0; k<n; k++)
			{
				if(i==0 || i==n-1 || k == 0 || k == n-1 )
					System.out.print("*");
				else
				{
					pos++;
						System.out.print( pos < s.length() ? s.charAt(pos) : " ");
				}
			}
			System.out.println();
		}
	}
	
	public void creaCornice(int n)
	{
		int pos = -1;
		for(int i=0; i<n; i++)
		{
			pos = 0;
			for(int k=0; k<n; k++)
			{
				if(i==0 || i==n-1 || k == 0 || k == n-1 )
					System.out.print("*");
				else
				{
					System.out.print(pos < n ? " " : "*");
					pos++;
				}
			}
			System.out.println();
		}
			
			
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String nuova = "Cornici in Java"; 
		
		Cornice c = new Cornice(nuova);
		c.creaStringa(6, nuova);
		System.out.println();
		System.out.println();
		c.creaCornice(6);
		
		
		
	}

}
