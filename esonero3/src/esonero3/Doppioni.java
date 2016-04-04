package esonero3;

public class Doppioni
{
	public String mangiaDoppioni(String s)
	{
		return mangiaDoppi(s, 0, "");
	}
	
	private String mangiaDoppi(String s, int i,  String s1)
	{
		if(i >= s.length())
			return s1;
		if(s1.length() == 0)
		{
			s1 += s.charAt(i);
			return mangiaDoppi(s, i+1, s1);
		}
		if(s.charAt(i) == s1.charAt(s1.length()-1))
			return mangiaDoppi(s, i+1, s1);
		s1 += s.charAt(i);
		return mangiaDoppi(s, i+1, s1);
		
	}
	
	public static void main(String[] args)
	{
		Doppioni d = new Doppioni();
		System.out.println(d.mangiaDoppioni("aaaiiiuuu"));
	}
}
