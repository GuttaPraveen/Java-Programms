package collection;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
public class Add
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList();
		list.add(19);
		list.add(20);
		list.add(21);
		list.add(20);
		System.out.println(list);
		List<String> list1=new ArrayList();
		list1.add("Sahithi"+ "");
		list1.add("saisri");
		list1.add("20");
		System.out.println(list1);
		Iterator it=list1.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		
		
		

	}

}
