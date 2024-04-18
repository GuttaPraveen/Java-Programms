package streamapi;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class FunctionDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Function<String,Integer> f=s->s.length();
		System.out.println(f.apply("Praveen"));
		
		Function<String,String> concat=s1->s1.concat(" Praveen");
		System.out.println(concat.apply("Gutta"));
		
		String s[]= {"apple","orange","mango"};
		Function<String,String> concat1=s1->s1.concat(" fruit");
		for(String s1:s)
		{
			System.out.println(concat1.apply(s1));
		}
		//Auto unboxing
		Function<Integer,Integer> mul=i->i*i;
		System.out.println(mul.apply(10));
		//Autoboxing
		IntFunction<Integer> mul1=i->i*i;
		System.out.println(mul1.apply(13));
		
		Function<String,Integer> len=w->w.length(); 
		System.out.println(len.apply("Praveen"));
		ToIntFunction<String> len1=w1->w1.length();
		System.out.println(len1.applyAsInt("Ravana"));

		Function<Integer,Double> f4=i->Math.sqrt(i);
		System.out.println(f4.apply(6));
		IntToDoubleFunction f5=n->Math.sqrt(n);
		System.out.println(f5.applyAsDouble(25));
		
		
		
		
	}

}
/*  If we want to filter the data i.e:  out of 'n' elements the result may be n or n-1 or n-2
	ex: list - 10 elements, atre 10 filter apply then 10 or 5 or 3 elements e.t.c
	
	If we dont filter the data and the logic should apply to all elements.
	
	i/p is 'n' elements --- apply some logic  ----  o/p 'n' elements with resultant outut 
	
*/