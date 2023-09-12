package collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Set {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]=new int[] {10,20,30,40,10,20};
		ArrayList al=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		System.out.println(al);
		Object o=0;
		for(int i=0;i<al.size();i++)
		{
			int count=0;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==al.get(j))
				{
					count++;
					al.set(j,0);
				}
			}
			if(count>0 && al.get(i)!=o)
				System.out.print(al.get(i)+" ");
		}
		
	}

}
