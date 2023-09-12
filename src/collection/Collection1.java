package collection;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Collection1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			List al=new ArrayList<>();
			al.add(10);
			al.add(30.40);
			al.add("Hello");
			al.add('p');
			System.out.println(al);
			System.out.println(al.get(3));
			System.out.println(al.get(1));
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
			}
			Set<String> set=new HashSet<>();
			set.add("Good");
			set.add("Morning");
			set.add("Evening");
			
			
	}
}
/*
	A group of objects represents as a single unit is called "Collection"
*/