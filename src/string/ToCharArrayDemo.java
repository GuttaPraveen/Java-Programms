package string;
import java.util.*;
public class ToCharArrayDemo
{
	 public static void main(String[] args) 
	  {
	    // TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();// hello
	    char ch[]=s.toCharArray();// Converts String into Character Array
	    Arrays.sort(ch);
	    System.out.println(Arrays.toString(ch));//[e, h, l, l, o]
	    int vow=0,cons=0;
	    for(int i=0;i<ch.length;i++)
	    {
	      if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' ||ch[i]=='O' || ch[i]=='U' ||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
	    	  vow++;
	  
	      else
	        cons++;
	    }
	    System.out.println("Vowels Are : "+vow+" Consonants are : "+cons);
	    

	  }
}
