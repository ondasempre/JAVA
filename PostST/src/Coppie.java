import java.util.TreeSet;

public class Coppie// implements Comparable<Coppie>
{
    private Integer x;
    private Integer y;
   
    public Coppie(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
/**
    @Override
    public int compareTo(Coppie c)
    {
        int tmp = x.compareTo(c.x);
       
        if(tmp==0) return y.compareTo(c.y);
        return tmp;
    }
   */
    @Override
    public String toString()
    {
        return "("+x +" ,"+y+")";
    }
   
    public static void main(String[] args)
    {
        Coppie c = new Coppie(10, 20);
        Coppie c1  =new Coppie(20, 10);
        Coppie c2 = new Coppie(10, 15);
        TreeSet <Coppie> t = new TreeSet<Coppie>();
        t.add(c);
        t.add(c1);
        t.add(c2);
        System.out.println(t);
    }
}