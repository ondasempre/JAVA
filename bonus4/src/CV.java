import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class CV implements Iterable<Pubblicazione>
{
	private Set<Pubblicazione> pubblicazioni = new TreeSet<>();
	private String docente;
	
	public CV(String docente) throws NullPointerException
	{
		if(docente == null)
			throw new NullPointerException("E' stato passato un valore nullo...");
		this.docente = docente;
	}
	/** Aggiunge una pubblicazione alla struttura dati */
	public void aggiungiPubblicazione(Pubblicazione p) throws NullPointerException 
	{
		if(p == null)
			throw new NullPointerException("E' stato passato un valore nullo...");
		pubblicazioni.add(p);
	}
	
	/** Metodo che ritorna il Set popolato dagli autori */
	public Set<String> getAutori()
	{
		Set<String> autori = new HashSet<>();
		for ( Pubblicazione p : pubblicazioni )
			autori.addAll(p.getAutori());
		autori.remove(docente);
		return autori;
	}
	
	public Set<String> getAutoriOrdinati()
	{
		return new TreeSet<String>(getAutori());
	}
	
	@Override
	public Iterator<Pubblicazione> iterator() 
	{
		return pubblicazioni.iterator();
	}
	
}
