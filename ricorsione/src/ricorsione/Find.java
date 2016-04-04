package ricorsione;

import java.io.File;
import java.io.FilenameFilter;

public class Find
{

	public void cartelle(File file, String nome)
	{
		File[] elencoFile;
		
		if(file.isFile() && file.getName().contains(nome))
		{
			System.out.println(file.toString());
		}
		else if(file.isDirectory() && file.listFiles() != null)
		{
			//System.out.println(file.toString());
			elencoFile = file.listFiles();
			
			for(int i=0; i<elencoFile.length; i++)
				if(elencoFile[i] != null)
					cartelle(elencoFile[i], nome);
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		   Find trova = new Find();
		   File file = new File("C:\\Users\\ondasempre");	   
		   trova.cartelle(file, ".txt");
	}
	
}
