package esonero3;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.HTML.Tag;
import javax.swing.text.html.HTMLDocument.Iterator;

public class MyArrayIterabile implements Iterable
{
	private String a[];
	
	public MyArrayIterabile(String ... a)
	{
		this.a = a;
	}

	@Override
	public java.util.Iterator iterator()
	{
		return new ArrayItarator();
	}
	
	private class ArrayItarator implements java.util.Iterator<String>
	{

		@Override
		public boolean hasNext()
		{
			return false;
		}

		@Override
		public String next()
		{
			return null;
		}

		@Override
		public void remove()
		{
			
		}
		
		public void reset()
		{
			
		}
		
		
	}
	
	

}
