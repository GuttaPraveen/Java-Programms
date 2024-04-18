package streamapi;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class BiPredicateDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer> p=(a,b)->(a+b)%2==0;
		System.out.println(p.test(10,21));
		
		//Primitive predicate 
		int a[]=new int[] {10,20,30,40,50,60};
		Predicate<Integer> p1=i->i%2==0;
		
		//IntPredicate
		System.out.println("Int Predicate: ");
		IntPredicate ip=i->i%2==0;
		
		for(int x1:a)
		{
			if(ip.test(x1))
			{
				System.out.print(x1+" ");
			}
		}
		
		

	}

}
