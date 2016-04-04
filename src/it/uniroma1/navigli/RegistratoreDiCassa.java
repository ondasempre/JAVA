package it.uniroma1.navigli;

public class RegistratoreDiCassa
{
	private double importoDovuto;
	private double importoPagato;
	
	public void inserisciArticolo(double prezzo)
	{
		importoDovuto += prezzo;
	}
	
	public void paga(double somma)
	{
		importoPagato = somma;
	}
	
	public double getResto() { return importoPagato-importoDovuto; }
}
