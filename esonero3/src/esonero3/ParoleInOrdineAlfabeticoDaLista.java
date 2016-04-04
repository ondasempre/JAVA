package esonero3;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.omg.CORBA.FREE_MEM;

public class ParoleInOrdineAlfabeticoDaLista
{ 
	
	public static void stampaInOrdine(List<String> str)
	{
	
	Map<String, Integer> albero = new HashMap<>();
	
		for(String parola : str)
		{
			Integer frequenza = albero.get(parola);
			if(frequenza == null) frequenza = 0;
		
			albero.put(parola, frequenza+1);
		}
	
		for(String parola : albero.keySet())
			System.out.println(parola + " \t" + albero.get(parola));
	
	}
	
	public static void main(String[] args)
	{
		
		stampaInOrdine( Arrays.asList("oh capitano mio capitano".split(" ")));
		
	
	}
	
}
