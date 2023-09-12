package string;
import java.util.*;
public class MultiplyOfIntegersInAString 
{
	public static void main(String[] args)
	{
	    // TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    int pro=1;
	    for(int i=0;i<s.length();i++)
	    {
	    	if(s.charAt(i)>='0' && s.charAt(i)<='9')
	    		pro*=Character.getNumericValue(s.charAt(i));
	    	//System.out.println(pro);
	    }
	    System.out.println(pro);

	  }

}
//A11B9C11
