package it.uniroma1.navigli;

public class Punto
{
	private double x;
	private double y;
	private double z;
	
	public Punto(double cx, double cy, double cz)
	{
		x = cx;
		y = cy;
		z = cz;
	}
	
	public double getX() { return x; }
	public double getY() { return y; }
	public double getZ() { return z; }
}
