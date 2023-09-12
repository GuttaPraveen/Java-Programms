package arraylistprogramms;
import java.util.*;
public class SumOfArrayListObjects
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		int sum=0;
		for(Integer i:al)
		{
			sum+=i;
		}
		System.out.println(sum);

	}

}
