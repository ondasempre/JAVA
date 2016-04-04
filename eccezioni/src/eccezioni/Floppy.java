package eccezioni;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Floppy
{
	private byte[] dati;
	private int posizioneTestina;
	private boolean blocco;

	public Floppy()
	{
		this(1474560);
	}
	
	public Floppy(int i)
	{
		posizioneTestina = 0;
		dati = new byte[i];
	}

	public void setBloccoScrittura(boolean scrittura)
	{
		blocco = scrittura;
	}
	
	public byte[] leggi(int x) throws SpazioEsauritoException
	{
		if(posizioneTestina+x-1 > dati.length)
			throw new SpazioEsauritoException("Spazio esaurito...");
		
		byte[] letti = Arrays.copyOfRange(dati, posizioneTestina, posizioneTestina+x);
		posizioneTestina += x;
		
		return letti;
		
	}
	
	public void scrivi(byte[] bloccoDaScrivere)
	{
		
		if(blocco)
			throw new RuntimeException("Blocco scrittura attivo !!!");
		
		if(dati.length <= (dati.length - bloccoDaScrivere.length)-1)
			throw new IllegalArgumentException("Non c'è suff spazio per scrivere..."); 
		
		
		for(int i=0; i<bloccoDaScrivere.length; i++)
			dati[posizioneTestina+i] = bloccoDaScrivere[i];
		
		posizioneTestina += bloccoDaScrivere.length;
	}
	
	public void posizionaTestina(int i)
	{
		if(i > dati.length || i < 0)
			throw new RuntimeException("Posizione di lettura/scrittura non valida...riprova...");
		posizioneTestina = i;
	}
	
	public void posizionaTestinaInizio()
	{
		posizioneTestina = 0;
	}
	
	public void formatta()
	{
		if(blocco)
			throw new RuntimeException("Blocco scrittura attivo, rimuovilo per formattare ...");
		for(int i=0; i<dati.length; i++)
			dati[i] = 0;
		
	}
	
	
	public static void main(String[] args) throws SpazioEsauritoException
	{
		Floppy floppino = new Floppy();
		Floppy floppino1 = new Floppy(1474562);
		
		floppino.setBloccoScrittura(false);
		floppino.scrivi(new byte[] {1,2,3,4,5,6,7,8,9,10});
		
		//floppino.formatta();
		
		
		floppino.posizionaTestinaInizio();
		System.out.println(Arrays.toString(floppino.leggi(1474563)));
		
	}
	
	
}
