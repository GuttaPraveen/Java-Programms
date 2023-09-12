package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Collection2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello");
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(15);
		l.add(11);
		l.add(17);
		l.add(19);
		l.add(22);
		l.add(33);
		l.set(2,76);
		Iterator<Integer> it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		ListIterator lit=l.listIterator();
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		

	}

}
