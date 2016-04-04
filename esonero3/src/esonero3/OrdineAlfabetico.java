package esonero3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdineAlfabetico
{
	private String testo;
	// Struttura TreeMap non contiene ripetizioni e mantiene ordinamento naturale.
	TreeSet<String> albero = new TreeSet<String>();
	// Struttura List, mantiene l'odinemanto secondo l'inserimento.
	List<String> inserimento = new ArrayList<String>();
	
	
	public OrdineAlfabetico(String testo)
	{
		this.testo = testo;
		albero.addAll(Arrays.asList(testo.split(" ")));
		inserimento.addAll(Arrays.asList(testo.split(" ")));
	}
	
	public void stampaOrdineAlfabetico()
	{
		System.out.println(albero);
	}
	
	public void stampaInOrdineDiInserimento()
	{
		System.out.println(inserimento);
	}
	
	

	public static void main(String[] args)
	{
		new OrdineAlfabetico("Matrix è ovunque, è intorno a noi. Anche adesso nella stanza in cui siamo.").stampaOrdineAlfabetico();
		new OrdineAlfabetico("Matrix è ovunque, è intorno a noi. Anche adesso nella stanza in cui siamo.").stampaInOrdineDiInserimento();
	}

}
