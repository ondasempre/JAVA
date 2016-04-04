package ricorsione;

public class ListaLinkata
{
	private int k;
	private ListaLinkata succ;
	
	public ListaLinkata(int k)
	{
		this.k = k;
	}
	
	public void aggiungi(int k)
	{
		// Caso base.
		if(succ == null) succ = new ListaLinkata(k);
		else
		{
			ListaLinkata old = succ;
			succ = new ListaLinkata(k);
			succ.succ = old;
		}
	}
	
	public void getValore() { }
	
	
}
