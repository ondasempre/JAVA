package esonero3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MemorizzaProprieta
{
	TreeMap<String, String[]> dizionario = new TreeMap<String, String[]>();
	
    public MemorizzaProprieta(File file) throws FileNotFoundException
    {
    	Scanner in = new Scanner(file);
    	
    	while(in.hasNext())
    	{
    		String str = in.nextLine();
    		int index = str.indexOf("=");
    		
    		String proprieta = str.substring(0, index);
    		String valore = str.substring(index+1, str.length());
    		
    		String[] valori = valore.split(",");
    		
    		dizionario.put(proprieta, valori);
    	}
    	
    	in.close();
    }
     
    public String[] get(String key)
    {
    	return dizionario.get(key);
    }
    
    public String getNomePorprieta(String key)
    {
    	return key;
    }
    
    public void put(String proprieta, String valore) throws FileNotFoundException
    {
    	
    	if(valore == null) return;
    	
    	String[] nuova = dizionario.get(proprieta);
    	int len = nuova.length;
    	String[] nuova1 = new String[len+1];
        for(int i=0; i<nuova.length;i++)
        	nuova1[i] = nuova[i];
    	nuova1[len] = valore;
    	if(proprieta == null)
    		throw new FileNotFoundException("Valore non valido");
    	dizionario.put(proprieta, nuova1);
    }
    
	
    public static void main(String[] args) throws FileNotFoundException
	{
    	File file = new File("file.txt");
		MemorizzaProprieta g1 = new MemorizzaProprieta(file);
		
		g1.put("proprieta2", "valore77");
		g1.put("proprieta2", "valore722");
		g1.put("proprieta2", "valore211");
		
		
		String[] array = g1.get("proprieta2");
		
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+ " ");
			
	}
	
}
