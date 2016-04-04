package esonero1;

public class CarattereCentrale
{
	private String str = "";
	
	public CarattereCentrale(String str)
	{
		// TODO Auto-generated constructor stub
		this.str = str;
		
	}
	
	public String estraiCarattereCentrale()
	{
		int len = str.length();
		int posizione = 0;
		/**
		 * dispari
		 */
		if( (len % 2) == 1)
		{			
			posizione = len/2;
			len = 1;
			System.out.print("Dispari: ");
		}
		/**
		 * pari
		 */
		else 
		{
			posizione = (len/2)-1;
			len = 2;
			System.out.print("Pari: ");
		}
		
		return str.substring(posizione, posizione+len);
		
	}
	
	public String toString()
	{
		return "[ " + str + " ]";
	}
	
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CarattereCentrale ogg1 = new CarattereCentrale("beota");
		CarattereCentrale ogg2 = new CarattereCentrale("favoloso");
		System.out.println(ogg1.estraiCarattereCentrale());
		System.out.println(ogg2.estraiCarattereCentrale());
		
	}

}
