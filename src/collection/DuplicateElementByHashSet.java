package collection;
import java.util.*;
import java.util.Set;
import java.util.LinkedHashSet;
public class DuplicateElementByHashSet
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,3,4,5,1,3,5,7,9,4};
		List<Integer> list=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
		}
		Set set=new LinkedHashSet();
		for(Integer i:list)
		{
			//System.out.print(set.add(i)+" ");//true true true true true false false false true true false 
			if(set.add(i)==false)
				System.out.print(i+" ");
		}
		

	}

}
