package esonero3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Coppie
{
	private TreeMap<Integer,TreeSet<Integer>> coppie = new TreeMap<Integer,TreeSet<Integer>>();
	private Integer x;
	private Integer y;
	
	public Coppie(File file) throws FileNotFoundException
	{
		Scanner in = new Scanner(file);
		
		while(in.hasNext())
		{
			String s = in.nextLine();
			int index = s.indexOf(",");
			
			x = Integer.parseInt(s.substring(0, index));
			y = Integer.parseInt(s.substring(index+1, s.length()) );
			
			if(! coppie.containsKey(x))
			{
				TreeSet<Integer> values = new TreeSet<Integer>();
				values.add(y);
				coppie.put(x, values);
			}
			else
			{
				coppie.get(x).add(y);
			}
			
		}
		in.close();
	}
	
	public TreeSet<Integer> getX(Integer x)
	{
		
		return coppie.get(x);
	}
	
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		
		Set e = coppie.entrySet();
		Iterator itr = e.iterator();
		
		while(itr.hasNext())
		{
			sb.append(itr.next());
		}
		
		return sb.toString();
	}
	

	
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("coppie.txt");
		Coppie c1 = new Coppie(file); 
		
		System.out.println(c1);
		System.out.println(c1.getX(12));
	}
	
	
}
