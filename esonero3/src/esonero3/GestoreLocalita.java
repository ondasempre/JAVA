package esonero3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.type.PrimitiveType;
/**
 * 
 * @author ondasempre
 *
 */
public class GestoreLocalita
{
    /** Lista delle Località */
	private ArrayList<Localita> localita = new ArrayList<Localita>();
	
	public GestoreLocalita(File file) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(file);
		scanner.useDelimiter("\t|\n");
		
		while(scanner.hasNext())
		{
			localita.add(new Localita(scanner.next(), scanner.nextInt(), scanner.nextInt()));
		}
		
		scanner.close();
		
	}
	
	@Override
	public String toString()
	{
		return localita.toString();
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		
		//File f = new File("mio_testo.txt");
		/**
		try
		{
			PrintWriter out = new PrintWriter(f);
			out.println("Ciao");
			out.close();
			
			
		} 
		catch ( Exception e )
		{
			
		}
		*/
 
		//System.out.println(localita);
	}
	
	
	
	
}
