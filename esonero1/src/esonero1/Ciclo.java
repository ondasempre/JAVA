package esonero1;

public class Ciclo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.println("Piramide al contrario: ");
		System.out.println();
		
		for(int i=0; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		System.out.println("Pari e dispari: ");
		System.out.println();
		
		for(int i=0; i<=3; i++)
		{
			for(int j=1; j<=9; j++)
				if(j%2==0) System.out.print("*");
				else System.out.print("$");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Scacchiera: ");
		System.out.println();
		
		for(int i=0; i<=3; i++)
		{
			for(int j=1; j<=5; j++)
				if((i+j)%2==0) System.out.print("#");
				else System.out.print("$");
			System.out.println();
		}
	}

}
