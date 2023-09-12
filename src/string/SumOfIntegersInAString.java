package string;
import java.util.*;
public class SumOfIntegersInAString
{
	public static void main(String[] args)
	{
	    // TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    int sum=0;
	    for(int i=0;i<s.length();i++)
	    {
	      if(s.charAt(i)>='0' && s.charAt(i)<='9')
	        sum+=Character.getNumericValue(s.charAt(i));
	    }
	    System.out.println(sum);
	    

	  }
}
/*
	input : String s = A2B3C5
	output : sum = 10
*/