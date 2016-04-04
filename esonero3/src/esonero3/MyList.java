package esonero3;

import java.util.Iterator;

/** Classe Lista itarabile */
public class MyList implements Iterable<Integer>
{
	private Elemento first;

	public MyList(int...interi) { for(int k : interi) first = new Elemento(k, first); }
	
	@Override
	public Iterator<Integer> iterator()
	{
		return new MyListIterator();
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof MyList)) return false;
		MyList oggetto = (MyList)o;
		if(oggetto.first != first ) return false;
		Iterator e = oggetto.iterator();
		while(e.hasNext())
		{
			if(! first.equals(oggetto.first))
				return false;
		}
		return true;
	}
	
	@Override
	public int hashCode()
	{
		long hash = 0;
//		for(int i = 0; i<a.length; i++)
//			hash += a[i].hashCode();
		return (int) hash;
	}
	
	
	/** Classe Iterator */
	public class MyListIterator implements Iterator<Integer>
	{
		private Elemento current = first;

		@Override
		public boolean hasNext()
		{
			return current != null;
		}

		@Override
		public Integer next()
		{
			if(current == null)
				return null;
			int val = current.getVal();
			current = current.getNext();
			
			return val;
		}

		@Override
		public void remove()
		{
			
		}
		
	}
	
	/** Singolo Elemento */
	private class Elemento 
	{
		private int val;
		private Elemento next;
		
		public Elemento(int val, Elemento next)
		{
			this.val = val;
			this.next = next;
		}
		
		public int getVal() { return val; }
		public Elemento getNext() { return next; }
		public void setNext(Elemento next) { this.next = next; }
		
	}
	
	public static void main(String[] args)
	{
		MyList l1 = new MyList(1,2,3,4,5);
		
		for(int i : l1)
			System.out.print(i + " ");
	}

}
