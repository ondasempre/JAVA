package bonus2;
import java.util.Arrays;

/**
 * Classe di collaudo dell'esercizio bonus #2 - Esonero 1
 * @author navigli
 *
 */
public class TestBonus2
{
	static final public int LUNGHEZZA = 16;
	
	static public void esito(String test, boolean bEsito)
	{
		String s = test;
		while(s.length() < LUNGHEZZA) s += " ";
		System.out.println(s+(bEsito ? "OK" : "NO"));
	}
	
	public static void main(String[] args)
	{
		Bonus2 b = new Bonus2();
		
		esito("cerca", b.cerca(new String[] { "a", "b", "c", "d" }, "c") == 2); 
		esito("cerca", b.cerca(new String[] { "a", "b", "c", "d" }, "x") == -1);
		
		String[] a1 = { "2", "3", "4", "5" };
		String[] a2 = {};
		b.sostituisci(a1, "4", "444");
		esito("sostituisci", a1[2].equals("444"));
		b.sostituisci(a2, "4", "444");
		esito("sostituisci", a2.length == 0);
		esito("fatt", b.fatt(0) == 1 && b.fatt(6) == 720);
		esito("numeroCaratteri", b.numeroCaratteri("abbaccaaaaefga", 'a') == 7);
		esito("moltiplica", b.moltiplica(new String[] { "1", "2", "3", "4", "5" }, 2, 4) == 60);
		esito("moltiplica", b.moltiplica(new String[] { "42", "2", "3", "4", "5" }, 0, 1) == 84);
		esito("contaStringhe", b.contaStringhe("devo studiare devo studiare devo studiare devo", "devo") == 4);
		esito("contaStringhe", b.contaStringhe("devodevo studiare devodevo studiare devo studiare devodevo", "devo") == 1);
		esito("contaStringhe", b.contaStringhe("", "copiare") == 0);
		esito("sommaDispari", b.sommaDispari(new String[] { "3.5", "2", "4", "4.4" }) == 6.4);
		esito("sommaDispari", b.sommaDispari(new String[] { "3.5" }) == 0.0);
		
		int[][] a = new int[5][5];
		b.setPitagorica(a, 4);
		esito("setPiragorica", a[2][3] == 12);
		esito("setPiragorica", a[2][4] == 0);
		
		boolean c[] = b.getDivisibili(10, 3);
		esito("getDivisibili", Arrays.toString(c).equals("[true, false, false, true, false, false, true, false, false, true]"));
		boolean d[] = b.getDivisibili(5, 20);
		esito("getDivisibili", Arrays.toString(d).equals("[true, false, false, false, false]"));
	}
}
