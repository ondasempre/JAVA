/**
 * Classe di collaudo per la classe Lista
 * @author navigli
 *
 */
public class TestLista
{
	public static void main(String[] args)
	{
		// testa add
		Lista l1 = new Lista();
		l1.add("a");
		l1.add("c");
		
		Lista l2 = new Lista();
		l2.add("questa");
		l2.add("è");
		l2.add("una");
		l2.add("lista");
	
		//System.out.println(l1);
		//System.out.println(l2);
		
		// testa equals
		if (l1.toString().equals("[ a, c ]")) System.out.println("equals   OK");
		else System.out.println("equals   NO");
		if (l2.toString().equals("[ questa, è, una, lista ]")) System.out.println("equals   OK");
		else System.out.println("equals   NO");
		if (!l1.equals(l2)) System.out.println("equals   OK");
		else System.out.println("equals   NO");
		if (new Lista().equals(new Lista())) System.out.println("equals   OK");
		else System.out.println("equals   NO");

		// testa contains
		if (l1.contains("a")) System.out.println("contains OK");
		else System.out.println("contains NO");
		if (!l1.contains("b")) System.out.println("contains OK");
		else System.out.println("contains NO"); 
		if (!l2.contains("un")) System.out.println("contains OK");
		else System.out.println("contains NO");
		if (l2.contains("una")) System.out.println("contains OK");
		else System.out.println("contains NO");
		
		// testa addFirst
		l1.addFirst("b");
		if (l1.toString().equals("[ b, a, c ]")) System.out.println("addFirst OK");
		else System.out.println("addFirst NO");
		
		// testa clear
		l1.clear();
		l1.add("a");
		if (l1.toString().equals("[ a ]")) System.out.println("clear    OK");
		else System.out.println("clear    NO");

		// testa remove
		l1.add("b");
		l1.add("d");
		l1.remove("b");
		if (l1.toString().equals("[ a, d ]")) System.out.println("remove   OK");
		else System.out.println("remove   NO");
		
	}
}
