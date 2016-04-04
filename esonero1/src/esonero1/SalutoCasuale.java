package esonero1;

import java.math.*;

public class SalutoCasuale
{
	public void sayHello()
	{
		String hello = null;
		
		switch( (int)Math.random()*3+1 )
		{
		case 0: hello = "hello"; break;
		case 1: hello = "ciao"; break;
		case 2: hello = "bye"; break;
		
		default:  hello = "sevedemo!";	break;
		}
	
			System.out.println(hello);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		new SalutoCasuale().sayHello();

	}

}
