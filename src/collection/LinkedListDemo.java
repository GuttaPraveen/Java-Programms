package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]=new int[] {5,8,24,2,11,32,27,21,53};
		LinkedList linkedList =new LinkedList();
		for(int i=0;i<a.length;i++)
		{
			linkedList.add(a[i]);
		}
		Iterator itr=linkedList.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		linkedList.removeFirst();
		linkedList.removeLast();
		linkedList.addFirst("Praveen");
		linkedList.addLast("Maha");
		Iterator itr1=linkedList.iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+" ");
		}
		
		

	}

}
