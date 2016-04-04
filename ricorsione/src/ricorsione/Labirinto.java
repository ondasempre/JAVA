package ricorsione;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Labirinto con filo di Arianna
 * 
 * @author navigli
 *
 */
public class Labirinto
{
	/**
	 * Corridoio di partenza
	 */
	private Corridoio ingresso;
	
	public Labirinto(Corridoio ingresso)
	{
		this.ingresso = ingresso;
	}
	
	/**
	 * Esplora ricorsivamente l'intero labirinto in cerca del Minotauro
	 */
	public void esplora()
	{
		esplora(ingresso, new HashSet<Corridoio>(), new Stack<Corridoio>());
	}
	
	private boolean esplora(Corridoio c, Set<Corridoio> visitati, Stack<Corridoio> filoDiArianna)
	{
		if (visitati.contains(c)) return false;
		visitati.add(c);

		filoDiArianna.push(c);
		
		System.out.println(c);
		if (c.contieneMinotauro())
		{
			System.out.println("A noi due, mostro!");
			System.out.println(filoDiArianna);
			return true;
		}
		
		for (Corridoio d : c.getUscite()) if (esplora(d, visitati, filoDiArianna)) return true;
		
		filoDiArianna.pop();
		return false;
	}
	
	public static void main(String[] args)
	{
		Corridoio c1 = new Corridoio("c1", false);
		Corridoio c2 = new Corridoio("c2", false);
		Corridoio c3 = new Corridoio("c3", false);
		Corridoio c4 = new Corridoio("c4", false);
		Corridoio c5 = new Corridoio("c5", false);
		Corridoio c6 = new Corridoio("c6", false);
		Corridoio c7 = new Corridoio("c7", false);
		Corridoio c8 = new Corridoio("c8", false);
		Corridoio c9 = new Corridoio("c9", false);
		Corridoio c10 = new Corridoio("c10", true);
		
		
		c1.addUscita(c2);
		c1.addUscita(c3);
		c2.addUscita(c4);
		c3.addUscita(c5);
		c5.addUscita(c6);
		c6.addUscita(c7);
		c7.addUscita(c8);
		c8.addUscita(c9);
		c9.addUscita(c10);
		
		new Labirinto(c1).esplora();
	}
}
