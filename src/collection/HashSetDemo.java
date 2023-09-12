package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet();
		hs.add("Praveen");
		hs.add("Maha");
		hs.add("Vijaya");
		System.out.println(hs);
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		

	}

}
