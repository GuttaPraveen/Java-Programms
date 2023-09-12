package string;
import java.util.*;
public class RepeatedWords 
{
	public static void main(String[] args) 
	  {
	    // TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a String: ");
	    String s=sc.nextLine();
	    String s1[]=s.split(" ");
	    System.out.println(Arrays.toString(s1));
	    for(int i=0;i<s1.length;i++)
	    {
	      int count=0;
	      for(int j=i+1;j<s1.length;j++)
	      {
	        if(s1[i].equals(s1[j]))
	        {
	          count++;
	          s1[j]="";
	        }
	          
	      }
	      if(count>0)
	        System.out.print(s1[i]+" ");
	      
	    }
	    

	  }

}
/*
	     input = "big black bug bit a big black dog on his big black nose"; 
	     output = "big black" 
*/
