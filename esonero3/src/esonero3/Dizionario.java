package esonero3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;

public class Dizionario
{
	/** Struttura dizionario con chiave + set */
	private TreeMap<String, Set<String>> dizionario = new TreeMap<String, Set<String>>();
	private String str1;
	private String str2;
	
	public Dizionario(File file) throws FileNotFoundException
	{
		Scanner in = new Scanner(file);
		
		PrintWriter out = new PrintWriter("file1.txt");
		//in.useDelimiter("\t|\n");
		
		while(in.hasNext())
		{
			str1 = in.next();
			str2 = in.next();
			
			out.println(str1 + " " + str2);
		
			if(! dizionario.containsKey(str1))
			{
				TreeSet<String> x = new TreeSet<String>();
				
				x.add(str2);
				dizionario.put(str1, x );
			}
			
			else
			{
				dizionario.get(str1).add(str2);
			}
			
		}
		in.close();
		out.close();
		
		
	}
	
	public String toString()
	{
		return dizionario.toString();
	}
	
	
	public String getX(String str)
	{
		String x = dizionario.get(str).toString();
		x = x.replaceAll("\n", "");
		return str+": "+ x;
	}

	
	public static void main(String[] args) throws FileNotFoundException
	{
		
		File file = new File("mio_testo.txt");
		Dizionario dizionario = new Dizionario(file);
		
		System.out.println(dizionario.getX("banca"));
		System.out.println(dizionario.toString());
	
	}
}
