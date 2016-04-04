package error;

import java.util.Random;

public class Errore
{
	
	public Errore()
	{
		
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n = Integer.parseInt("42");
		//int p = Integer.parseInt("uno");
		//int b = Integer.parseInt("ciao");
		
		
		String s = "Quarantadue : " + n;
		int len = s.length();
		System.out.println(len);
		System.out.println(s.toString());		
		
		int x = 'a';
		System.out.println("Intero da char:  " + x);
		
		
		// Errore di sintassi
		// String pippo = 5 +'a';
		
		// Errore di sintassi
		// int k = (double) 5;
		int ran = (int)(Math.random()*10);
		System.out.println("Numero random:  " + ran);
		
		double b = (int) 5.3;	
		char a = 97;
	//	double d = (double)"5.2";
		System.out.println(a);
	}

}
