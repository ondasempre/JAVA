package ricorsione;

public class PalindromaRic
{
	public boolean isPalindroma(String s)
	{
		return isPalindroma(s, 0, s.length()-1);
	}
	public boolean isPalindroma(String s, int a, int b)
	{
		if(a >= b) return true;
		return s.charAt(a) == s.charAt(b) && isPalindroma(s, a+1, b-1);
	}

	public static void main(String[] args)
	{
		System.out.println(new PalindromaRic().isPalindroma("ama"));
	}
}
