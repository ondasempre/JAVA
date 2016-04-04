public class ValutaPofessori 
{
	/** Campo CV */
	private CV curriculumVitae;
	/**
	 * Costruttore per la classe ValutaProfessori
	 * 
	 * @param curriculumVitae
	 */
	public ValutaPofessori(CV curriculumVitae)
	{
		this.curriculumVitae = curriculumVitae;
	}
	
	/**
	 * Funzione che ritorna l'indice H che indica la popolarità del docente.
	 * 
	 * @return numero instero (indice h)
	 */
	public int getHIndex()
	{
		int h = 0;
		for (Pubblicazione p : curriculumVitae)
		{
			if (h < p.getCitazioni()) h++;
			else break;
		}
		return h;
	}
	
	public static void main(String[] args)
	{
		CV cv = new CV("Roberto Navigli");
		cv.aggiungiPubblicazione(new Pubblicazione("pub1", 10, "Mario Rossi", "Luigi Bianchi", "Giuseppe Verdi"));
		cv.aggiungiPubblicazione(new Pubblicazione("pub2", 100, "Mario Rossi", "Giuseppe Verdi"));
		cv.aggiungiPubblicazione(new Pubblicazione("pub3", 50, "Luigi Bianchi", "Mario Rossi"));
		cv.aggiungiPubblicazione(new Pubblicazione("pub4", 4, "Maria Neri", "Mario Rossi"));
		
		ValutaPofessori profEval = new ValutaPofessori(cv);
	
		System.out.println(profEval.getHIndex());
		
	}
}
