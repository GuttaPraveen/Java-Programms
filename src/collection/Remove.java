package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List list=new ArrayList(Arrays.asList(10,20,30,40));
		List list1=new ArrayList();
		list1.addAll(list);
		//System.out.println(list.remove(1));
		boolean b=list1.remove(list);
		System.out.println(b);
		System.out.println(list);
		System.out.println(list1);

	}

}
