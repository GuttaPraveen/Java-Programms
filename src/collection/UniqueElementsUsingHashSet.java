package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
public class UniqueElementsUsingHashSet 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]=new int[] {2,9,3,0,8,3,3,2,9,1};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		System.out.println(hs);
		List<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,3,3,2));
		Set<Integer> set=new HashSet<Integer>(al);
		System.out.println(set);
		
	}

}
