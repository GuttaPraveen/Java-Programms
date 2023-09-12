package string;
import java.util.*;
public class CompareToIgnoreCase
{
	public static void main(String[] args)
	  {
	    // TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    String s1=sc.next();
	    System.out.println(s.compareToIgnoreCase(s1));//

	  }

}
/*
	   Apple.compareToIgnoreCase("apple"); // 0
	   
	   Hello.compareToIgnoreCsae("HELLO"); //0
*/
