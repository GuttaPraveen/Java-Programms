package collection;
import java.util.*;
public class SortStringArray 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s="Hello All Good Morning";
		String s1[]=s.split(" ");
		List<String> list=new ArrayList();
		for(int i=0;i<s1.length;i++)
		{
			list.add(s1[i]);
			
		}
		System.out.println(list);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
	}

}
