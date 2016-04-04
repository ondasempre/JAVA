package elementi_iterabili;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Es. 1: Rendere ordinabile per titolo la classe Pubblicazione
 * Es. 2: Rendere ordinabile anche per numero di citazioni la classe Pubblicazione
 * 	Es. 2a: usando una classe annidata non interna
 * 	Es. 2b: usando una classe esterna
 * 	Es. 2c: usando una classe anonima
 * Es. 3: Rendere iterabile l'elenco degli autori della pubblicazione
 * 
 * @author navigli
 *
 */
public class Pubblicazione implements Comparable<Pubblicazione>, Iterable<Autore>
{
	/**
	 * Autori della pubblicazione
	 */
	private Set<Autore> autori = new HashSet<Autore>();
	
	/**
	 * Titolo della pubblicazione
	 */
	private String titolo;
	
	/**
	 * Numero di citazioni
	 */
	private int numeroCitazioni;
	
	public Pubblicazione(String titolo, int numeroCitazioni, Autore... autori)
	{
		this.titolo = titolo;
		this.numeroCitazioni = numeroCitazioni;
		for (Autore a : autori) this.autori.add(a);
	}
	
	@Override
	public Iterator<Autore> iterator()
	{
		return autori.iterator();
	}
	
	@Override
	public int compareTo(Pubblicazione p)
	{
		return titolo.compareTo(p.titolo);
	}

	@Override
	public String toString()
	{
		return titolo;
	}
	
	/**
	 * Comparator di {@link Pubblicazione} sulla base del loro numero di citazioni
	 * 
	 * @author navigli
	 *
	 */
	static public class PubblicazioneComparator implements Comparator<Pubblicazione>
	{
		public int compare(Pubblicazione p1, Pubblicazione p2)
		{
			return p1.numeroCitazioni-p2.numeroCitazioni;
		}
	}
	
	public static void main(String[] args)
	{
		List<Pubblicazione> l = new ArrayList<Pubblicazione>();
		l.add(new Pubblicazione("a", 4));
		l.add(new Pubblicazione("b", 42));
		l.add(new Pubblicazione("c", 451));
		l.add(new Pubblicazione("d", 1984));
		l.add(new Pubblicazione("e", 13));
		
		//System.out.println(l);

		Collections.sort(l);
		System.out.println("Sort: " + l);
		
		Collections.sort(l, new PubblicazioneComparator());
		System.out.println("Comparetor Citaz: " + l);
		
		Collections.sort(l, new Comparator<Pubblicazione>()
				{
					public int compare(Pubblicazione p1, Pubblicazione p2)
					{
						return p1.numeroCitazioni-p2.numeroCitazioni;
					}
				});
		
		System.out.println("Comparetor Fly: " + l);
		
		
		Pubblicazione pu = new Pubblicazione("opera1", 5, new Autore("a"), new Autore("b"), new Autore("c"));

		//Come iterare su elementi "iterabili con for-each"
		for (Autore a : pu)
			System.out.print(a.getNome());
		
		System.out.println();
		
		//Come iterare su elementi "iterabili con metodi di Iterator<>
		Iterator<Autore> i = pu.iterator();
		while(i.hasNext()) 
		{
			Autore a = i.next();
			System.out.print(a);
		}
	}
}
