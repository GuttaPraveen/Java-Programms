package assesment;

import java.util.*;

public class RemDupuplicate
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashSet set=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(i);
		}
		System.out.println(set);
		

	}

}
