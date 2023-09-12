package collection;

import java.util.Deque;
import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.PriorityQueue;
public class DequeDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Deque<Integer> dq=new ArrayDeque();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);
		dq.add(60);
		Iterator it=dq.descendingIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

	}

}
