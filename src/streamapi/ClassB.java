package streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ClassB 
{
	void show()
	{
		System.out.println("Implementing set class");
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(40);
		al.add(30);
		al.add(50);
		al.add(20);
		System.out.println(al);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("------------");
		Collections.sort(al);
		TreeSet<Integer> set=new TreeSet();
		System.out.println(set);
		
	}
	static void m2()
	{
		System.out.println("Static method referencing");
	}
	ClassB()
	{
		this(5000);
		System.out.println("Constructor referencing");
		
	}
	ClassB(int y)
	{
		System.out.println("Parameterized Constrctor referencing "+y);
	}
	

}
