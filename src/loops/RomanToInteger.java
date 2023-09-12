package loops;

import java.util.*;

public class RomanToInteger {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		LinkedHashMap<Character,Integer> lhm=new LinkedHashMap();
		lhm.put('I', 1);
		lhm.put('V', 5);
		lhm.put('X', 10);
		lhm.put('L', 50);
		int sum=0,i=0;
		for(i=0;i<s.length()-1;)
		{
			if(lhm.containsKey(s.charAt(i)))
			{
				if(lhm.get(s.charAt(i))<lhm.get(s.charAt(i+1)))
				{
					sum=sum+lhm.get(s.charAt(i+1))-lhm.get(s.charAt(i));
					i=i+2;
				}
				else
				{
					sum+=lhm.get(s.charAt(i));
					i=i+1;
				}
			}
		}
		if(i!=s.length()-1)
		{
			System.out.println(sum);
		}
		else
		{
			sum+=lhm.get(s.charAt(i));
			System.out.println(sum);
		}
		
		

	}

}
