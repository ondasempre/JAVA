package esonero1;

/**
 * Enumerazioni
 * @author ondasempre
 *
 */
public enum Casella
{
	MINA(1), VUOTA(0);
	
	private int CELLA;
	
	Casella(int CELLA)
	{
		this.CELLA = CELLA; 
	}
	
	public int toInt() { return this.CELLA; }
	
}
