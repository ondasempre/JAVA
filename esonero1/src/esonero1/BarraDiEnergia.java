package esonero1;

public class BarraDiEnergia
{
	private double energia;
	
	public BarraDiEnergia()
	{
		this.energia = 1;
	}
	
	public BarraDiEnergia(double energia)
	{
		if(energia >= 0 && energia <= 1)
			this.energia = energia;
		else
			this.energia = 1;
	}
	
	public void incremetaEnergia(BarraDiEnergia k)
	{
		if(k.isPiena())
		{
			this.energia = 1;
		}
		else if(energia == 1)
			this.energia = 1;
		else
		{
			energia += k.getEnergia();
		}
	}
	
	public double getEnergia()
	{
		return energia;
	}
	
	public boolean isPiena()
	{
		if(energia==1)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		String s = "";
		int x = (int)(energia*10);
		for(int i=0; i<x; i++)
		{
			s += "*";
		}
		return s;
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BarraDiEnergia ogg = new BarraDiEnergia(-0.3);
		System.out.println(ogg.toString());
		
		int c = (char)97;
		System.out.println(c);
		String s = "" + 'c';
		System.out.println(s);
		int k,
		j=5;
	
	}

}
