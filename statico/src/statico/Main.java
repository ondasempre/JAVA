package statico;

public class Main {
	
	// array statico accessibile con la dicitura Main.array[]
	private static int[] array = {1,2,3,4,5}; 
	
	public Main()
	{
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		
		while(i < Main.array.length)
		{
			System.out.print(Main.array[i] + " ");
			i++;
		}
		System.out.println();
	}

}
