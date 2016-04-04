package esonero1;

public class CampoMinato
{
 	private int N;
 	private int M;
	private Casella[][] campo;
	
	
	public CampoMinato(int N)
	{
		this.N = N;
		setCampo(N);
	}
	
	public CampoMinato(int N, int M)
	{
		this.N = N;
		setCampo(N, M);
	}
	
	public void setCampo(int N)
	{
		campo = new Casella[N][N]; 
	}
	
	public void setCampo(int N, int M)
	{
		campo = new Casella[N][M]; 
	}
	
	public void nuovaTabella()
	{
		for(int i=0; i<campo.length; i++)
		{
			for(int j=0; j<campo.length; j++)
			{
				int k = (int)(Math.random()*2);
				if(k == 1) 
					campo[i][j] = Casella.VUOTA;
				else 
					campo[i][j] = Casella.MINA;
			}
		}
	}
	
	public boolean selezionaCella(int i, int j)
	{
		
		if(campo[i][j] == Casella.VUOTA)
		{
			return true;
		}
		else 
			return false;
	}
	
	
	public void stampaTabella()
	{
		for(int i=0; i<campo.length; i++)
		{
			for(int j=0; j<campo.length; j++)
			{
				if(campo[i][j]  == Casella.MINA)
					System.out.print("|@|");
				else
					System.out.print("|-|");
			}
			System.out.println("\n");
		}
	}
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CampoMinato campo = new CampoMinato(5);
		campo.nuovaTabella();
		campo.stampaTabella();

	}

}
