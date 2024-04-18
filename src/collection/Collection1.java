package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
			
			
			//a[]=10,30,20,30,50,60,20,10,40
			//10,30,20,50,60,40
			int a[]=new int[]{10,30,20,30,50,60,20,10,40};
//			HashSet<Integer> lhs=new HashSet();
//			for(int a1:a)
//			{
//				lhs.add(a1);
//			}
//			System.out.println(lhs);
			ArrayList<Integer> arrayList=new ArrayList();
			for(int a1:a)
			{
				if(!arrayList.contains(a1))
				{
					arrayList.add(a1);
				}
			}
			System.out.println(arrayList);
			Map<String,String>map=new LinkedHashMap();
			map.put("name","Sahithi");
			
			System.out.println(map);
			
			
			
			
	}
}
/*
	A group of objects represents as a single unit is called "Collection"
*/