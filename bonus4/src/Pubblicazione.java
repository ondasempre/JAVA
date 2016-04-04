import java.util.Set;
import java.util.HashSet;

public class Pubblicazione implements Comparable<Pubblicazione>
{
	private Set<String> autori = new HashSet<>();
	private String titolo;
	private int citazioni;
	
	public Pubblicazione(String titoloOpera, int citazioniOttenute, String... autori)
	{
		this.titolo = titoloOpera;
		this.citazioni = citazioniOttenute;
		for (String autore : autori)
			this.autori.add(autore);
	}
	
	public Set<String> getAutori()
	{
		return autori;
	}

	public String getTitolo()
	{
		return titolo;
	}
	
	public int getCitazioni()
	{
		return citazioni;
	}
	
	@Override
	public int compareTo(Pubblicazione pub) 
	{
		int valore = Integer.compare(pub.citazioni, this.citazioni);
		return ( valore == 0 ? this.titolo.compareTo(pub.titolo) : valore );
	}
}
