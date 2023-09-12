package collection;
import java.util.*;
public class AddAll
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,3,4};
		List list=Arrays.asList(a);
		list.add(10);
		list.add(20);
		list.add(30);
		List list1=new ArrayList();
		list1.add(40);
		list1.add(400);
		list1.addAll(list);
		System.out.println(list);

		
		

	}

}
