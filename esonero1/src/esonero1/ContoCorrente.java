package esonero1;

public class ContoCorrente
{
	private String nomeCliente;
	private int ID;
	private double importo;
	
	public ContoCorrente(String nomeCliente)
	{
		this.nomeCliente = nomeCliente;
		this.ID = (int)(Math.random()*5555);
		this.importo = 0;
	}
	
	public ContoCorrente(String nomeCliente, double importo)
	{
		this.nomeCliente = nomeCliente;
		this.ID = (int)(Math.random()*5555);
		this.importo = importo;
	}
	
	public void svuota()
	{
		System.out.println(importo);
		importo = 0;
	}
	
	public double getImporto()
	{
		return importo;
	}
	
	public int getIDUtente()
	{
		return ID;
	}
	
	public void preleva(double sommaPrelevata)
	{
		importo -= sommaPrelevata;
	}
	
	public void versa(double sommaVersata)
	{
		importo += sommaVersata;
	}
	
	public double getMax(ContoCorrente k)
	{
		if(importo > k.importo)
			return importo;
		else
			return k.importo;
	}
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ContoCorrente conto1 = new ContoCorrente("FlavioMacciocchi", 10000);
		ContoCorrente conto2 = new ContoCorrente("CristinaLoGiudice", 30000);
		
		System.out.println( conto1.getImporto() + " " + conto1.getIDUtente());
		System.out.println( conto2.getImporto() + " " + conto2.getIDUtente());
		System.out.println(conto1.getMax(conto2));
		
		//double c = (double)"5.2";
		//System.out.println(c);
		
	}

}
