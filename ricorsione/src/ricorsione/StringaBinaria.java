package ricorsione;

import java.util.ArrayList;

public class StringaBinaria
{
    private String stringa;
   
    public StringaBinaria(String s)
    {
        stringa = s;
    }
   
    public ArrayList<String> espandi() // ho usato l'arrayList per comodità
    {
        ArrayList<String> als  = new ArrayList<String>();
        als.add("");
        return espandi(als, 0);
    }
   
    private ArrayList<String> espandi(ArrayList<String> als, int i)
    {
        if(i==stringa.length()) //caso base
        return als;
       
        /*
         * se carattere corrente non è * allora crea nuovo arrayList
         * aggiunge a tutte le stringhe nell'array il numero corrente
         * e le butta nell'arrayList nuovo
         */
        if(stringa.charAt(i)!= '*')
        {
            ArrayList<String> al = new ArrayList<String>();
            for(String s : als)
            {
                al.add( s += stringa.charAt(i) );
            }
            return espandi(al, i+1);
        }
       
        /*
         * altrimenti ti ritrovi in questo caso e viene creato un nuovo array dove
         * ad stringa nell'array viene aggiunto prima 0 poi 1 e messo nell'arrayList nuovo
         */
        ArrayList<String> a = new ArrayList<String>();
        for(String s : als)
        {
            a.add(s.concat("0"));
            a.add(s.concat("1"));
        }
        return espandi(a, i+1);
    }
    
    public static void main(String[] args)
    {
        StringaBinaria sb = new StringaBinaria("**");
        System.out.println(sb.espandi().toString());
    }
}