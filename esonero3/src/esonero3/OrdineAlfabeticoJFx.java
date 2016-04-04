package esonero3;

import java.util.TreeMap;

public class OrdineAlfabeticoJFx
{
	
	private TreeMap<String, Integer> mappa = new TreeMap<String, Integer>();
	
	public void ordineAlfabetico(String s)
	{
		
		Integer freq = 0;
		
		String[] str = s.toLowerCase().split(" ");
		
		for(int i=0; i<str.length; i++)
		{
			if(!mappa.containsKey(str[i]))
				mappa.put(str[i], 1);
			else
				mappa.put(str[i], mappa.get(str[i])+1 );
		}
	}
	
	
	public static void main(String[] args)
	{
		OrdineAlfabeticoJFx c1 = new OrdineAlfabeticoJFx();
		c1.ordineAlfabetico("Capitano oh mio capitano");
		System.out.println(c1.mappa);
	
	}
	
}
	
