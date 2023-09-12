package collection;

import java.util.ArrayList;
import java.util.List;

public class Clear
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		List list1=new ArrayList();
		list1.add(40);
		list1.add(400);
		list1.addAll(2,list);
		System.out.println(list1);
		list1.clear();

	}

}
