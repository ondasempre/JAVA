package localita;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class GestioneLocalita
{
	private TreeSet<Localita> localita = new TreeSet<Localita>();
	private String tmp0;
	private String[] tmp1;
	
	public GestioneLocalita(File f) throws FileNotFoundException
	{
		Scanner in = new Scanner(f);
		//in.useDelimiter("\t|\t|\n");
		
		while(in.hasNext())
		{
			tmp0 = in.nextLine();
			tmp1 = tmp0.split(" ");
			
			localita.add(new Localita(tmp1[0].toUpperCase(), Double.parseDouble(tmp1[1]), Double.parseDouble(tmp1[2]) ));
		}
		in.close();
	}
	
	public TreeSet<String> estrai(double lat1,double lat2,double long1,double long2)
	{
		TreeSet<String> estratte = new TreeSet<String>();
		
		for(Localita l: localita)
		{
			if(l.getLat() >= lat2 && l.getLat() <= lat1 && l.getLongi() >= long2 && l.getLongi() <= long1 )
				estratte.add(l.getNome());
		}
		
		return estratte;
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("localita.txt");
		GestioneLocalita j = new GestioneLocalita(file);
		
		System.out.println(j.localita);
		System.out.println(j.estrai(50, 0, 50, 0));
	}
}
