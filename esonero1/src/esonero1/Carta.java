package esonero1;

import java.util.Arrays;

public class Carta
{
	private int seme;
	private int valore;
	
	public Carta(int seme, int valore)
	{
		this.seme = seme;
		this.valore = valore;
	}
	
	public String getSeme()
	{
		switch(seme)
		{
			case 1: return "Cuori";
			case 2: return "Quadri";
			case 3: return "Fiori";
			case 4: return "Picche";
			default: return "";
		}
	}
	
	public String getValore()
	{
		if(valore==1 || valore > 10 )
		{
			switch(valore)
			{
				case 1: return "Asso";
				case 11: return "Jack";
				case 12: return "Regina";
				case 13: return "Re";
				default: return "";
			}
		}
		else
			return (""+valore);
	}
	
	public String toString()
	{
		return ( "[ " + getValore() + " di " + getSeme() + " ]");
	}
}
