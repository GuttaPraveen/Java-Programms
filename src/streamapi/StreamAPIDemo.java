package streamapi;

import java.util.List;

public class StreamAPIDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> list=List.of(15,20,35,40);
		int i=list.stream().filter(n->n%2==0).reduce(0,(a,sum)->a+sum);
		System.out.println(i);
		
		

	}

}
