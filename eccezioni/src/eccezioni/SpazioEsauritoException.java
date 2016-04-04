package eccezioni;

public class SpazioEsauritoException extends Exception
{
	private String str;
	
	public SpazioEsauritoException(String str)
	{
		this.str = str;
	}
	
	@Override
	public String getMessage()
	{
		return super.getMessage();
	}
	
	
}
