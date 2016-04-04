package ricorsione;

public class Fibonacci
{
	
	public int fibonacci(int x)
	{
		if(x<2)
			return x;
		else
			return fibonacci(x-2) + fibonacci(x-1);
	}
	
	/** Metodo non interattivo */
	public int fib2(int n) 
	{
		  int fib1 = 1, fib2 = 0, f = fib1 + fib2;
		  if (n < 2)
		    return n;
		  else 
		  {
		    for (int i = 2; i < n; ++i) 
		    {
		      fib2 = fib1;
		      fib1 = f;
		      f = fib1 + fib2;
		    }
		    
		    return f;
		  }
		}
	
	
	public static void main(String[] args)
	{
		System.out.println(new Fibonacci().fibonacci(5));
		System.out.println(new Fibonacci().fib2(6));
	}
	
}
