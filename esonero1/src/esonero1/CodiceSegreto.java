package esonero1;

public class CodiceSegreto
{
	private String str = "";
	
	public CodiceSegreto(String str)
	{
		this.str = str;
	}
	
	public void nascondi(char a)
	{
		str = str.replace(a, '*');
	}
	
	public void cesare(int k)
	{
		String s = "";
		String[] token = str.split("");
		for(int i=0; i < token.length; i++)
		{
			if(token[i] != "*")
			{
				token[i] += k;
			}
			s += token[i];
		}
		str = s;
		
	}
	
	public String toString()
	{
		return str;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CodiceSegreto ogg = new CodiceSegreto("abaco");
		ogg.nascondi('a');
		ogg.cesare(5);
		System.out.println(ogg.toString());
		
		double c = 'a';
		System.out.println(c);
		
	}

}
