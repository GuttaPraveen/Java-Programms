package arrays;
import java.util.*;
public class insertElement
{
	
		public static void main (String[] args)
	    {
			// TODO Auto-generated method stub
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();//4
	        int m=sc.nextInt();//1
	        int k=sc.nextInt();//3
	        int a[]=new int[n];
	        for (int i=0;i<n ;i++) 
	            a[i]=sc.nextInt();//2 4 5 6
	        for(int i=a.length-1;i>m;i--)
	        {
	            a[i]=a[i-1];//        2 3 4 5
	        }
	        a[m]=k;
	        System.out.println(Arrays.toString(a));
	       
	       
	        
	        
	    }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
