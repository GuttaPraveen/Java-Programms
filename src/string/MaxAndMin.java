package string;
import java.util.*;
public class MaxAndMin
{
	public static void main(String[] args)
	  {
	    //TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String s1[]=s.split(" ");
	    int max1=s1[0].length();
	    int max2=s1[0].length();
	    int index=0;
	    for(int i=1;i<s1.length;i++)
	    {
	      if(max1<s1[i].length())
	      {      
	    	 max2=max1;
	    	 max1=s1[i].length();
	      }
	      else if(max1==max2 || max2 <s1[i].length() && max1 >s1[i].length() )
	      {
	        max2=s1[i].length();
	        index=i;
	      }
	    }
	    System.out.println(index);
	    System.out.println(s1[index]+" Having second maximum length is "+max2);
	    

	  }
}
