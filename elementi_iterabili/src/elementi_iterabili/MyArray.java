package elementi_iterabili;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyArray implements Iterable<String>
{
	private String a[];
	
	public MyArray(String ... a)
	{
		this.a = a;	
	}

	@Override
	public Iterator<String> iterator()
	{
		return new MyArrayIterator();
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof MyArray)) return false;
		MyArray oggetto = (MyArray)o;
		if(oggetto.a.length != a.length) return false;
		for(int i=0; i < a.length; i++)
			if(! a[i].equals(oggetto.a[i]))
				return false;
		return true;
	}
	
	@Override
	public int hashCode()
	{
		long hash = 0;
		for(int i = 0; i<a.length; i++)
			hash += a[i].hashCode();
		return (int) hash;
	}
	
	public String toString()
	{
		
		StringBuffer bf = new StringBuffer();
		
		String str = "";
		for(int i=0; i<a.length; i++)
		{
			str += a[i] + ", ";
		}
		
		str = str.substring(0, str.length()-2);
		return str;
	}
	
	
	private class MyArrayIterator implements Iterator<String>
	{
		private int current;

		@Override
		public boolean hasNext() { return current < a.length; }

		@Override
		public String next() { return hasNext() ? a[current++] : null; }

		@Override
		public void remove() { }
		
		public void reset() { current = 0; }
		
	}
	
	public static void main(String[] args)
	{
		HashSet<MyArray> a1 = new HashSet<MyArray>();
		
		MyArray str1 = new MyArray("ciao", "core", "bella","core","asta", "siepe",
				"artista", "degno","diritto", "int", "range", "mi", "piace", "il", "dell",
				"supercalifragilistichespiralidoso", "guida galattica per autostoppisti");
		MyArray str2 = new MyArray("ciao", "core", "bella","core","asta", "siepe",
				"artista", "degno","diritto", "int", "range", "mi", "piace", "il", "dell",
				"supercalifragilistichespiralidoso", "guida galattica per autostoppisti");
	
		//a1.add(new MyArray("ciao", "core", "bella"));
		//a1.add(new MyArray("ciao", "core", "bella"));
		
		a1.add(str1);
		a1.add(str2);
		
		System.out.println( (str1.a.hashCode()) != (str2.a.hashCode()) );
		System.out.println(a1);
		
		String s1 = "ciao";
		String s2 = "ciao";
		
		System.out.println(str1.hashCode() + " "+ str2.hashCode()); 
	
	}
}
