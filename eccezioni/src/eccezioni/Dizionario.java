package eccezioni;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Vector; 
/**
 * Classe Dizionario.
 * 
 * @author ondasempre@gmail.com
 *
 * @param <K>
 * @param <E>
 */
public class Dizionario<K,E>
{
	private Vector<E> Elements;
	private Vector<K> Keys;

	private HashMap<String , Integer> mappa = new HashMap<>();
	
	
	public Dizionario()
	{
		Keys = new Vector<>();
		Elements = new Vector<>();
	}
	
	public E search(K k) throws FileNotFoundException
	{
		// Indice dell'oggetto.
		int i = Keys.indexOf(k);
		if(i == -1)
			throw new FileNotFoundException("Elemento non trovato...");
		
		return Elements.elementAt(i); 
	}
	
	/**
	 * Aggiungi elemento e chiave alle strutture dati.
	 * 
	 * @param k
	 * @param e
	 * @throws ElementNotFoundException
	 */
	public void add(K k, E e) throws ElementNotFoundException
	{
		int i = Keys.indexOf(k);
		if(i != -1)
			throw new ElementNotFoundException();
		
		Keys.add(k);
		Elements.addElement(e);
	}
	/**
	 * Rimuove l'elemento con chiave k e lo ritorna per una eventuale verifica.
	 * 
	 * @param k
	 * @return
	 * @throws FileNotFoundException
	 */
	public E delete(K k) throws FileNotFoundException
	{
		int i = Keys.indexOf(k);
		if(i == -1)
			throw new FileNotFoundException("Chiave non trovata...");
		
		E elem = Elements.elementAt(i);
		
		Keys.removeElementAt(i);
		Elements.removeElementAt(i);
		
		return elem;
	}
	
	public int size()
	{
		return Keys.size();
	}
	
}
