package esonero1;

public class Sommatoria
{
	
	public void sommatoria(int a, int b, int n)
	{
		int tmp = 0, i = 0;
		
		while(i<n+2)
		{
			tmp = a;
			a = b;
			b = a+tmp;
			System.out.print( i < n+1 ? tmp + ", " : tmp + "");
			i++; 
		}
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new Sommatoria().sommatoria(2, 3, 6);
	}

}
