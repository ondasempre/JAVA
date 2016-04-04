package ricorsione;

import java.util.ArrayList;

public class StringaBaseTreAsterischi
{
	private String stringa;
	private ArrayList<String> lista = new ArrayList<String>();
	
	public StringaBaseTreAsterischi(String stringa)
	{
		this.stringa = stringa;
	}
	
	
	public ArrayList<String> espandi()
	{
		
		lista.add("");
		return  espandi(lista, 0);
	}


	private ArrayList<String> espandi(ArrayList<String> lista, int i)
	{
		
		if(i==stringa.length()) return lista;
		
		if(stringa.charAt(i) != '*')
		{
			ArrayList<String> listaAppUno = new ArrayList<String>();
			for(String s : lista)
				listaAppUno.add( s += stringa.charAt(i) );
			
			return espandi(listaAppUno, i+1);
		}
		
		ArrayList<String> listaAppDue = new ArrayList<String>();
		for(String s : lista)
		{
			listaAppDue.add(s.concat("0"));
			listaAppDue.add(s.concat("1"));
			listaAppDue.add(s.concat("2"));
		}
		
		return espandi(listaAppDue, i+1);
	}
	
	public String toString()
	{
		String str = "";
		for(String s : lista)
			str += s;
		
		return str;
			
	}
	
	
	
	public static void main(String[] args)
	{
		StringaBaseTreAsterischi l1 = new StringaBaseTreAsterischi("1*");
		System.out.println(l1.espandi().toString());
	}
	
}
