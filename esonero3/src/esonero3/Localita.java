package esonero3;

public class Localita
{
	private String localita;
	private double longitudine;
	private double latitudine;
	
	public Localita(String localita, double longitudine, double latitudine)
	{
		this.localita = localita;
		this.longitudine = longitudine;
		this.latitudine = latitudine;
	}


	public String getLocalita()
	{
		return localita;
	}


	public void setLocalita(String localita)
	{
		this.localita = localita;
	}


	public double getLongitudine()
	{
		return longitudine;
	}


	public void setLongitudine(int longitudine)
	{
		this.longitudine = longitudine;
	}


	public double getLatitudine()
	{
		return latitudine;
	}


	public void setLatitudine(int latitudine)
	{
		this.latitudine = latitudine;
	}
	
	
	
	
}
