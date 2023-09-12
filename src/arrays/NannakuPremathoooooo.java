package arrays;
import java.util.*;
public class NannakuPremathoooooo
{
	 public static void main(String[] args)
	 {
	    //TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int temp=n;
	    for(int i=0;i<n;i++)
	    {
	      a[i]=sc.nextInt();
	    }
	    while(n%2==0)
	    {
	      n=n/2;
	    }
	    if(n==1)
	      System.out.println(a[0]);
	    else
	    {
	        int k=1;
	        n=temp;
	        while(k*2<=n)
	        {
	            k=k*2;
	        }
	        int res=Math.abs((n-k)*2+1);
	        System.out.println(a[res-1]);
	    }
	      
	}
}
