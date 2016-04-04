package statico;

public class Statica {

	// con static la variabile aggiorna lo stato per ogni ogg creato o modificato.
	private static int x = 0;
	private int number = 0;
	
	public Statica(int number)
	{
		x++;
		this.number=number;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Statica ogg = new Statica(Statica.x);
		System.out.println(Statica.x);
		System.out.println(ogg.number);
		
		Statica ogg1 = new Statica(Statica.x);
		
		
		System.out.println(Statica.x);
		System.out.println(ogg1.number);
		
		
		
	}

}
