package esonero3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class CoppieComparabili implements Comparable<CoppieComparabili>
{

	private Integer x;
	private Integer y;
	
	public CoppieComparabili(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(CoppieComparabili o)
	{
		int tmp = x.compareTo(o.x);
		if(tmp == 0)
			return y.compareTo(o.y);  
		return tmp;
	}
	
	@Override
	public String toString()
	{
		String str = "";
		str += "("+x + ", " + y+")";
		
		return str;	
	}

	public static void main(String[] args)
	{
		TreeSet<CoppieComparabili> l = new TreeSet<CoppieComparabili>();
		
		CoppieComparabili c1 = new CoppieComparabili(12, 122);
		CoppieComparabili c2 = new CoppieComparabili(113, 32);
		CoppieComparabili c3 = new CoppieComparabili(9, 23);
		CoppieComparabili c4 = new CoppieComparabili(9, 11);
		
		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);
		
		System.out.println(l);
		
	}
}
