package coda;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InvetiCoda
{
	private Queue<Integer> q = new LinkedList<Integer>();
	
	public void inverti( Queue<Integer> q )
	{
		Stack<Integer> s = new Stack<Integer>();
		
		while(!q.isEmpty())
		{
			Integer e = q.remove();
			s.push(e);
		}
		
		while(!s.isEmpty())
		{
			q.add(s.pop());
		}
	}
	

	public static void main(String[] args)
	{
		

	}

}
