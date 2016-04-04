package localita;

public class Localita implements Comparable<Localita>
{
	private Double longi;
	private Double lat;
	private String nome;
	
	public Localita(String nome, double lat, double longi)
	{
		this.lat = lat;
		this.longi= longi;
		this.nome = nome;
	}

	public double getLongi()
	{
		return longi;
	}

	public void setLongi(double longi)
	{
		this.longi = longi;
	}

	public double getLat()
	{
		return lat;
	}

	public void setLat(double lat)
	{
		this.lat = lat;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(nome + ": (" + lat +  ";" + longi + ")");
		return sb.toString();
	}

	@Override
	public int compareTo(Localita l)
	{
		int tmp = nome.compareTo(l.getNome());
		int tmp1 = lat.compareTo(l.getLat());
		if(tmp == 0 && tmp1 != 0) return tmp1;
		if(tmp == 0 && tmp1 == 0) return longi.compareTo(l.getLongi());
		return tmp;
	}
	
}
