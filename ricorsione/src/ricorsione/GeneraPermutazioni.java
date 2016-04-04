package ricorsione;

import java.util.ArrayList;


public class GeneraPermutazioni
{
	
	private String parola;
	
	public GeneraPermutazioni(String parola)
	{
		this.parola = parola;
	}

	public ArrayList<String> getPermutazioni()
	{
		
		ArrayList<String> permutazioni = new ArrayList<>();
		
		// Caso base..
		if(parola.length() == 0)
		{
			permutazioni.add(parola);
			return permutazioni;
		}
		
		for(int i=0; i<parola.length(); i++)
		{
			String parolaPiuBreve = parola.substring(0, i) + parola.substring(i+1);
		
			ArrayList<String> permutazioniGenerate = new GeneraPermutazioni(parolaPiuBreve).getPermutazioni();
			
			for(String s : permutazioniGenerate)
				permutazioni.add(parola.charAt(i)+s);
		
		}
			
		return permutazioni;		
	}
	
	
	@Override
	public String toString()
	{
		return parola;
	}
	
	public static void main(String[] args)
	{
		String abc = "abc";
		GeneraPermutazioni nuovaG = new GeneraPermutazioni(abc);
		
		//System.out.println(nuovaG.getPermutazioni().toArray());
		System.out.println(nuovaG.getPermutazioni());
		
	}
	
}
