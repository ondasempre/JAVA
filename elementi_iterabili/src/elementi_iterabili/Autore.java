package elementi_iterabili;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

/**
 * Es. 0) Creare una classe Autore i cui oggetti memorizzano l'elenco delle pubblicazioni e il nome dell'autore
 * Es. 1) Inserire 4 diversi autori (di cui due con lo stesso nome) in un HashSet e commentare su cosa succede
 * Es. 2) Risolvere il problema di mancato confronto tra autori "uguali" implementando hashCode e equals
 * Es. 3) Implementare un Comparator anonimo da passare in input al TreeSet per permettere l'ordinamento dei 4 autori secondo il loro nome
 * 
 * @author navigli
 *
 */
public class Autore
{
	/**
	 * Elenco delle pubblicazioni
	 */
	private List<Pubblicazione> pubs = new ArrayList<Pubblicazione>();
	
	/**
	 * Nome dell'autore
	 */
	private String nome;
	
	public Autore(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome() { return nome; }
	
	@Override
	public String toString()
	{
		return nome;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof Autore)) return false;
		Autore a = (Autore)o;
		return nome.equals(a.nome);
	}
	
	@Override
	public int hashCode()
	{
		return nome.hashCode();
	}
	
	public static void main(String[] args)
	{
		Set<Autore> autori = new HashSet<Autore>();
		autori.add(new Autore("ccc"));
		autori.add(new Autore("aaa"));
		autori.add(new Autore("bbb"));
		autori.add(new Autore("aaa"));
		System.out.println("Dall'HashSet: "+autori);
		
		TreeSet<Autore> autoriOrdinati = new TreeSet<Autore>(new Comparator<Autore>()
				{
					public int compare(Autore a, Autore b)
					{
						return a.nome.compareTo(b.nome);
					}
				});
		autoriOrdinati.addAll(autori);
		System.out.println("Dal TreeSet: "+autoriOrdinati);
	}
}
