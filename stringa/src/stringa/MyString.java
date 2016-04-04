package stringa;

public class MyString
{
	private String str = "";
	/**
	 * 
	 */
	public MyString()
	{
		
	}
	/**
	 * 
	 * @param str
	 */
	public MyString(String str)
	{
		this.str = str;
	}
	/**
	 * 
	 */
	public void svuota()
	{
		this.str = "";
	}
	/**
	 * 
	 * @param k
	 */
	public void moltiplica(int k)
	{
		String tmp = str;
		
		for(int i=1; i<k; i++)
		{
			str += tmp;
		}
	}
	/**
	 * 
	 * @return
	 */
	public int getLength()
	{
		return str.length();
	}
	/**
	 * 
	 * @param s
	 */
	public void concatena(String s)
	{
		this.str += s;
	}
	
	
	
	
	public String toString()
	{
		return "[ " + str + " ]";
	}
	
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyString stringa = new MyString("ciao");
		System.out.println(stringa.toString());
	    //stringa.svuota();
	    //System.out.println("Stringa vuota: " + stringa.toString());
	    stringa.moltiplica(5);
	    System.out.println(stringa.toString());
	    System.out.println("Lunghezza stringa: " + stringa.getLength());
	    
	    MyString nuova = new MyString("IlMioNome: ");
	    nuova.concatena("Flavio");
	    System.out.println(nuova.toString());
	    
	    
	    
	    
	}

}
