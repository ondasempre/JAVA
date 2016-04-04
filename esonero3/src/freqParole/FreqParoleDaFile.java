package freqParole;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class FreqParoleDaFile 
{
	private LinkedHashMap<String, Integer> mappa = new LinkedHashMap<String, Integer>();
	
	
	public FreqParoleDaFile(File file) throws FileNotFoundException
	{
		Scanner in = new Scanner(file);
		
		
		while(in.hasNext())
		{
			String parola = in.next();
			Integer freq = mappa.get(parola);
			if(freq == null) mappa.put(parola, 1);
			else mappa.put(parola, freq+1);
		}
		in.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		
		File f = new File("parole.txt");
		FreqParoleDaFile p = new FreqParoleDaFile(f);
		
		System.out.println(p.mappa);
	}


}
