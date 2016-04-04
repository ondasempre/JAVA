package esonero3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Valori
{
    private HashMap<ParametriValidi, Integer> mappa = new HashMap<ParametriValidi, Integer>();
    private String[] strArray;
    private String str;
    
    public enum ParametriValidi
    {
        LUNGHEZZA, ALTEZZA, PESO, FORZA, ENERGIA, SCUDO;
    }
   
    public Valori(File f) throws FileNotFoundException
    {
        Scanner in = new Scanner(f);
         //in.useDelimiter("\t|\n");
         while(in.hasNext())
         {
        	 str = in.nextLine();
        	 strArray = str.split(" ");
        	 
        	 mappa.put(ParametriValidi.valueOf(strArray[0]), Integer.parseInt(strArray[1]));
         }
         in.close();
    }
    
    public Integer get(ParametriValidi val)
    {
    	if(mappa.containsKey(val))
    		return mappa.get(val);
    	return null;
    }
    
    public String toString()
    {
    	StringBuffer sb = new StringBuffer();
    	
    	Set<ParametriValidi> e = mappa.keySet();
    	
    	Iterator itr = e.iterator();
    	
    	while(itr.hasNext())
    	{
    		ParametriValidi tmp = (ParametriValidi) itr.next();
    		sb.append(tmp + " " + mappa.get(tmp) + "\n");
    	}
    	
    	return sb.toString();
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        Valori v = new Valori(new File("valori.txt"));
        System.out.println(v.mappa);
        System.out.println();
        System.out.println(v.get( ParametriValidi.valueOf("FORZA") ));
        System.out.println();
        System.out.println(v);
       
    }
}