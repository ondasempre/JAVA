package bonus2;

import java.lang.String;
/**
 * Classe Bonus2
 * @author Flavio Macciocchi
 *
 */
public class Bonus2
{
	private String[] str;
	/**
	 * Costruttore default
	 */
	public Bonus2()
	{
		
	}
	/**
	 * Costruttore di supporto per settare l'array di strighe.
	 * @param str stringa passata al costruttore
	 */
	public Bonus2(String[] str)
	{
		this.str = str;
	}
	/**
	 * Metodo per cercare una stringa all'interno dell'array.
	 * Ritorna l'indice della posizione trovata.
	 * @param str array di stringhe
	 * @param s stringa di verifica
	 */
	public int cerca(String[] str, String s)
	{
		if(s == null) return -1;
		for(int i= 0; i < str.length; i++)
		{
			if(str[i].equals(s))
				return i;
		}
		return -1;
	}
	/**
	 * Metodo che sostituisce una parola con un'altra.
	 * @param str array di stringhe con n parole
	 * @param s stringa da sostituire
	 * @param z nuova stringa
	 * @return
	 */
	public String[] sostituisci(String[] str, String s, String z) 
	{
		String nuova;
		
		if (s != null || z != null)
		{
			for( int i=0; i < str.length; i++ )
			{
				if(str[i].equals(s))
				{
					nuova = str[i].replace(s, z);
					str[i] = nuova;
				}
			}
		}
		return str;
	}
	/**
	 * fattoriale
	 * @param n 
	 * @return
	 */
	public int fatt(int n)
	{
		if (n < 0)
			return Integer.MIN_VALUE;
			
		else if(n == 0)
			return 1;
		
		int ris = 1;
		while (n != 0)
		{
			ris = ris * n;
			n = n-1;
		}
		return ris;
	}
	/**
	 * Numero occorrenze trovate.
	 * @param str stringa nella quale cercare il carattere
	 * @param c carattere da cercare
	 * @return
	 */
	public int numeroCaratteri(String str, char c)
	{
		int count = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == c)
			{
				count++;
			}	
		}
		return count;
	}
	/**
	 * Moltiplica i valori dall'indice k a j.
	 * @param str array di stringhe dove cercare
	 * @param k indice di partenza
	 * @param j indice dove fermarsi
	 * @return
	 */
	public int moltiplica(String[] str, int k, int j)
	{
		int len = str.length;
		int pro = 1;
		if(k <= len || k >= 0 || j <= len || j >= 0  )
		{
			for(int i=k; i<=j; i++)
			{
				pro *= Integer.parseInt(str[i]); 
			}
			return pro;
		}
		return -1;
	}
	
	/**
	 * Metodo che conta le occorrenze della frase.
	 * @param frase stringa nella quale cercare le copie
	 * @param s stringa cercata
	 * @return
	 */
	public int contaStringhe(String frase, String s) 
	{
		if(s == null || frase == null) return -1;
		int count = 0;
		String[] token = frase.split(" ");
	
		for(int i=0; i<token.length;i++)
		{
			if(token[i].equals(s))
			{
				count++;
			}
		}
		return count;
	}
	/**
	 * Somma i valori delle posizioni dispari e ne ritorna
	 * il valore calcolato.
	 * @param str array di Stringhe 
	 * @return
	 */
	public double sommaDispari(String[] str)
	{
		double somma = 0;
		
		for(int i=1; i<str.length; i+=2)
		{
			somma += Double.parseDouble(str[i]);
		}
		return somma;
	}
	/**
	 * Tavola pitagorica.
	 * @param terna
	 * @param N
	 */
	public void setPitagorica(int[][] terna, int N)
	{
		if(N == 0) return;
		for(int i=0; i<N; ++i)
		{
			for(int j=0; j<N; ++j)
			{
				terna[i][j] = (i+1)*(j+1);
			}
		}
	}
	/**
	 * Trova i numeri divisibili per j.
	 * @param k lunghezza array booleano
	 * @param j divisore
	 * @return
	 */
	public boolean[] getDivisibili(int k, int j)
	{
		boolean[] bool = new boolean[k];
		
		for(int i=0; i<bool.length; i++)
		{
			if(i%j == 0) 
			{
				bool[i] = true;
			}
			else
				bool[i] = false;
		}
		return bool;
	}
}
