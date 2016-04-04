package esonero3;

public class MangiaDoppioni
{
	
	private String str;
	
	public MangiaDoppioni(String str)
	{
		this.str = str;
	}
	
	public String mangia()
	{
		return mangia(0, '\0');
	}
	/** Mangia i caratteri uguali */
	public String mangia(int k, char prec)
	{
		if(str.length() == k) return "";
		char c = str.charAt(k);
		return (c == prec ? "" : c ) + mangia(k+1,c);
	}
	
	public static void main(String[] args)
	{
		System.out.println(new MangiaDoppioni("aiiiiuuuooolaaaaaa").mangia());
		
	}

}
