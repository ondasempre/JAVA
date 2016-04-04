package eccezioni;

import java.util.LinkedList;

public class SequenzaAGradini
{
		private LinkedList<Integer> c;

		public SequenzaAGradini()
		{
			c = new LinkedList<Integer>();
		}
		
		public void add(int x)
		{
			if(c.size() > 0 && (c.get(c.size()-1) - x != -1 && c.get(c.size()-1) - x != 1))
				throw new IllegalArgumentException("Il nuovo elemento è troppo distante per essere inserito nella lista...");
			c.add(x);
		}
		
		public void stampa()
		{
			for(Integer s : c)
			{
				System.out.print(s + " ");
			}
			System.out.println();
		}
		
		public static void main(String[] args)
		{
			SequenzaAGradini scala = new SequenzaAGradini();
			scala.add(4);
			scala.add(5);
			scala.add(4);
			scala.add(5);
			scala.add(6);
			scala.add(12);
			
			scala.stampa();
		}
		
}
