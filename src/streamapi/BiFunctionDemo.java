package streamapi;

import java.util.function.BiFunction;

public class BiFunctionDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer> f=(a,b)->a*b;
		System.out.println(f.apply(10,30));

	}

}
