package streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class EliminateDuplicateEle
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a[]=new int[] {1,2,3,4,5,3,2,6,7,8,6};
		List<Integer> list=List.of(1,2,3,4,5,3,2,6,7,8,6);
		HashSet<Integer> set= new HashSet();
		list.removeIf(e->!set.add(e));
		System.out.println(list);
		
	Arrays.stream(a).distinct().forEachOrdered(e->System.out.println(e));
		
		
		

	}

}
