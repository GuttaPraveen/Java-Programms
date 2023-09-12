package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MaxEleInAnArray 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,3,45,1,2,56,3,4,7,561,2,3,4,45};
		List list=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
		}
		System.out.println("The max element is: "+Collections.max(list));
		

	}

}
