package streamapi;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class Sorted 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]=new int[] {10,30,50,20,10,30};
		//with out sort
		Arrays.stream(a).forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//with sort
		Arrays.stream(a).sorted().forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//distinct and sorting
		Arrays.stream(a).distinct().sorted().forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//sum of elements
		int sum=Arrays.stream(a).sum();
		System.out.print(sum);
		System.out.println();
		//Average
		OptionalDouble avg=Arrays.stream(a).average();
		System.out.print(avg);
		System.out.println();
		//even number
		Arrays.stream(a).filter(x->x%2==0).forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//min element and Max
		int min=Arrays.stream(a).min().getAsInt();
		int max=Arrays.stream(a).max().getAsInt();
		System.out.print(min+" "+max);
		System.out.println();
		//parallel stream
		Boolean b=Arrays.stream(a).parallel().isParallel();
		System.out.println(b);
		

	}

}
