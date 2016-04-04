package ricorsione;

import java.util.ArrayList;
import java.util.List;

/**
 * Corridoio di un labirinto
 * 
 * @author navigli
 *
 */
public class Corridoio
{
	private String nome;
	private boolean bMino;
	
	private List<Corridoio> uscite = new ArrayList<Corridoio>();
	
	public Corridoio(String nome, boolean bMino)
	{
		this.nome = nome;
		this.bMino = bMino; 
	}
	
	public boolean contieneMinotauro()
	{
		return bMino;
	}
	
	public void addUscita(Corridoio c)
	{
		uscite.add(c);
	}
	
	public List<Corridoio> getUscite()
	{
		return new ArrayList<Corridoio>(uscite);
	}
	
	@Override
	public String toString()
	{
		return nome;
	}
}
