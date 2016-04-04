package ricorsione;

import java.util.ArrayList;
import java.util.List;

public class SommaSottrai
{
	public int sommaSottrai(List<Integer> l)
	{
		return sommaSottrai(l, 0);
	}
	
	private int sommaSottrai(List<Integer> l, int k)
	{
		if (k >= l.size()) return 0;
		
		int val = l.get(k);
		if (!isPari(k)) val = -val;
		return val + sommaSottrai(l, k+1);
	}
	
	private boolean isPari(int k) { return k % 2 == 0; }
	
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(new SommaSottrai().sommaSottrai(l));
	}
}