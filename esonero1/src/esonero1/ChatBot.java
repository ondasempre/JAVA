package esonero1;

import java.util.Scanner;

public class ChatBot
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("I am your charbot  ;-)");
		 	
		while(true)
		{
			String input = scanner.nextLine().toLowerCase();
			
			if(input.contains("esci")) break;
			else if(input.startsWith("ciao") || input.startsWith("hi") ) System.out.println("Hi, what is your name ?");
			else if( input.startsWith("how do") ) System.out.println("booo ;-)");
			else if( input.startsWith("bye") ) System.out.println("See you later...");
		}
		
	}

}
