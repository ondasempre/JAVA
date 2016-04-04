package ricorsione;

import java.util.HashSet;
import java.util.Set;


/**
 * Esercizio esonero 3/2013
 * 
 * @author navigli
 *
 */
public class StringaGen
{
	public Set<String> genera(String sgen)
	{
		Set<String> stringhe = new HashSet<String>();
		genera(sgen, 0, "", stringhe);
		return stringhe;
	}

	private void genera(String sgen, int k, String s, Set<String> stringhe)
	{
		// caso base
		if (k >= sgen.length())
		{
			stringhe.add(s);
			return;
		}
		
		char c = sgen.charAt(k);
		if (c == '*')
		{
			genera(sgen, k+1, s+"0", stringhe);
			genera(sgen, k+1, s+"1", stringhe);
		}
		else genera(sgen, k+1, s+c, stringhe);
	}
	
	public static void main(String[] args)
	{
		System.out.println(new StringaGen().genera("10*1*"));
	}
}