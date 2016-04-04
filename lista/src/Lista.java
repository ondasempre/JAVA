import java.lang.String;


public class Lista {

	private String str = "";
	/**
	 * Costruttore di default
	 */
	public Lista()
	{
		
	}
	/**
	 * Costruttore che prende str come parametro.
	 * @param str
	 */
	public Lista(String str)
	{
		this.str = str;
	}
	
	/**
	 * Metodo add che aggiunge in coda.
	 * @param nuova
	 */
	public void add(String nuova)
	{
		
		nuova += ", ";
		str += nuova;

	}
	/**
	 * Metodo che aggiunge in testa.
	 * @param nuova
	 */
	public void addFirst(String nuova)
	{
		nuova += ", ";
		str =  nuova + str;
	}
	/**
	 * Metodo per rimuovere la sottostringa.
	 * @param nuova
	 */
	public void remove(String nuova)
	{
		 nuova += ", ";
		 String str1 = str.replace(nuova, "");
		 str = str1;
	}
	/**
	 * Metodo che ci avverte se la stringa è contenuta nella lista.
	 * @param nuova
	 * @return
	 */
	public boolean contains(String nuova)
	{
		 return str.contains(nuova+",");
	}
	
	public void clear()
	{
		str = "";
	}
	/**
	 * Stampa a video in formato [str1,str2,str3...]
	 */
	public String toString()
	{	
		int index = str.lastIndexOf(',');
		return "[ " + str.substring(0,index)+" ]";
	}
	/**
	 * Metodo per stabilire se le due stringhe sono uguali.
	 * @param nuova
	 * @return
	 */
	public boolean equals(String nuova)
	{
		return str.equals(nuova);
	}
	
	
	public boolean equals(Lista l){
	return	str.equals(l.str);
	
	}
	
	public static void main(String[] args)
	{
		String str = new String("             prova a togliere gli spazi        ");
		String str1 = str.trim();
		System.out.println(str1);
	}
	
	
}
